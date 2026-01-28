/* LIST USING ITEM LISTENER */

import java.awt.*;
import java.awt.event.*;

class Event_hand3 extends Frame implements ItemListener
{
	List list1;
	Event_hand3()
	{
		list1=new List();
		list1.add("Red");
		list1.add("Green");
		list1.add("Blue");
		list1.add("Pink");
		list1.add("Black");
		list1.add("Purple");
		list1.setBounds(150,140,100,70);
		list1.addItemListener(this);
		add(list1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	} 
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==list1)
		{
			if(list1.getSelectedItem().equals("Red"))
			{
				setBackground(new Color(255,0,0));
			}
			
			else if(list1.getSelectedItem().equals("Green"))
			{
				setBackground(new Color(0,128,0));
			}
			
			else if(list1.getSelectedItem().equals("Blue"))
			{
				setBackground(new Color(0,0,255));
			}
			
			else if(list1.getSelectedItem().equals("Pink"))
			{
				setBackground(new Color(255,0,255));
			}
			
			else if(list1.getSelectedItem().equals("Black"))
			{
				setBackground(new Color(0,0,0));
			}
			else if(list1.getSelectedItem().equals("Purple"))
			{
				setBackground(new Color(128,0,128));
			}
		}
			
	}
	public static void main(String []ar)
	{
		new Event_hand3();
	}
}
	
	
	
	