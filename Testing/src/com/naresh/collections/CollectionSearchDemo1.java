/**
 * 
 */
package com.naresh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Naresh
 *
 */
public class CollectionSearchDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(15);
		al.add(13);
		al.add(3);
		al.add(6);
		al.add(4);
		al.add(8);
		al.add(2);
		al.add(20);
		System.out.println(al);
		Collections.sort(al, new MyComparator8());
		System.out.println(al);
		System.out.println(Collections.binarySearch(al,15,new MyComparator8()));
		System.out.println(Collections.binarySearch(al,8,new MyComparator8()));
		System.out.println(Collections.binarySearch(al, 19));
		
		
		

	}

}
class MyComparator8 implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	
	}
}
