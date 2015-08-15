/**
 * 
 */
package com.naresh.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Naresh
 * Write a program to insert String objects into the treeset where the shorting order is reverse of alphabetical order
 */
public class TreeSetDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet treeset=new TreeSet(new MyComparator1());
		treeset.add("A");
		treeset.add("Z");
		treeset.add("K");
		treeset.add("P");
		treeset.add("D");
		treeset.add("C");
		treeset.add("T");
System.out.println(treeset);
	}

}
class MyComparator1 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return -s1.compareTo(s2);
		
		
	}
}
