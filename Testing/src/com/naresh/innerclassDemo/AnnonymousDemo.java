/**
 * 
 */
package com.naresh.innerclassDemo;

/**
 * @author Naresh
 *
 */
class Popcorn{
	public void tasty(){
		System.out.println("tasty");
	}
}
public class AnnonymousDemo {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Popcorn p=new Popcorn(){
	public void tasty(){
		System.out.println("salty");
	}
};
p.tasty();
Popcorn p1=new Popcorn();
p1.tasty();
	}

}
