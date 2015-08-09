/**
 * 
 */
package com.naresh.collections;

import java.util.ArrayList;

/**
 * @author Naresh
 *
 */
public class ArrayListDemo {
//This is class body comments created by Mr.Naresh
	
	public ArrayList getArrayList(){
		ArrayList arrayList=new ArrayList();
		arrayList.add("A");
		arrayList.add(10);
		arrayList.add("A");
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.add(2, "M");
		arrayList.add("N");
		System.out.println(arrayList);
		return arrayList;
		
		
	}
	
	public static void main(String[] args) {
		
		ArrayListDemo demo=new ArrayListDemo();
		demo.getArrayList();
		
	}
}
