/* CHOICE AND LIST */

import java.awt.*;
import java.awt.event.*;

class awt_024 extends Frame implements ActionListener
{
	Label l1,l2;
	Button b1,b2;
	TextField tf1,tf2;
	List list1;
	Choice ch1;
	
	awt_024()
	{
		l1=new Label("City");
		l1.setBounds(50,50,100,30);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(new Color(237,237,237));
		
		tf1=new TextField(20);
		tf1.setBounds(50,90,100,30); 
		
		b1=new Button(">>");
		b1.setBounds(170,90,50,30);
		b1.addActionListener(this);
		
		ch1=new Choice();
		ch1.setBounds(240,90,100,30);
		
		
		l2=new Label("State");
		l2.setBounds(50,140,100,30);
		l2.setAlignment(Label.CENTER);
		l2.setBackground(new Color(237,237,237));
		
		tf2=new TextField(20);
		tf2.setBounds(50,180,100,30); 
		
		b2=new Button(">>");
		b2.setBounds(170,180,50,30);
		b2.addActionListener(this);
		
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
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			ch1.add(tf1.getText());
			tf1.setText(" ");
		}
		if(ae.getSource()==b2)
		{
			list1.add(tf2.getText());
			tf2.setText(" ");
		}
	}		
	public static void main(String [] ar)
	{
		new awt_024();
	}
		
}