/**
 * 
 */
package com.naresh.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Naresh
 *
 */
public class TreeSetDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet(new MyComparator());
		treeSet.add(20);
		treeSet.add(0);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(10);
System.out.println(treeSet);
	}

}
class MyComparator implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2){
			return +100;
		}else if(i1>i2){
			return -100;
		}else{
			return 0;
		}
		
	}
}
