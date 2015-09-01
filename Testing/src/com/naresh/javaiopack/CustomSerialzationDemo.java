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
class Account implements Serializable{
	String username="naresh";
	transient String password="naresh123";
}


public class CustomSerialzationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Account a =new Account();
		System.out.println(a.username+"-----"+a.password);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a2=(Account)ois.readObject();
		System.out.println(a2.username+"-----"+a2.password);

	}

}
