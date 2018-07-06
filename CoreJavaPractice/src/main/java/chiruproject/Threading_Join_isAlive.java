package chiruproject;

public class Threading_Join_isAlive {
	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Hi" + " " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}, "Hi Thread"); // to set the name of thread

		Thread t2 = new Thread(() -> {
			for (int j = 1; j <= 3; j++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}, "Hello Thread");

		// System.out.println(t1.getName()); // to see the thread name.
		// System.out.println(t2.getName());

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();

		System.out.println(t1.isAlive()); // use isAlive method to check whether the thread is running or not.
		t1.join(); // use join method to tell main thread to wait untill t1 and t2 donw with their
					// jobs
		t2.join();

		System.out.println(t1.isAlive()); // use isAlive method to check whether the thread is running or not.

		System.out.println("Bye!!"); // main thread task
	}

}
