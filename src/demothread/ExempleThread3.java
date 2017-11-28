package demothread;

public class ExempleThread3 extends Thread {

	private String toSay;
	private int toWait;
	private int number;

	public ExempleThread3(int number, String toSay, int toWait) {
		this.toSay = toSay;
		this.toWait = toWait;
	}

	public void run() {
		try {
			sleep(toWait);
		} catch (Exception e) {
		}
		System.out.print(toSay);
	}

	public static void main(String args[]) {
		ExempleThread3 thread1, thread2, thread3;
		thread1 = new ExempleThread3(1, "AAAAA ", 5000);
		thread2 = new ExempleThread3(2, "BBBBB ", 2000);
		thread3 = new ExempleThread3(3, "CCCCC ", 4000);

		thread1.start();
		thread2.start();
		thread3.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (Exception e) {
		}

		System.exit(0);

	}

}
