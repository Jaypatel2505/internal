package com.thread;

/*
 * Thread : Light Weight process
 * 			Main is thread
 * 			Whenever a process start
 * 
 * Multi Thread : Multiprocessing, Multitasking
 * 
 * thread life cycle:
 * - newborn
 * - runnable
 * - running
 * - block
 * - dead
 * 
 * Thread can be achieved in 2 ways
 * 1. by using thread class
 * 2. by using runnable interface 
 */
class First extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is First Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		First f1 = new First();
		f1.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is Main Thread");
			Thread.sleep(2000);
		}
	}
}
