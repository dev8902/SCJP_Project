/**
 * 
 */
package com.naresh.GarbageCollector;

import java.util.Date;

/**
 * @author Naresh
 *
 */
public class GarbageCollectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		for(int i=1;i<=1000;i++){
			Date d=new Date();
			d=null;
		}
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println(r.freeMemory());
		// TODO Auto-generated method stub

	}

}
