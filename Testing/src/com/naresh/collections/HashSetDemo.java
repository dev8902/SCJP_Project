/**
 * 
 */
package com.naresh.collections;

import java.util.HashSet;

/**
 * @author Naresh
 *
 */
public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add(null);
		hashSet.add(10);
		System.out.println(hashSet.add("Z"));
		System.out.println(hashSet);
		//System.out.println(hashSet.add(null));
	}

}
