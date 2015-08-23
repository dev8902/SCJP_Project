/**
 * 
 */
package com.naresh.i18n;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author Naresh
 *
 */
public class DateFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Full Form: "+DateFormat.getDateInstance(0).format(new Date()));
		System.out.println("Long Form: "+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("Medium Form: "+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("Short Form: "+DateFormat.getDateInstance(3).format(new Date()));
	}

}
