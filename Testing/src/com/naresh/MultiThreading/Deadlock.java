/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class Deadlock extends Thread{

	/**
	 * @param args
	 */
	A a =new A();
	B b=new B();
	Deadlock(){
		this.start();
		a.foo(b);
	}
	@Override
	public void run() {
		b.foo(a);
	}
	public static void main(String[] args) {
		
new Deadlock();
	}

}
class A{
	public synchronized void foo(B b){
		System.out.println("Thread1 starts execution foo");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
		System.out.println("Thread1 trying to call b's last()");
		b.last();
	}
	public synchronized void last(){
		System.out.println("Inside A this is last()");
	}
}
class B{
	public synchronized void foo(A a){
		System.out.println("Thread2 starts execution foo");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
		System.out.println("Thread2 trying to call a's last()");
		a.last();
}
	public synchronized void last(){
		System.out.println("Inside B this is last()");
	}
}