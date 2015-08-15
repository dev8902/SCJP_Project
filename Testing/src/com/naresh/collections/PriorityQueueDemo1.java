/**
 * 
 */
package com.naresh.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Naresh
 *
 */
public class PriorityQueueDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(15, new MyComparator7());
		pq.offer("Bangalore");
		pq.offer("Channai");
		pq.offer("Mumbai");
		pq.offer("puni");
		pq.offer("Vishakapatnam");
		
		System.out.println(pq);

	}

}
class MyComparator7 implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=arg0.toString();
		String s2=arg1.toString();
		return s2.compareTo(s1);
	}
}