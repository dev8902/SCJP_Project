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
public class NumberFormatDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d=123456.789;
		Locale india=new Locale("pa","IN");
		NumberFormat nf1=NumberFormat.getCurrencyInstance(india);
		System.out.println("India Notation is-----"+nf1.format(d));
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US Notation is-----"+nf2.format(d));
		NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK Notation is-----"+nf3.format(d));
		
		

	}

}
