/* TEXT LISTENER */

import java.awt.*;
import java.awt.event.*;

class Event_hand6 extends Frame implements TextListener
{
	TextArea ta;
	String str1="";
	Event_hand6()
	{
		ta=new TextArea("write here",10,10,0);
		ta.addTextListener(this);
		add(ta);
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	public void textValueChanged(TextEvent te)
	{
		System.out.println(ta.getText().length());
		str1=ta.getText();
		str1=str1.toUpperCase();
		System.out.println(str1);
		ta.setText(str1);
	}
	
	public static void main(String [] ar)
	{
		new Event_hand6();
	}
}