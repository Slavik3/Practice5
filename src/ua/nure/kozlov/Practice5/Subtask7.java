package ua.nure.kozlov.Practice5;

import java.io.IOException;

public class Subtask7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process process = Runtime.getRuntime().exec("notepad.exe");
		WatingThread wt = new WatingThread(5000);
		wt.start();
		wt.join(0);
		process.destroy();
	}
}

class WatingThread extends Thread {
	private long SLIPING_TIME = 10;
	private long time;

	public WatingThread(int time) {
		this.time = time;
	}

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < time) {
			try {
				sleep(SLIPING_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}