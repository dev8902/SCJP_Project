/**
 * 
 */
package com.naresh.javalangpack;

/**
 * @author Naresh
 *
 */
public class StringInternDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=s1.concat(" World!");
		String s3=s2.intern();
		String s4="Hello World!";
		System.out.println(s3==s4);
		s4=s4.replace(' ', '-');
		System.out.println(s4.trim());
		System.out.println(s3.equals(s4));
		char[] ch1=s4.toCharArray();
		int i=1;
		for(char ch:ch1){
			System.out.println(i+"===="+ch);
			i++;
		}

	}

}
