/**
 * 
 */
package com.naresh.GarbageCollector;

/**
 * @author Naresh
 *
 */

public class FinalizeDemo {
	static FinalizeDemo fd;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		FinalizeDemo f=new FinalizeDemo();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(fd.hashCode());
		fd=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("end of the main method");
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized method is called!");
		fd=this;
	}

}
