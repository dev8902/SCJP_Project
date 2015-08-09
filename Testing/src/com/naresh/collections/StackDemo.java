/**
 * 
 */
package com.naresh.collections;

import java.util.Stack;

/**
 * @author Naresh
 *
 */
public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);
		System.out.println(stack.search("A"));
		System.out.println(stack.search("Z"));

	}

}
