/**
 * 
 */
package com.naresh.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Naresh
 * Write a program to insert String & String Buffer objects into the treeset where the String order increasing length order.
 * if two objects having same length then consider their alphabetical order.
 */
public class TreeSetDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet(new MyComparator2());
		treeSet.add("A");
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("AA"));
		treeSet.add("xyz");
		treeSet.add("ABCD");
		treeSet.add("Naresh");
		System.out.println(treeSet);
		

	}

}

class MyComparator2 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2=o2.toString();
		int length1=s1.length();
		int length2=s2.length();
		if(length1<length2)
			return -1;
		else if(length2>length1)
		return +1;
		else
			return s1.compareTo(s2);
		
	}
}
