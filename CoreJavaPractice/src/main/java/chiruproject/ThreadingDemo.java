package chiruproject;

class Hi implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class Hello implements Runnable {
	public void run() {
		for (int j = 1; j <= 4; j++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class ThreadingDemo {
	public static void main(String[] args) {
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
	}

}
