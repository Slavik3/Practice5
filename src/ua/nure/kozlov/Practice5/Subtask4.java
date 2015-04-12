package ua.nure.kozlov.Practice5;

import java.util.Date;
import java.util.Scanner;

public class Subtask4 {
	public static void main(String[] args) {
		myThread4 shadule = new myThread4();
		shadule.setDaemon(true);
		shadule.start();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			scanner.nextLine();
			System.exit(-1);
		}
	}
}

class myThread4 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println(new Date());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}