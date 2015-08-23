/**
 * 
 */
package com.naresh.RegularExpression;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naresh
 *
 */
public class FileNameExtractor {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		int count=0;
		Pattern p=Pattern.compile("[a-zA-z0-9-]+[.]txt");
		File f=new File("F:/Workspace/SCJP_Project/Testing/src/com/naresh/RegularExpression");
		String[] str=f.list();
		for(String name:str){
			Matcher m=p.matcher(name);
			if(m.find()&&m.group().equals(name)){
				count++;
				System.out.println(name);
			}
		}System.out.println(count);
		// TODO Auto-generated method stub

	}

}
