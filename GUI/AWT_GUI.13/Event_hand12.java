/* Key Listener */

import java.awt.*;
import java.awt.event.*;

class Event_hand12 extends Frame implements KeyListener
{
	TextField tf1,tf2;
	
	Event_hand12()
	{
		tf1=new TextField(20);
		tf1.addKeyListener(this);
		
		tf2=new TextField(20);
		
		add(tf1);
		add(tf2);
		
		setSize(200,200);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent ae)
	{
		System.out.println("Key Typed ");
	}
	
	public void keyPressed(KeyEvent ke)
	{
		System.out.println("Key Pressed ");
	}
	
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("Key Released ");
	}
	
	public static void main(String [] ar)
	{
		new Event_hand12();
	}
}


