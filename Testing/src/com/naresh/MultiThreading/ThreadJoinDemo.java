/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class ThreadJoinDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
	
		ThreadJoin tj=new ThreadJoin();
		tj.start();
		tj.join();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread: "+i);
		}

	}

}
class ThreadJoin extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Child Thread: "+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}