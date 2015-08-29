/**
 * 
 */
package com.naresh.innerclassDemo;

/**
 * @author Naresh
 *
 */
public class AnnoumousDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t=new Thread(){
			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("Child Thread: "+i);
				}
				
			}
		};
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread: "+i);
		}

	}

}
