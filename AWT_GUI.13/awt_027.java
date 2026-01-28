import java.awt.*;
import java.awt.event.*;
class awt_027 extends Frame
{
	TextArea ta;
	ScrollPane sb;
	
	awt_027()
	{
		ta=new TextArea("Address Here ",10,10,0); /* 0 for both scroll bar ,1 and 2 only for one scroll bar and 3 for no scroll bar */
		ta.setBounds(50,50,200,200);
	
		add(ta);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String [] ar)
	{
		new awt_027();
	}
}
