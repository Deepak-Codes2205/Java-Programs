/* TEXTFIELD METHODS */

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

class awt_035 extends Frame implements ActionListener
{
	TextField tf1,tf2,tf3,tf4;
	Label l1;
	Button b1,b2,b3,b4;
	
	awt_035()
	{
		tf1=new TextField();
		tf1.setBounds(100,50,100,30);
		//tf1.setEnabled(true);
		char Ch='*';
		tf1.setEchoChar(Ch);
			
		tf2=new TextField(20);
		tf2.setBounds(100,90,100,30);
		tf2.setEnabled(true);
		
		tf3=new TextField("Hello");
		tf3.setBounds(100,130,100,30);
		tf3.setEnabled(true);
		
		tf4=new TextField("Hello",20);
		tf4.setBounds(100,170,100,30);
		tf4.setEnabled(true);
		
		l1=new Label("TEXT");
		l1.setBounds(220,170,100,30);
		l1.setBackground(Color.gray);
		
		b1=new Button("getText");
		b1.setBounds(100,210,100,30);
		b1.addActionListener(this);
		
		b2=new Button("select");
		b2.setBounds(100,250,100,30);
		b2.addActionListener(this);
		
		b3=new Button("isEditable");
		b3.setBounds(100,290,100,30);
		b3.addActionListener(this);
		
		b4=new Button("setEcho");
		b4.setBounds(100,330,100,30);
		b4.addActionListener(this);
		
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			l1.setText(String.valueOf(tf4.getText()));
			String  str=tf2.getSelectedText(); // String getSelectedText()
			System.out.println(str);
		}
		
		if(ae.getSource()==b2)
		{
			tf2.select(0,4); // void select(int startindex ,int endIndex)
			String  str1=tf2.getSelectedText(); // String getSelectedText()
			System.out.println(str1);
			
		}
		if(ae.getSource()==b3)
		{
			boolean x1=tf4.isEditable();  // boolean isEditable()
			System.out.println("Is tf4 editable :"+x1);
			
			tf4.setEditable(false);
			boolean x2=tf4.isEditable();  // boolean isEditable()
			System.out.println("Is tf4 editable :"+x2);
			
		}
		if(ae.getSource()==b4)
		{
			boolean x3=tf1.echoCharIsSet();
			System.out.println("tf1 has confidential text :"+x3);
			
			char ch1=tf1.getEchoChar();
			System.out.println("character used is :"+ch1);
			
		}
			
	}
	
	public static void main(String [] ar)
	{
		new awt_035();
	}
}
	
	
		