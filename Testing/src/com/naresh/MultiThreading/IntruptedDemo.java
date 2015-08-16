/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class IntruptedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadIntrupt ti= new ThreadIntrupt();
		ti.start();
		ti.interrupt();
		System.out.println("Main thread");

	}

}
class ThreadIntrupt extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Child Thread: "+i);
			try{
			Thread.sleep(100000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
