/**
 * 
 * 	
 */
package com.naresh.collections;

import java.util.LinkedList;

/**
 * @author Naresh
 *
 */
public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList=new LinkedList();
		linkedList.add("durga");
		linkedList.add(30);
		linkedList.add(null);
		linkedList.add("durga");
		linkedList.set(0, "software");
		linkedList.add(0, "venky");
		linkedList.removeLast();
		linkedList.addFirst("ccc");
		System.out.println(linkedList);

	}

}
