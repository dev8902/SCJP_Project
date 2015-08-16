/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class SynchronizedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display d1=new Display();
		DisplayThread dt=new DisplayThread(d1, "Naresh");
		DisplayThread dt1=new DisplayThread(d1, "Srinu");
		DisplayThread dt2=new DisplayThread(d1, "Krishna");
		dt.start();
		dt1.start();
		dt2.start();
	}

}
class Display{
	public synchronized void wish(String name){
		for(int i=0;i<10;i++){
			System.out.println("Good morning: ");
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(name);
		}
	}
}
class DisplayThread extends Thread{
	Display d;
	String name;
	DisplayThread(Display d, String name){
		this.name=name;
		this.d=d;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}