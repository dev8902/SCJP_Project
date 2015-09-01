/**
 * 
 */
package com.naresh.javalangpack;

/**
 * @author Naresh
 *
 */
//class should be final
final class ImmutableClassDemo {

	/**
	 * @param args
	 */
	//varibable should be private
	private  String name;
	private  int id;
	public ImmutableClassDemo(String name, int id) {
		this.id=id;
		this.name=name;
	}
	public  ImmutableClassDemo modify(String name, int id){
		if(id==this.id && this.name.equalsIgnoreCase(name)){
			return this;
		}else{
			return (new ImmutableClassDemo(name, id));
		}
	}
	
	
	public static void main(String[] args) {
		
		ImmutableClassDemo ide=new ImmutableClassDemo("Naresh", 100);
		ide.modify("Naresh", 100);
		ImmutableClassDemo ide1=new ImmutableClassDemo("Naresh", 100);
		ide1.modify("Naresh", 100);
		ImmutableClassDemo ide2=new ImmutableClassDemo("Naresh", 100);
		ide2.modify("Naresh", 100);
		System.out.println(ide==ide1);
		System.out.println(ide==ide2);

	}

}
