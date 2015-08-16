/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class YieldThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyYieldThread mp=new MyYieldThread();
		mp.start();
		for(int i=0;i<=10;i++){
			System.out.println("Main Thread "+i);
		}

	}

}
class MyYieldThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			Thread.yield();
			System.out.println("child Thread :"+i);
		
		}
	}
	
}
