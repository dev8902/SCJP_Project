/**
 * 
 */
package com.naresh.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Naresh
 *
 */
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("naresh", 700);
		hm.put("rajesh", 800);
		hm.put("Laba", 900);
		System.out.println(hm);
		System.out.println(hm.put("naresh", 1000));
		Set set=hm.entrySet();
		System.out.println(set);
		Collection c=hm.values();
		System.out.println(c);
		
		Set set1=hm.entrySet();
		Iterator it=set1.iterator();
		while(it.hasNext()){
			Map.Entry m1=(Map.Entry)it.next();
			System.out.println(m1.getKey()+" -----------------------"+m1.getValue());
			if(m1.getKey().equals("naresh"))
				m1.setValue(1028);
			
		}
		
		System.out.println(hm);
	}

}
