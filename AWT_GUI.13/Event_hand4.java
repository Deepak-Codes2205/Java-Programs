/* FOCUS LISTENER */

import java.awt.*;
import java.awt.event.*;


class Event_hand4 extends Frame implements FocusListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	int a=0,b=0,c=0,d=0,e=0,f=0;
	Event_hand4()
	{
		l1=new Label("NUM1");
		l1.setBounds(50,50,100,30);
		l1.setBackground(new Color(237,237,237));
		
		l2=new Label("NUM2");
		l2.setBounds(50,90,100,30);
		l2.setBackground(new Color(237,237,237));
		
		l3=new Label("SUM");
		l3.setBounds(50,130,100,30);
		l3.setBackground(new Color(237,237,237));
		
		tf1=new TextField();
		tf1.setBounds(170,50,100,30);
		
		tf2=new TextField();
		tf2.setBounds(170,90,100,30);
		
		tf3=new TextField();
		tf3.setBounds(170,130,100,30);
		tf3.addFocusListener(this);
		
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(tf2);
		add(tf3);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void focusGained(FocusEvent fe)
	{
		if(fe.getSource()==tf3)
		{
			a=Integer.parseInt(tf1.getText());
			b=Integer.parseInt(tf2.getText());
			c=a+b;
			tf3.setText(String.valueOf(c));
		}
	}
	
	public void focusLost(FocusEvent fe)
	{
		if(fe.getSource()==tf3)
		{
			d=Integer.parseInt(tf1.getText());
			e=Integer.parseInt(tf2.getText());
			f=d*c;
			tf3.setText(String.valueOf(f));
		}
	}
	
	public static void main(String [] ar)
	{
		new Event_hand4();
	}
}
		
		
		
