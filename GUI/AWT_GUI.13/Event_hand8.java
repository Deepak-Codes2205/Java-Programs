/* WINDOW LISTENER */

import java.awt.*;
import java.awt.event.*;

class Event_hand8 extends Frame implements WindowListener
{
	Event_hand8()
	{
		addWindowListener(this);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void windowActivated(WindowEvent we) 
	{
		System.out.println("windowActivated");
	} 
	
	public void windowClosed(WindowEvent we) 
	{
		System.out.println("windowClosed");
	}
	
	public void windowClosing(WindowEvent we) 
	{
		System.out.println("windowClosing");
		System.exit(0);
	
	
	public void windowDeactivated(WindowEvent we) 
	{
		System.out.println("windowDeactivated");
	}
	
	public void windowDeiconified(WindowEvent we) 
	{
		System.out.println("windowDeiconified");
	}
	
	public void windowIconified(WindowEvent we) 
	{
		System.out.println("windowIconified");
	}
	
	public void windowOpened(WindowEvent we) 
	{
		System.out.println("windowOpened");
	}
	
	public static void main(String[] ar)
	{
		new Event_hand8();
	}
	
}

