/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class RunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t= new Thread(r);
		t.start();
		

	}

}
class MyRunnable implements Runnable {
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("Child object here!" +i);
		}
		
	}
}

