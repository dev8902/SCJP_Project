/**
 * 
 */
package com.naresh.collections;

import java.util.TreeSet;

/**
 * @author Naresh
 *
 */
public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet treeset=new TreeSet();
		treeset.add("A");
		treeset.add("a");
		treeset.add("B");
		treeset.add("Z");
		treeset.add("L");
	//	treeset.add(new Integer(10));
	//	treeset.add(null);
		System.out.println(treeset);

	}

}
