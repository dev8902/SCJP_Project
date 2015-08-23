/**
 * 
 */
package com.naresh.i18n;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Naresh
 *
 */
public class NumberFormatDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d=123456.789;
		NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
		System.out.println("ITALY Format is: "+nf.format(d));

	}

}
