/**
 * 
 */
package com.naresh.javaiopack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Naresh
 *
 */
public class FileWriterAndReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			File f=new File("mobile.txt");
			System.out.println(f.exists());
			FileWriter fw=new FileWriter(f);
			fw.write("naresh i love you !");
			fw.flush();
			/*FileReader fr=new FileReader(f);
			char[] ch=new char[(int)(f.length())];
			fr.read(ch);
			for(char a:ch){
				System.out.print(a);
			}*/
			FileReader fr=new FileReader("mobile.txt");
			int i=fr.read();
			while(i!=-1){
				System.out.print((char)i);
				i=fr.read();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
