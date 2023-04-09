package temp;

public class Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("thread:::1");
		MyThread t2 = new MyThread();
		t2.setName("thread::::2");

		t1.start();
		t2.start();
	}
}
