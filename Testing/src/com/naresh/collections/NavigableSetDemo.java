/**
 * 
 */
package com.naresh.collections;

import java.util.TreeSet;

/**
 * @author Naresh
 *
 */
public class NavigableSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> tr= new TreeSet<Integer>();
		tr.add(1000);
		tr.add(1500);
		tr.add(15000);
		tr.add(2500);
		tr.add(3500);
		tr.add(1200);
		System.out.println(tr);
		System.out.println(tr.ceiling(2000));
		System.out.println(tr.higher(3000));
		System.out.println(tr.floor(1800));
		System.out.println(tr.lower(9000));
		System.out.println(tr.pollFirst());
		System.out.println(tr.pollLast());
		System.out.println(tr.descendingSet());
		System.out.println(tr);

	}

}
