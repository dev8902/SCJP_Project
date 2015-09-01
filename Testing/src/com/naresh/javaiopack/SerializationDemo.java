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
public class SerializationDemo{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.i+"  "+d1.j);

	}

}
class Dog implements Serializable{
	int i=10;
	int j=20;
	
}
