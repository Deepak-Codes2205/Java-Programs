/* MOUSE MOTION LISTENER */

import java.awt.*;
import java.awt.event.*;

class Event_hand7 extends Frame implements MouseMotionListener
{
	Event_hand7()
	{
		addMouseMotionListener(this);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseDragged(MouseEvent me) 
	{
		//System.out.println(me.getX());
		//System.out.println(me.getY());
		
		setBackground(Color.red);
	}
	
	public void mouseMoved(MouseEvent me) 
	{
		setBackground(Color.blue);
	}
	
	public static void main(String[] ar)
	{
		new Event_hand7();
	}
	
}

