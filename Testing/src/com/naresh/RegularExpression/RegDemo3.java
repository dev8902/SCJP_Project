/**
 * 
 */
package com.naresh.RegularExpression;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * @author Naresh
 *
 */
public class RegDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		StringTokenizer st =new StringTokenizer("Naresh for java", " ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
