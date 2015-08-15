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
public class ArraysShoartDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={2,5,7,8,6,4,9,1};
		System.out.println("Before array shorting:");
	for(int a1:a){
		System.out.println(a1);
	}
	Arrays.sort(a);
	System.out.println("After array shorting:");
	for(int a1:a){
		System.out.println(a1);
	}
	String[] s={"A","x","d","V","k","M","N"};
	System.out.println("Before String array sorting:");
	for(String s1:s){
		System.out.println(s1);
	}
	Arrays.sort(s);
	System.out.println("After String array sorting:");
	for(String s1:s){
		System.out.println(s1);
	}
	Arrays.sort(s, new MyComparator9());
	System.out.println("Shorting with customized:");
	
	for(String s1:s){
		System.out.println(s1);
	}

	}

}
class MyComparator9 implements Comparator{
@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}	
}
