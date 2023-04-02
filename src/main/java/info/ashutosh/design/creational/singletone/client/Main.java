package info.ashutosh.design.creational.singletone.client;

import info.ashutosh.design.creational.singletone.service.Singleton;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Singleton instance = Singleton.getInstance();
		System.out.println(Thread.currentThread().getName() +" : Instance HashCode: " + instance.hashCode());
		System.out.println(Thread.currentThread().getName() +" : Instance HashCode: " + instance.hashCode());

		Thread thread1 = new Thread(() -> {
			Singleton instance1 = Singleton.getInstance();
			Singleton instance2 = Singleton.getInstance();
			System.out.println(Thread.currentThread().getName() +" : Instance HashCode: " + instance1.hashCode());
			System.out.println(Thread.currentThread().getName() +" : Instance HashCode: " + instance2.hashCode());
		});
		Thread thread2 = new Thread(() -> {
			Singleton instance3 = Singleton.getInstance();
			Singleton instance4 = Singleton.getInstance();
			System.out.println(Thread.currentThread().getName() +" : Instance HashCode: " + instance3.hashCode());
			System.out.println(Thread.currentThread().getName() +" : Instance HashCode: " + instance4.hashCode());
		});
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
	}
}
