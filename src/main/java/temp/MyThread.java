package temp;
public class MyThread extends Thread {
    private static volatile int counter = 0;

    public void run() {
        for (int i =0; i < 10; i++) {
            counter++;
            System.out.println("Thread " + Thread.currentThread().getName() + " counter: " + counter);
        }
    }
}

