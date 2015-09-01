/**
 * 
 */
package com.naresh.javalangpack;

/**
 * @author Naresh
 *
 */
public class ToStringDemo {

	/**
	 * @param args
	 */
	String name;
	int id;
	public ToStringDemo(String name,int id) {
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName().toUpperCase()+" : name:"+name+" id:"+id;
	}
	@Override
	public int hashCode() {
		
		return id;
	}
	public static void main(String[] args) {
		String s=new String("String");
		ToStringDemo td=new ToStringDemo("naresh", 101);
		ToStringDemo td1=new ToStringDemo("suresh", 110);
		System.out.println(td);
		System.out.println(s);
		System.out.println(td.toString());
		System.out.println(td1.toString());

	}

}
