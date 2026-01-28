/* CHOICE AND LIST */

import java.awt.*;
import java.awt.event.*;

class awt_024 extends Frame implements ActionListener
{
	label l1,l2;
	Button b1,b2;
	TextField tf1,tf2;
	List list1;
	Choice ch1;
	
	awt_024()
	{
		l1=new Label("City");
		l1.setBounds(50,50,100,30);
		l1.setAlignment(label.CENTER);
		
		tf1=new TextField(20);
		tf1.setBounds(50,90,100,30); 
		
		b1=new Button(">>");
		b1.set(100,90,50,30);
		
		ch1=new Choice();
		ch1.setBounds(170,90,100,30);
		
		
		l2=new Label("State");
		l2.setBounds(50,140,100,30);
		l2.setAlignment(label.CENTER);
		
		tf2=new TextField(20);
		tf2.setBounds(50,180,100,30); 
		
		b2=new Button(">>");
		b2.set(170,180,50,30);
		
		list1=new List();
		list1.setBounds(240,180,100,30);
		
		add(l1);
		add(tf1);
		add(b1);
		add(ch1);
		
		add(l2);
		add(tf2);
		add(b2);
		add(list1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String [] ar)
	{
		new awt_024();
	}
		
}