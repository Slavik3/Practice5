package ua.nure.kozlov.Practice5;

import java.util.ArrayList;
import java.util.List;

public class Subtask6 {
	public static void main(String[] args) {
		List<Thread> list = new ArrayList<Thread>();
		for (int i = 0; i < 100; i++) {
			MyThread6 thread = new MyThread6();
			thread.start();
			list.add(thread);
		}
		System.out.println(countAliveThreads(list));
	}

	public static int countAliveThreads(List<Thread> list) {
		int count = 0;
		for (Thread thread : list)
			if (thread.isAlive())
				count++;
		return count;
	}
}

class MyThread6 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {

		}
	}
}