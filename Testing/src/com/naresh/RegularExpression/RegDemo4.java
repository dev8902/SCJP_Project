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
public class RegDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p= Pattern.compile("[a-z]*");
		Matcher m=p.matcher("naresh");
		if(m.find()&&m.group().equals("naresh1")){
			System.out.println("Valid Identifier");
		}else{
			System.out.println("InValid Identifier");
		}

	}

}
