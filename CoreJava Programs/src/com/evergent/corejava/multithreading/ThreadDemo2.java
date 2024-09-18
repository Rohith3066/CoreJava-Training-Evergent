package com.evergent.corejava.multithreading;
class MyThread2 implements Runnable {
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread2 t1= new MyThread2();
		Thread tt1 = new Thread(t1);
		tt1.start();
		MyThread2 t2= new MyThread2();
		Thread tt2 = new Thread(t2);
		tt2.start();

	}

}
