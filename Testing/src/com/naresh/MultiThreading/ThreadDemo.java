/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println("Main Thread value: "+i);
		}

	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("Child Thread value: "+i);
		}
	}
}
