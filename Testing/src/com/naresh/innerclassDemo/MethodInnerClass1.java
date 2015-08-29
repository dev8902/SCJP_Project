/**
 * 
 */
package com.naresh.innerclassDemo;


/**
 * @author Naresh
 *
 */
public class MethodInnerClass1 {

	int x=10;
	public void m1(){
		final int y=20;
		class Inner{
			public void m2(){
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i=new Inner();
		i.m2();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MethodInnerClass1 m=new MethodInnerClass1();
		m.m1();
	}

}
