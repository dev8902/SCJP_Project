/**
 * 
 */
package com.naresh.MultiThreading;

/**
 * @author Naresh
 *
 */
public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Naresh");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

	}

}
