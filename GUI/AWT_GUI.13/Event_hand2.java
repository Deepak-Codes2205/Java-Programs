import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Event_hand2 extends Frame implements ItemListener
{
	Checkbox cb1,cb2,cb3,cb4;
	
	Event_hand2()
	{
	
		cb1=new Checkbox("First");
		cb1.setBounds(50,50,80,20);
		cb1.addItemListener(this);
		
		cb2=new Checkbox("Second");
		cb2.setBounds(140,50,80,20);
		cb2.addItemListener(this);
		
		cb3=new Checkbox("Third");
		cb3.setBounds(230,50,80,20);
		cb3.addItemListener(this);
		
		cb4=new Checkbox("Fourth");
		cb4.setBounds(320,50,80,20);
		cb4.addItemListener(this);
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			if(cb1.getState()==false)
			{
				cb1.setState(false);
				cb2.setState(false);
				cb3.setState(false);
				cb4.setState(false);
				cb1.setBackground(new Color(255,255,255));
				cb2.setBackground(new Color(255,255,255));
				cb3.setBackground(new Color(255,255,255));
				cb4.setBackground(new Color(255,255,255));
			}
			else 
			{
				cb1.setBackground(new Color(255,0,0));
				cb2.setBackground(new Color(0,128,0));
				cb3.setBackground(new Color(0,128,0));
				cb4.setBackground(new Color(0,128,0));
			}
		}
			
		if(ie.getSource()==cb2)
		{
			if(cb2.getState()==false)
			{
				cb1.setState(false);
				cb2.setState(false);
				cb3.setState(false);
				cb4.setState(false);
				cb1.setBackground(new Color(255,255,255));
				cb2.setBackground(new Color(255,255,255));
				cb3.setBackground(new Color(255,255,255));
				cb4.setBackground(new Color(255,255,255));
			}
			else 
			{
				cb2.setBackground(new Color(255,0,0));
				cb1.setBackground(new Color(0,128,0));
				cb3.setBackground(new Color(0,128,0));
				cb4.setBackground(new Color(0,128,0));
			}
		}
		
		if(ie.getSource()==cb3)
		{
			if(cb3.getState()==false)
			{
				cb1.setState(false);
				cb2.setState(false);
				cb3.setState(false);
				cb4.setState(false);
				cb1.setBackground(new Color(255,255,255));
				cb2.setBackground(new Color(255,255,255));
				cb3.setBackground(new Color(255,255,255));
				cb4.setBackground(new Color(255,255,255));
			}
			else 
			{
				cb3.setBackground(new Color(255,0,0));
				cb1.setBackground(new Color(0,128,0));
				cb2.setBackground(new Color(0,128,0));
				cb4.setBackground(new Color(0,128,0));
			}
		}
		
		if(ie.getSource()==cb4)
		{
			if(cb4.getState()==false)
			{
				cb1.setState(false);
				cb2.setState(false);
				cb3.setState(false);
				cb4.setState(false);
				cb1.setBackground(new Color(255,255,255));
				cb2.setBackground(new Color(255,255,255));
				cb3.setBackground(new Color(255,255,255));
				cb4.setBackground(new Color(255,255,255));
			}
			else 
			{
				cb4.setBackground(new Color(255,0,0));
				cb1.setBackground(new Color(0,128,0));
				cb2.setBackground(new Color(0,128,0));
				cb3.setBackground(new Color(0,128,0));
			}
		}

	}
	
	public static void main(String [] ar)
	{
		new Event_hand2();
	}
}