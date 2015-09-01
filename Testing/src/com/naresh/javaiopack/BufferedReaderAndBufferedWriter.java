/**
 * 
 */
package com.naresh.javaiopack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Naresh
 *
 */
public class BufferedReaderAndBufferedWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("mobile.txt"));
		bw.write(100);
		bw.newLine();
	char[] ch={'a','p','p','l','e'};
	bw.write(ch);
	bw.flush();
	bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("mobile.txt"));
		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}
br.close();
	}

}
