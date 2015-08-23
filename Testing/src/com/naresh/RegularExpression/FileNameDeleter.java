/**
 * 
 */
package com.naresh.RegularExpression;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naresh
 *
 */
public class FileNameDeleter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		Pattern p=Pattern.compile("[a-zA-Z0-9-]+[.]bak");
		File f=new File("F:/Workspace/SCJP_Project/Testing/src/com/naresh/RegularExpression");
		String[] str=f.list();
		for(String name:str){
			Matcher m=p.matcher(name);
			if(m.find()&&m.group().equals(name)){
				count++;
				System.out.println(name);
				File f1=new File(f,name);
				f1.delete();
			}
		}
		System.out.println(count);

	}

}
