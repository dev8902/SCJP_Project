/**
 * 
 */
package com.naresh.enumPack;

/**
 * @author Naresh
 *
 */
enum Beer1{
	KF(75),KO(90),RC(50),FO;
	Beer1(){
		this.price=65;
	}
	int price;
	Beer1(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
}


public class BeerDemo1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Beer1[] b=Beer1.values();
		for(Beer1 b1:b){
			System.out.println(b1+"-------------"+b1.getPrice());
		}
		
	}
	
	
	
}
