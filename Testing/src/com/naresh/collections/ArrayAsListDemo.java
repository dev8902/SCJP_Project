/**
 * 
 */
package com.naresh.collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naresh
 *
 */
public class ArrayAsListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s={"A","K","C","d","b","z"};
		List l=Arrays.asList(s);
		System.out.println(l);
		l.set(2, "p");
		for(String s1:s){
			System.out.println(s1);
		}
		//l.add("naresh");java.lang.UnsupportedOperationException
		//l.remove(2);java.lang.UnsupportedOperationException
		l.set(1, "n");
		

	}

}
