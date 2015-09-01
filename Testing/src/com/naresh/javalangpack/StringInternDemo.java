/**
 * 
 */
package com.naresh.javalangpack;

/**
 * @author Naresh
 *
 */
public class StringInternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s=new String("Hello");
		String s1=s.intern();
		System.out.println(s==s1);
		String s2="Hello";
		System.out.println(s1==s2);
		

	}

}
