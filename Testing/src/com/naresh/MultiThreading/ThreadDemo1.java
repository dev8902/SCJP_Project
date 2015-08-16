/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class ThreadDemo1 {

	/**
	 * @param args
	 */
 
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		t1.start();
		System.out.println("Main method");

	}

}
class MyThread1 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("This is Thread class run method:");
		
	}
	@Override
	public  void start() {
		
		super.start();
		System.out.println("This is Thread start method:");
	}
}
