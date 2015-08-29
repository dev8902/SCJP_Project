/**
 * 
 */
package com.naresh.innerclassDemo;

/**
 * @author Naresh
 *
 */
public class StaticNestedDemo {

	static class Nested{
		public void m1(){
			System.out.println("Static Nested class method");
		}
	}
	public static void main(String[] args) {
		StaticNestedDemo.Nested n=new StaticNestedDemo.Nested();
		n.m1();

	}

}
