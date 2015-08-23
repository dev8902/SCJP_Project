/**
 * 
 */
package com.naresh.enumPack;

/**
 * @author Naresh
 *
 */
public class BeerTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Beer[] beerNames=Beer.values();
		for(Beer b:beerNames){
			System.out.println(b+"---------------->"+b.ordinal());
		}

	}

}
 enum Beer{
	 KF,KO,RC,FO;
	
}
