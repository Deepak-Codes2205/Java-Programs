/* Scroll bars  and  TextArea Methods */

import java.awt.*;
import java.awt.event.*;
class awt_034 extends Frame implements ActionListener
{
	TextArea ta;
	Scrollbar sb;
	Button b1;
	
	awt_034()
	{
		
		ta=new TextArea("Address Here ",10,10,0); /* 0 for both scroll bar ,1 and 2 only for one scroll bar and 3 for no scroll bar */
		ta.setBounds(50,50,200,200);
		
		sb=new Scrollbar();
		sb.setBounds(50,270,20,200);
		sb.setValues(1,5,1,100);
		
		b1=new Button("Methods");
		b1.setBounds(90,270,100,30);
		b1.addActionListener(this);
	
		add(ta);
		add(sb);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int x=sb.getValue();
			System.out.println("Current Value is :"+x);
			
			// sb.setValue(80);
			// int y=sb.getValue();
			// System.out.println("New Value is "+y);
			
			int max=sb.getMaximum();
			int min=sb.getMinimum();
			
			System.out.println("Maximum Value : "+max);
			
			System.out.println("Minimum Values :"+min);
			
			System.out.println("\n");
			
			sb.setBlockIncrement(5);
			//sb.setUnitIncrement(3);
			
		}
	}
	public static void main(String [] ar)
	{
		new awt_034();
	}
}
