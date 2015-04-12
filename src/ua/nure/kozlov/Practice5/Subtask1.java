package ua.nure.kozlov.Practice5;

public class Subtask1 {
	public static void main(String[] args) {
		NameThread t = new NameThread();
		t.start();
		Thread t2 = new Thread(new myRunnable());
		t2.start();
	}
}

class NameThread extends Thread {
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		long stop = 0;
		boolean time = true;
		while (time) {
			System.out.println(getName());
			try {
				sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stop = System.currentTimeMillis();
			if ((stop - start) > 5000) {
				Thread.currentThread().interrupt();
				time = false;
			}
		}
	}
}

class myRunnable implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		long start = System.currentTimeMillis();
		long stop = 0;
		boolean time = true;
		while (time) {
			System.out.println(name);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stop = System.currentTimeMillis();
			if ((stop - start) > 5000) {
				Thread.currentThread().interrupt();
				time = false;
			}
		}
	}
}
