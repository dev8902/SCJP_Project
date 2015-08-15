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
public class Employee implements Comparable{

	/**
	 * @param args
	 */
	
	int eid;
	public Employee(int eid) {
		this.eid=eid;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "E- "+eid;
			}
	@Override
	public int compareTo(Object o) {
		int eid1=this.eid;
		Employee e=(Employee)o;
		int eid2=e.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else 
		return 0;
	}
	public static void main(String[] args) {
		Employee e1=new Employee(100);
		Employee e2=new Employee(1040);
		Employee e3=new Employee(500);
		Employee e4=new Employee(800);
		Employee e5=new Employee(600);
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
		TreeSet t2=new TreeSet( new MyComparator5());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);

	}

}
class MyComparator5 implements Comparator{
@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e2.compareTo(e1);
	}	
}