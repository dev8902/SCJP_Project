/**
 * 
 */
package com.naresh.javalangpack;

/**
 * @author Naresh
 *
 */
public class EqualsDemo {
	String name;
	int id;
	public EqualsDemo(String name, int id) {
		this.name=name;
		this.id=id;
		// TODO Auto-generated constructor stub
	}
@Override
public boolean equals(Object obj) {
	try{
	String name1=this.name;
	int id=this.id;
	EqualsDemo eq=(EqualsDemo)obj;
	String name2=eq.name;
	int id1=eq.id;
	if(name1.equals(name2)&& id==id1){
		return true;
	}else{
		return false;
	}
	}catch(ClassCastException ce){
		return false;
	}catch(NullPointerException ne){
		return false;
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EqualsDemo ed=new EqualsDemo("Naresh", 10);
		EqualsDemo ed1=new EqualsDemo("Suresh", 200);
		EqualsDemo ed2=new EqualsDemo("Balu", 200);
		EqualsDemo ed3=ed;
		System.out.println(ed.equals(ed1));
		System.out.println(ed.equals(ed2));
		System.out.println(ed.equals(ed3));
		System.out.println(ed.equals("Naresh"));
		System.out.println(ed.equals(null));
	}

}
