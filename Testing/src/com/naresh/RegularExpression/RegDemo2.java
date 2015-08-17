/**
 * 
 */
package com.naresh.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naresh
 *
 */
public class RegDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		String[] s=p.split("Naresh for java");
		for(String s1:s){
			System.out.println(s1);
		}

	}

}
