package ua.nure.kozlov.Practice5;

public class Subtask2 {
	public static void main(String[] args) {
		long[] time = new long[] { 1000, 2000, 1000, 1000 };
		String[] arr = new String[] { "ert", "wert", "rty", "etry" };
		MyShadule shadule = new MyShadule(time, arr);
		shadule.printMessages();
	}
}

class MyShadule {
	private long[] time;
	private String[] messages;

	public MyShadule(long[] time, String[] messages) {
		if (time.length != messages.length) {
			throw new IllegalArgumentException();
		}

		this.time = time;
		this.messages = messages;
	}

	public void printMessages() {
		for (int i = 0; i < time.length; i++) {
			try {
				Thread.sleep(time[i]);
				System.out.println(messages[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}