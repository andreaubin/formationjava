package demothread;

public class ExempleThread implements Runnable {

	String nom;
	int maxIter = 1000;
	int direction;

	public ExempleThread(String nom, int direction) {
		this.nom = nom;
		this.direction = direction;
	}

	@Override
	public void run() {
		System.out.format("Ici le  thread %s, je debute!\n", nom);
		for (int i = 0; i < maxIter; i++) {
			System.out.format("[%s] dit %d\n", nom, (maxIter - 1) * ((1 - direction) / 2) + direction * i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}

	}

	public static void main(String[] args) {
		ExempleThread objetA = new ExempleThread("TA", 1);
		Thread TA = new Thread(objetA);
		ExempleThread objetB = new ExempleThread("TB", -1);
		Thread TB = new Thread(objetB);
		TA.start();
		TB.start();
		System.out.format("Thread principal terminé  !\n");
	}
}
