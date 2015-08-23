/**
 * 
 */
package com.naresh.GarbageCollector;

/**
 * @author Naresh
 *
 */
public class IsolationDemo {

	/**
	 * @param args
	 */
	IsolationDemo id;
	public static void main(String[] args) {
		IsolationDemo id1=new IsolationDemo();
		IsolationDemo id2=new IsolationDemo();
		IsolationDemo id3=new IsolationDemo();
		IsolationDemo id4=new IsolationDemo();
		id1.id=id2;
		id2.id=id3;
		id3.id=id4;
		id4.id=id1;
		id1=null;
		id2=null;
		id3=null;
		id4=null;
		
		
		
	}

}
