/**
 * 
 */
package com.naresh.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Naresh
 *
 */
public class DateFormatDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Canada Form: "+DateFormat.getDateInstance(0, Locale.CANADA).format(new Date()));
		System.out.println("Japan Form: "+DateFormat.getDateInstance(0, Locale.JAPAN).format(new Date()));
		System.out.println("Italy Form: "+DateFormat.getDateInstance(0, Locale.ITALY).format(new Date()));
	}

}
