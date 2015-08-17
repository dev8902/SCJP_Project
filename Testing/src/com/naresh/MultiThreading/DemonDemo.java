/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class DemonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demon d=new Demon();
		d.setDaemon(true);
		d.start();
		System.out.println("End of main thread");

	}

}
class Demon extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("Lazy Thread");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}
		}
	}
}
