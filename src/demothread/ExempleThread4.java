package demothread;

public class ExempleThread4 {

	public static void main(String args[]) {
		Thread threadsD[] = new Thread[20];
		Thread threadsR[] = new Thread[20];

		Compte compte = new Compte(0);

		for (int j = 0; j < 20; j++) {
			threadsD[j] = new Thread(new ThreadDeposer(j, compte));
			threadsD[j].setName(j + "");
			threadsR[j] = new Thread(new ThreadRetirer(j + 20, compte));
			threadsR[j].setName((j + 20) + "");
		}

		for (int j = 0; j < 20; j++) {
			threadsD[j].start();
			threadsR[j].start();
		}

		try {
			for (int j = 0; j < 20; j++) {
				threadsD[j].join();
				threadsR[j].join();
			}
		} catch (Exception e) {
		}

		System.out.print("Solde : " + compte.consulter() + " ");
		System.exit(0);

	}

}

class Compte {
	private double solde;

	Compte(double i) {
		solde = i;
	}

	synchronized void deposer(double montant) {
		String curNumber = (Thread.currentThread()).getName();
		System.out.println(curNumber + " DEBUT deposer " + solde);
		solde = solde + montant;
		notify();
		System.out.println(curNumber + " |---- deposer ");
	}

	synchronized void retirer(double montant) {
		String curNumber = (Thread.currentThread()).getName();
		System.out.println(curNumber + " DEBUT retirer " + solde);
		try {
			while (solde < montant)
				wait();
		} catch (Exception e) {
		}
		solde = solde - montant;
		System.out.println(curNumber + " |---- retirer ");
	}

	synchronized double consulter() {
		return solde;
	}
}

/**
 * Thread qui depose
 */
class ThreadDeposer implements Runnable {
	public int number;
	private Compte exI;

	public ThreadDeposer(int number, Compte i) {
		this.number = number;
		exI = i;
	}

	public void run() {
//		for (int j = 0; j < 10; j++) {
			exI.deposer(10.0);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
	}
}

/**
 * Thread qui retire
 */
class ThreadRetirer implements Runnable {
	private int number;
	private Compte exI;

	public ThreadRetirer(int number, Compte i) {
		this.number = number;
		exI = i;
	}

	public void run() {
//		for (int j = 0; j < 10; j++) {
			exI.retirer(10.0);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
	}
}
