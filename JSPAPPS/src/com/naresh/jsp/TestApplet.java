/**
 * 
 */
package com.naresh.jsp;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * @author Naresh
 *
 */
public class TestApplet extends Applet{
	
	String msg;
	@Override
	public void init() {
		msg=getParameter("s1");
	}
	@Override
	public void paint(Graphics g) {
		Font f=new Font("Arial", Font.BOLD,15);
		g.setColor(Color.red);
		g.fillOval(50, 100, 150, 50);
		g.setColor(Color.blue);
		g.setFont(f);
		g.drawString(msg, 80,120);
	}

}
