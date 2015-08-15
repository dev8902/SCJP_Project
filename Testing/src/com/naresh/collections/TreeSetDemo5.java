/**
 * 
 */
package com.naresh.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Naresh
 * Write a program to insert StringBuffer objects into the Treeset where the shorting order alphabetical order.
 */
public class TreeSetDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet(new MyComparator3());
		treeSet.add(new StringBuffer("A"));
		treeSet.add(new StringBuffer("Z"));
		treeSet.add(new StringBuffer("K"));
		treeSet.add(new StringBuffer("L"));
		treeSet.add(new StringBuffer("C"));
		System.out.println(treeSet);
		

	}

}

class MyComparator3 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s1.compareTo(s2);
	}
}
