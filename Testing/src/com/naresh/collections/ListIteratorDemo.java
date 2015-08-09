/**
 * 
 */
package com.naresh.collections;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Naresh
 *
 */
public class ListIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add("balakrishna");
		linkedList.add("venky");
		linkedList.add("chiru");
		linkedList.add("nag");
		System.out.println(linkedList);
		ListIterator listIterator=linkedList.listIterator();
		while(listIterator.hasNext()){
			String s=(String)listIterator.next();
			if(s.equals("venky")){
				listIterator.remove();
			}
			if(s.equals("chiru")){
				listIterator.set("RamCharan");
			}
			if(s.equals("nag")){
				listIterator.add("chaithu");
			}
		}
		 
		System.out.println(listIterator);
		

	}
	
	@Override
	public String toString() {
		System.out.println( getClass().getName());
		return getClass().getName();
	}

}
