/* WINDOW LISTENER ADAPTER */

import java.awt.*;
import java.awt.event.*;

class Event_hand9 extends Frame
{
	Event_hand9()
	{
		
		addWindowListener(new WindowAdapter() 
		{    
            public void windowClosing(WindowEvent e) 
			{    
                dispose();    
            }   			
		});    
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] ar)
	{
		new Event_hand9();
	}
	
}

