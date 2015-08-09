/**
 * 
 */
package com.naresh.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Naresh
 *
 */
public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList=new ArrayList();
		for(int i=0;i<=10;i++){
			arrayList.add(i);
		}
		System.out.println(arrayList);
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()){
			Integer integer=(Integer)iterator.next();
			if(integer%2==0){
			System.out.println(integer);
			}else if (integer%2 !=0) {
				System.out.println(integer);
			}{
				iterator.remove();
			}
		}System.out.println(iterator);
	}

}
