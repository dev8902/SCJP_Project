/**
 * 
 */
package com.naresh.innerclassDemo;

/**
 * @author Naresh
 *
 */
public class MethodClassDemo1 {
	int x=10;
	static int y=20;
	public void m1(){
		int i=30;
		final int j=40;
		class Inner{
			public void m2(){
				System.out.println(x);
				System.out.println(y);
				//System.out.println(i);
				System.out.println(j);
			}
			
		}
		Inner i1=new Inner();
		i1.m2();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodClassDemo1 m=new MethodClassDemo1();
		m.m1();

	}

}
