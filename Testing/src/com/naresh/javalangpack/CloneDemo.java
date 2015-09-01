/**
 * 
 */
package com.naresh.javalangpack;

/**
 * @author Naresh
 *
 */
public class CloneDemo implements Cloneable{

	/**
	 * @param args
	 */
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneDemo cd=new CloneDemo();
		CloneDemo cd1=(CloneDemo)cd.clone();//deep cloning.
		cd1.i=100;
		cd1.j=200;
		System.out.println(cd1.i+"--------"+cd1.j);
		System.out.println(cd1.hashCode()==cd.hashCode());
		System.out.println(cd1==cd);

	}

}
