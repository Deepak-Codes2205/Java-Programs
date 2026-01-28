import java.awt.*;
import java.awt.event.*;

class awt_013 extends Frame implements ActionListener
{
	Button b1[]=new Button[10];
	int x=50;
	awt_013()
	{
		for(int i=0;i<b1.length;i++)
		{
			b1[i]=new Button(String.valueOf(i));
			b1[i].setBounds(x,50,50,50);
			x+=55;
			b1[i].addActionListener(this);
			add(b1[i]);
		}
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		for(int i=0;i<b1.length;i++)
		{
			if(ae.getSource()==b1[i])
				System.out.println(b1[i].getLabel());
		}
	}
	public static void main(String [] ar)
	{
		new awt_013();
	}
}