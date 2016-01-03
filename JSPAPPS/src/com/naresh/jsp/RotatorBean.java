/**
 * 
 */
package com.naresh.jsp;

/**
 * @author Naresh
 *
 */
public class RotatorBean {
	private int index=1;
	private String[] image={"lav.jpg","Lavanya.jpg","Lavanya2.jpg","lov_share.jpg","lov2.jpg","love.jpg","love1.jpg","love3.jpg","Moushmee.jpg","Moushmee1.jpg"};
public void display(){
	index=(index+1)%image.length;
}
public String getImage(){
	return image[index];
}

}
