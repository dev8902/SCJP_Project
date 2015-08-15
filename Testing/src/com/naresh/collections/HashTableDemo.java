/**
 * 
 */
package com.naresh.collections;

import java.util.Hashtable;

/**
 * @author Naresh
 *
 */
public class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		ht.put(new Temp(5), "A");
		ht.put(new Temp(2), "J");
		ht.put(new Temp(9), "Q");
		ht.put(new Temp(4), "S");
		ht.put(new Temp(0), "X");
		ht.put(new Temp(6), "T");
		ht.put(new Temp(3), "B");
		ht.put("naresh", null);
		System.out.println(ht);
		
		

	}

}
class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
	}
	@Override
	public String toString() {
		return i+"";
	}
}
