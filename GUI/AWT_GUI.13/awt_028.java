/* CONSTRUCTORS AND METHODS OF Label,Button,..*/

import java.awt.*;
import java.awt.event.*;

class awt_028 extends Frame implements ActionListener
{
	Label l1;
	Button b1,b2,b3,b4,b5,b6;
	Checkbox cb1,cb2,cb3,rb1,rb2;
	CheckboxGroup cbg;
	
	String nm="";
	
	
	
	awt_028()
	{
		cbg=new CheckboxGroup();
		l1=new Label("label");
		l1.setBounds(100,50,100,50);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l1.setBackground(new Color(237,237,237));
		
		b1=new Button("Left");
		b1.setBounds(50,120,100,30);
		b1.addActionListener(this);
		
		b2=new Button("Center");
		b2.setBounds(170,120,100,30);
		b2.addActionListener(this);
		
		b3=new Button("Right");
		b3.setBounds(290,120,100,30);
		b3.addActionListener(this);
		
		b4=new Button("Alignment");
		b4.setBounds(170,170,100,30);
		b4.addActionListener(this);
		
		b5=new Button("Button.1");
		b5.setBounds(100,220,100,30);
		b5.addActionListener(this);
		
		b6=new Button("Button.2");
		b6.setBounds(220,220,100,30);
		b6.addActionListener(this);
		
		cb1=new Checkbox();
		cb1.setBounds(100,270,100,20);
		
		cb2=new Checkbox("Present");
		cb2.setBounds(100,300,100,20);
		
		cb3=new Checkbox("Present",true);
		cb3.setBounds(100,330,100,20);
		
		rb1=new Checkbox("Present",false,cbg);
		rb1.setBounds(100,360,100,20);
		
		rb2=new Checkbox("Present",cbg,true);
		rb2.setBounds(100,390,100,20);
		
		
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(cb1);
		add(cb2);
		add(cb3);
		add(rb1);
		add(rb2);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			l1.setAlignment(Label.LEFT);
		
		if(ae.getSource()==b2)
			l1.setAlignment(Label.CENTER);
		
		if(ae.getSource()==b3)
			l1.setAlignment(Label.RIGHT);
		
		if(ae.getSource()==b4)
			b4.setLabel(String.valueOf(l1.getAlignment()));
		
		if(ae.getSource()==b5)
		{
			nm=b5.getLabel();
			b5.setLabel(String.valueOf(b6.getLabel()));
			b6.setLabel(nm);
		}
		
		if(ae.getSource()==b6)
		{
			nm=b6.getLabel();
			b6.setLabel(String.valueOf(b5.getLabel()));
			b5.setLabel(nm);
		}
			
	}
	
	public static void main(String [] ar)
	{
		new awt_028();
	}
}