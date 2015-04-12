package ua.nure.kozlov.Practice5;

public class Subtask5 {
	private static final int NUM_OF_THREDS = 2;

	public static void main(String[] args) {
		Counter c = new Counter();
		for (int i = 0; i < NUM_OF_THREDS; i++) {
			CountThread thread = new CountThread(c);
			thread.start();
		}
	}
}

class Counter {
	private int count1;
	private int count2;

	public int getCount1() {
		return count1;
	}

	public void setCount1(int count1) {
		this.count1 = count1;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}

	public void inkrementCount1() {
		setCount1(getCount1() + 1);
	}

	public void inkrementCount2() {
		setCount2(getCount2() + 1);
	}
}

class CountThread extends Thread {
	private final static int NUM_OF_ITARATIOMS = 10;
	private Counter c;

	public CountThread(Counter c) {
		this.c = c;
	}

	@Override
	public void run() {
		synchronized (c) {
			for (int i = 0; i < NUM_OF_ITARATIOMS; i++) {
				if (c.getCount1() == c.getCount2()) {
					System.out.println("развны");

				} else
					System.out.println("не развны");
				c.inkrementCount1();
				try {
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				c.inkrementCount2();
			}
		}
	}
}
