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
public class ObjectGraphDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Dog1 d=new Dog1();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d1=(Dog1)ois.readObject();
		System.out.println(d1.c.r.j);
	}

}
class Dog1 implements Serializable{
	
	Cat c=new Cat();
}
class Cat implements Serializable{
	Rat r=new Rat();
}
class Rat implements Serializable{
	int j=20;
}
