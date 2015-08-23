/**
 * 
 */
package com.naresh.enumPack;

/**
 * @author Naresh
 *
 */
public class BeerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beer b=Beer.KF;
		switch(b){
		case KF:
			System.out.println("It is Kingfresher");
			break;
		case KO:
			System.out.println("It is KnockOut");
			break;
		case RC:
			System.out.println("It is RoyalChallange");
			break;
		case FO:
			System.out.println("It is Fruit");
			break;
		default:
			System.out.println("your not select any brand");
		}

	}

}
