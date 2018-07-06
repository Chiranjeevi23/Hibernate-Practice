package chiruproject;

class Counter {
	int count;

	public synchronized void increment() {
		// synchronized means "thread safe", that means
		// when t1 is executing, t2 will wait until t1 finishes its job
		// and when t2 is executing t1 wont intefere t2 ..so the above method is thread
		// safe
		count++;
	}
}

public class ThreadSynchronization {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		t1.start();
		t1.join();

		t2.start();
		t2.join();

		System.out.println("count " + c.count);

	}

}
