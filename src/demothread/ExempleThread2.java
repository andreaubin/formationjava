package demothread;

public class ExempleThread2 extends Thread {

	private String phrase;
	private int waitTime;

	public ExempleThread2(int number, String toSay, int toWait) {
		this.phrase = toSay;
		this.waitTime = toWait;
	}

	public void run() {

		try {
			sleep(waitTime);
		} catch (Exception e) {
		}
		System.out.print(phrase);

	}

	public static void main(String args[]) {
		ExempleThread2 thread1, thread2, thread3;
		thread1 = new ExempleThread2(1, "AAAAA ", 40);
		thread2 = new ExempleThread2(2, "BBBBB ", 25);
		thread3 = new ExempleThread2(3, "CCCCC ", 50);

		thread1.start();
		thread2.start();
		thread3.start();

		System.exit(0);

	}

}
