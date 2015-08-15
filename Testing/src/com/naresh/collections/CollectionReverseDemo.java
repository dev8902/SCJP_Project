/**
 * 
 */
package com.naresh.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Naresh
 *
 */
public class CollectionReverseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(5);
		al.add(3);
		al.add(8);
		al.add(7);
		al.add(4);
		al.add(0);
		al.add(1);
		al.add(6);
		System.out.println(al);
		Collections.reverse(al);
System.out.println(al);
	}

}
