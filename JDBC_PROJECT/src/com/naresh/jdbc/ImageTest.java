/**
 * 
 */
package com.naresh.jdbc;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Naresh
 *
 */
public class ImageTest extends JFrame implements ActionListener{
	JLabel companyName;
	JTextField company;
	JButton btn1,btn2;
	Connection con;
	PreparedStatement ps;
	Container c;
	int i=0;
	
	public ImageTest(){
		setLocation(100,100);
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		companyName=new JLabel("Enter Company Name:");
		company=new JTextField(10);
		btn1=new JButton("Load Image");
		btn2=new JButton();
		setLayout(new FlowLayout());
		c=getContentPane();
		c.add(companyName);
		c.add(company);
		c.add(btn1);
		c.add(btn2);
		btn1.addActionListener(this);
	}
	public void openConnection(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			 ps=con.prepareStatement("select profile_pic from login_info where username=?");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		openConnection();
		try{
			i++;
			String s=company.getText();
			System.out.println(s);
			ps.setString(1, s);
			ResultSet rs=ps.executeQuery();
			rs.next();
			InputStream is=rs.getBinaryStream(1);
			int k;
			FileOutputStream fos=new FileOutputStream("C:/Users/Naresh/Desktop/"+i+".gif");
			while((k=is.read())!=-1){
				fos.write(k);
			}
			ImageIcon ii=new ImageIcon("C:/Users/Naresh/Desktop/"+i+".gif");
			btn2.setIcon(ii);
			is.close();
			fos.close();
		}catch(Exception e1){
			e1.printStackTrace();
			closeCon();
		}
		
	}
	public void closeCon(){
		try{
		con.close();
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ImageTest();

	}

}
