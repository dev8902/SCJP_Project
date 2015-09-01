/**
 * 
 */
package com.naresh.javaiopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Naresh
 *
 */
class Account1 implements Serializable{
	String username="naresh";
	transient String password="Vinayaka";
	private void writeObject(ObjectOutputStream oos, ObjectInputStream ois) throws Exception{
		oos.defaultWriteObject();
		String epassword=(String)ois.readObject();
		password=epassword.substring(3);
	}
}
public class CustomSerializationDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Account1 ac=new Account1();
		System.out.println(ac.username+"  "+ac.password);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ac);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account1 ac1=(Account1)ois.readObject();
		System.out.println(ac1.username+"  "+ac1.password);
		
		

	}

}
