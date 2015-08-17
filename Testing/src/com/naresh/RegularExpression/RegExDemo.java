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
public class RegExDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbbabcadcsssdabbaedab");
		while(m.find()){
			System.out.println(m.start()+"--------"+m.end()+"---------"+m.group());
		}

	}

}
