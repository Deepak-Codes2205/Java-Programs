/* MOUSE LISTENER ADAPTER*/

import java.awt.*;
import java.awt.event.*;

class Event_hand11 extends Frame
{
	Event_hand11()
	{
	
		addMouseListener(new MouseAdapter()
		{    
			public void mouseClicked(MouseEvent me)
			{
				setBackground(Color.red);
			}
			public void mouseEntered(MouseEvent me)
			{
				setBackground(Color.blue);
			}
			public void mouseExited(MouseEvent me)
			{
				setBackground(Color.black);
			}
			public void mousePressed(MouseEvent me)
			{
				setBackground(Color.pink);
			}
			public void mouseReleased(MouseEvent me)
			{
				setBackground(Color.orange);
			}
		});
			
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] ar)
	{
		new Event_hand11();
	}
	
}

