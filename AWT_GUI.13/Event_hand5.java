/* MOUSE LISTENER */

import java.awt.*;
import java.awt.event.*;

class Event_hand5 extends Frame implements MouseListener
{
	Event_hand5()
	{
		addMouseListener(this);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent me) 
	{
		System.out.println(me.getX());
		System.out.println(me.getY());
		
		setBackground(Color.red);
	}
	
	public void mouseEntered(MouseEvent me) 
	{
		setBackground(Color.blue);
	}
	
	public void mouseExited(MouseEvent me) 
	{
		setBackground(Color.pink);
	}
	
	public void mousePressed(MouseEvent me) 
	{
		setBackground(Color.gray);
	}
	
	public void mouseReleased(MouseEvent me) 
	{
		setBackground(Color.orange);
	}
	public static void main(String[] ar)
	{
		new Event_hand5();
	}
	
}

