/**
 * 
 */
package com.naresh.collections;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Naresh
 *
 */
public class TreeMapDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap map=new TreeMap(new MyComparator6());
		map.put("abc", 10);
		map.put("xbd", 20);
		map.put("bca", 30);
		map.put("xyz", 40);
		System.out.println(map);
		
	}

}
class MyComparator6 implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=arg0.toString();
		String s2=arg1.toString();
		return s1.compareTo(s2);
	}
}
