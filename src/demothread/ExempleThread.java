package demothread;

public class ExempleThread extends Thread {

	private String phrase;

	public ExempleThread(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i < 1000; i++) {
				System.out.println(i + " " + phrase);
				sleep(200);
			}

		} catch (InterruptedException e) {
		}

	}

	public static void main(String args[]) {
		ExempleThread thread1, thread2, thread3;
		thread1 = new ExempleThread("ThreadA ");
		thread2 = new ExempleThread("ThreadB ");
		thread3 = new ExempleThread("ThreadC ");

		thread1.start();
		thread2.start();
		thread3.start();

		try {
			sleep(200);
		} catch (InterruptedException e) {
		}
		System.exit(0);

	}

}
