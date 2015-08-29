/**
 * 
 */
package com.naresh.innerclassDemo;

/**
 * @author Naresh
 *
 */
public class NormalClassDemo {
	static int x=10;
	int y=20;
	
class InnerDemo{
	public void m1(){
		System.out.println(x);
		System.out.println(y);
	}
	
}
	public static void main(String[] args) {
		
NormalClassDemo n=new NormalClassDemo();
NormalClassDemo.InnerDemo i=n.new InnerDemo();
i.m1();
	}

}
