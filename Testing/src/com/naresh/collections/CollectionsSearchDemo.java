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
public class CollectionsSearchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("m");
		al.add("k");
		al.add("a");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "a"));
		System.out.println(Collections.binarySearch(al, "A"));

	}

}
