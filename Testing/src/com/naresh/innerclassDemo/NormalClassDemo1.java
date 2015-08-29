/**
 * 
 */
package com.naresh.innerclassDemo;

import com.naresh.innerclassDemo.NormalClassDemo.InnerDemo;

/**
 * @author Naresh
 *
 */
public class NormalClassDemo1 {

	static int x=10;
	int y=20;
	
class InnerDemo1{
	int x=100;
	public void m1(){
		int x=1000;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(NormalClassDemo1.this.x);
		System.out.println(y);
	}
	
}
	public static void main(String[] args) {
		
NormalClassDemo1 n=new NormalClassDemo1();
NormalClassDemo1.InnerDemo1 i=n.new InnerDemo1();
i.m1();
	}


}
