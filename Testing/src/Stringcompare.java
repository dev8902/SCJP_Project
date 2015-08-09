
/**
 * 
 */

/**
 * @author Naresh
 *
 */
public class Stringcompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s1={"Ramu", "Rajesh","Ranga"};
		String temp;
		for(int i=0;i<s1.length;i++){
			for(int j=i+1;j<s1.length;j++){
				if (s1[j].compareToIgnoreCase(s1[i]) < 0){
					temp= s1[i];
		             s1[i]= s1[j]; 
		             s1[j]=temp;
				}
			}
			 //System.out.print(s1[i]);
		}
		
		for(int k=0;k<s1.length;k++){
			System.out.println(s1[k]);
		}
		

	}

}
