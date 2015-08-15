/**
 * 
 */
package com.naresh.collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Naresh
 *
 */
public class ArraySearchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {10,6,4,8,3,2,0};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, 14));
		String[] s1={"A","K","I","p","t","b"};
		Arrays.sort(s1);
		System.out.println(Arrays.binarySearch(s1, "p"));
		System.out.println(Arrays.binarySearch(s1, "I"));
		Arrays.sort(s1, new MyComparator4());
		System.out.println(Arrays.binarySearch(s1, "b", new MyComparator4()));
		System.out.println(Arrays.binarySearch(s1, "K", new MyComparator4()));
		System.out.println(Arrays.binarySearch(s1, "n"));
		

	}

}
class MyComparator4 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
	}
}