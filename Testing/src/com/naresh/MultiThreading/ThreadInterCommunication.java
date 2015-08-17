/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class ThreadInterCommunication {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		ThreadA a=new ThreadA();
		a.start();
		synchronized (a) {
			System.out.println("Main Thread trying to call wait()");
			a.wait();
			System.out.println("Main Thread got notification");
			System.out.println(a.total);
			
		}
		

	}

}
class ThreadA extends Thread{
	int total=0;
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread starts notification");
			for(int i=0;i<=10;i++){
				total=total+i;
			}
			System.out.println("Child Thread trying to given notification");
			this.notify();
			
		}

	}
}
