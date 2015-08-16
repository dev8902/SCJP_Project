/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class ThreadPriorityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		MyPriorityThread t=new MyPriorityThread();
		t.setPriority(10);
		t.start();
for(int i=0;i<=10;i++){
	System.out.println("Main thread: "+i);
}
	}

}
class MyPriorityThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10;i++){
			System.out.println("Child thread "+i);
		}
	}
}
