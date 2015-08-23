/**
 * 
 */
package com.naresh.RegularExpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naresh
 *
 */
public class MobileExtractor1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		PrintWriter out=new PrintWriter("F:/Workspace/SCJP_Project/Testing/src/com/naresh/RegularExpression/mobile.txt");
		BufferedReader reader=new BufferedReader(new FileReader("F:/Workspace/SCJP_Project/Testing/src/com/naresh/RegularExpression/input.txt"));
		String line=reader.readLine();
		Pattern p=Pattern.compile("[7-9][0-9]{9}");
		while(line!=null){
			Matcher m=p.matcher(line);
			while(m.find()){
				out.println(m.group());
			}
			line=reader.readLine();
		}
		out.flush();
		// TODO Auto-generated method stub

	}

}
