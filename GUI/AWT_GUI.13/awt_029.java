/* CONSTRUCTORS AND METHODS OF Label,Button,..*/

import java.awt.*;
import java.awt.event.*;

class awt_029 extends Frame implements ActionListener
{
	Label  l1,l2,l3,l4,l5;
	Checkbox cb1,cb2,cb3,rb1,rb2;
	CheckboxGroup cbg;
	Button b1,b2,b3;
	boolean bol1,bol2,bol3,bol4,bol5;
	String msg1="";
	
	awt_029()
	{
		cbg=new CheckboxGroup();
		cb1=new Checkbox();
		cb1.setBounds(50,50,100,30);
		
		cb2=new Checkbox("Present");
		cb2.setBounds(50,90,100,30);
		
		cb3=new Checkbox("Present",true);
		cb3.setBounds(50,130,100,30);
		
		rb1=new Checkbox("Present",false,cbg);
		rb1.setBounds(50,170,100,30);
		
		rb2=new Checkbox("Present",cbg,true);
		rb2.setBounds(50,210,100,30);
		
		l1=new Label("st@cb1");
		l1.setBounds(170,50,100,30);
		l1.setBackground(new Color(237,237,237));
		
		l2=new Label("st@cb2");
		l2.setBounds(170,90,100,30);
		l2.setBackground(new Color(237,237,237));
		
		l3=new Label("st@cb3");
		l3.setBounds(170,130,100,30);
		l3.setBackground(new Color(237,237,237));
		
		l4=new Label("st@rb1");
		l4.setBounds(170,170,100,30);
		l4.setBackground(new Color(237,237,237));
		
		l5=new Label("st@rb2");
		l5.setBounds(170,210,100,30);
		l5.setBackground(new Color(237,237,237));
		
		b1=new Button("ChState");
		b1.setBounds(80,250,100,30);
		b1.addActionListener(this);
		
		b2=new Button("setState");
		b2.setBounds(80,290,100,30);
		b2.addActionListener(this);
		
		b3=new Button("getselect");
		b3.setBounds(80,330,100,30);
		b3.addActionListener(this);
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(rb1);
		add(rb2);
		
		add(b1);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(b1);
		add(b2);
		add(b3);
		
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			bol1=cb1.getState();
			l1.setText(String.valueOf(bol1));
			
			bol2=cb2.getState();
			l2.setText(String.valueOf(bol2));
			
			bol3=cb3.getState();
			l3.setText(String.valueOf(bol3));
			
			bol4=rb1.getState();
			l4.setText(String.valueOf(bol4));
			
			bol5=rb2.getState();
			l5.setText(String.valueOf(bol5));
		}
		
		if(ae.getSource()==b2)
		{
			cb1.setState(true);
			cb2.setState(true);
			cb3.setState(true);
		}
		
		if(ae.getSource()==b3)
		{
			msg1=cb1.GetSelectedCheckBox();
			
	}
	
	public static void main(String [] ar)
	{
		new awt_029();
	}
}
	