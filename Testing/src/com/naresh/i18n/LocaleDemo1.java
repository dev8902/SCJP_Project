/**
 * 
 */
package com.naresh.i18n;

import java.util.Locale;

/**
 * @author Naresh
 *
 */
public class LocaleDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale l1=Locale.getDefault();
		System.out.println(l1.getCountry()+"--------"+l1.getLanguage());
		System.out.println(l1.getDisplayCountry()+"--------"+l1.getDisplayLanguage());
		Locale l2=new Locale("pa", "IN");
		Locale.setDefault(l2);
		String[] str=Locale.getISOLanguages();
		for(String str1:str){
			System.out.println(str1);
		}
		String[] str2=Locale.getISOCountries();
		for(String str3:str2){
			System.out.println(str3);
		}
		Locale[] l3=Locale.getAvailableLocales();
		for(Locale lo:l3){
			System.out.println(lo.getDisplayCountry()+"-----"+lo.getDisplayCountry());
		}
		/*Locale tl=new Locale("TE","IN");
		System.out.println(tl.getCountry()+"--------"+tl.getLanguage());
		System.out.println(tl.getDisplayCountry()+"--------"+tl.getDisplayLanguage());*/
	}

}
