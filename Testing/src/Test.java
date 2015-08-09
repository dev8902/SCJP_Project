/**
 * 
 */

/**
 * @author Naresh
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Test test = new Test();
	test.getFibonic();
	
		// TODO Auto-generated method stub

	}
public void getFibonic(){
	int temp=0; int n=1;int temp1;
	for (int i = 0; i < 10; i++) {
		
		System.out.println(temp);
		
		temp1=temp+n;
		temp=n;
		n=temp1;	
	}
	
}
}
