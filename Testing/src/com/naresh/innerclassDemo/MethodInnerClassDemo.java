/**
 * 
 */
package com.naresh.innerclassDemo;

/**
 * @author Naresh
 *
 */
public class MethodInnerClassDemo {

	/**
	 * @param args
	 */
	public void m1(){
		class Inner{
			public void sum(int x, int y){
				System.out.println("Sum is: "+(x+y));
			}
		}
		Inner i=new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
		i.sum(10000, 20000);
	}
	public static void main(String[] args) {
		MethodInnerClassDemo m=new MethodInnerClassDemo();
		m.m1();

	}

}
