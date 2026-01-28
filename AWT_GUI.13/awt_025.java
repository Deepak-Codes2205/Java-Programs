/* PANELS */

import java.awt.*;
import java.awt.event.*;

class awt_025 extends Frame implements ActionListener
{
	Panel p1,p2;
	TextField tf1,tf2;
	Button b1;
	int c=0;
	awt_025()
	{
		p1=new Panel();
		p1.setBounds(10,30,200,200);
		p1.setBackground(Color.green);
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		tf1=new TextField(20);
		p1.add(tf1);		
		
		
		p2=new Panel();
		p2.setBounds(220,30,200,200);
		p2.setBackground(Color.red);
		p2.setLayout(null);
		tf2=new TextField(20);
		
		tf2.setBounds(10,10,100,20);
		p2.add(tf2);
		
		b1=new Button("Hide/Show");
		b1.setBounds(100,300,100,20);
		b1.addActionListener(this);
		
		add(p1);
		add(p2);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(c==0)
			{
				p1.setVisible(false);
				p2.setVisible(false);
				c=1;
			}
			else 
			{
				c=0;
				p1.setVisible(true);
				p2.setVisible(true);
			}
		}
	}
	
	public static void main(String [] ar)
	{
		new awt_025();
	}
}
	

