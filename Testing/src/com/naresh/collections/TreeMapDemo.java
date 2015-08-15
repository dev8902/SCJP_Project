/**
 * 
 */
package com.naresh.collections;

import java.util.TreeMap;

/**
 * @author Naresh
 *
 */
public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put(100, "naresh");
		map.put(101, "rajesh");
		map.put(102, "ramesh");
		map.put(105, "lokesh");
		map.put(106, "jagadesh");
		map.put(103, "rakesh");
		map.put(104, "somesh");
		//map.put("ramu", 1010);//java.lang.ClassCastException
		//map.put(null, "Hello");//java.lang.NullPointerException
		System.out.println(map);

	}

}
