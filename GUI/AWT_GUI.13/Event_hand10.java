/* MOUSE MOTION LISTENER ADAPTER*/

import java.awt.*;
import java.awt.event.*;

class Event_hand10 extends Frame
{
	Event_hand10()
	{
	
		addMouseMotionListener(new MouseMotionAdapter()
		{    
			public void mouseDragged(MouseEvent me)
			{
				setBackground(Color.red);
			}
			public void mouseMoved(MouseEvent me)
			{
				setBackground(Color.blue);
			}
		});
			
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] ar)
	{
		new Event_hand10();
	}
	
}

