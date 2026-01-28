import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Event_hand1 extends Frame implements ItemListener
{
	Checkbox rb1,rb2,rb3;
	CheckboxGroup cbg;
	
	Event_hand1()
	{
		cbg=new CheckboxGroup();
		rb1=new Checkbox("Red",true,cbg);
		rb1.setBounds(50,50,100,20);
		rb1.addItemListener(this);
		
		rb2=new Checkbox("Green",false,cbg);
		rb2.setBounds(170,50,100,20);
		rb2.addItemListener(this);
		
		rb3=new Checkbox("Blue",cbg,false);
		rb3.setBounds(290,50,100,20);
		rb3.addItemListener(this);
		
		add(rb1);
		add(rb2);
		add(rb3);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==rb1)
			setBackground(new Color(255,0,0));
			
		else if(ie.getSource()==rb2)
			setBackground(new Color(0,128,0));
		
		else if(ie.getSource()==rb3)
			setBackground(new Color(0,0,255 ));
	}
	
	public static void main(String [] ar)
	{
		new Event_hand1();
	}
}