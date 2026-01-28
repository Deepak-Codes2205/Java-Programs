import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_018 extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	Checkbox cb1,cb2,cb3;
	
	awt_018()
	{
		cb1=new Checkbox("Hobby1");
		cb1.setBounds(100,50,100,20);
		cb2=new Checkbox("Hobby2");
		cb2.setBounds(210,50,100,20);
		cb3=new Checkbox("Hobby3");
		cb3.setBounds(320,50,100,20);
		
		l1=new Label("MY LABEL");
		l1.setBounds(100,100,200,50);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(new Color(244,244,244));
		
		b1=new Button("BUTTON");
		b1.setBounds(100,160,100,30);
		b1.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b1.addActionListener(this);
		
		
		add(cb1);
		add(cb2);
		add(cb3);
		
		add(l1);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String msg="";
		if(cb1.getState()==true)
			msg+=" "+cb1.getLabel();
		if(cb2.getState()==true)
			msg+=" "+cb2.getLabel();
		if(cb3.getState()==true)
			msg+=" "+cb3.getLabel();
		
		l1.setText(msg);
	}
	
	public static void main(String [] ar)
	{
		new awt_018();
	}
}
		
		
		