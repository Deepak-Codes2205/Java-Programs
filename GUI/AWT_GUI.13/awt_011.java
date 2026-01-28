/* CALCULATOR */

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class awt_011 extends Frame implements Actionlistener
{
	Label l1,l2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	
	awt_011()
	{
		l1=new Label("Calculator");
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l1.setBounds(80,50,300,50);
		
		l2=new Label("0");
		l2.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l2.setBounds(20,110,215,50);
		l2.setBackground(new Color(245,245,245));
		
		
		b1=new Button("%");
		b1.setBounds(20,165,50,50);
		b1.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b1.addActionListener(this);
		
		
		b2=new Button("CE");
		b2.setBounds(75,165,50,50);
		b2.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b2.addActionListener(this);
		
		
		b3=new Button("C");
		b3.setBounds(130,165,50,50);
		b3.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b3.addActionListener(this);
		
		
		b4=new Button("CL");
		b4.setBounds(185,165,50,50);
		b4.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b4.addActionListener(this);
		
		
		b5=new Button("1/x");
		b5.setBounds(20,220,50,50);
		b5.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b5.addActionListener(this);
		
		
		b6=new Button("x^2");
		b6.setBounds(75,220,50,50);
		b6.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b6.addActionListener(this);
		
		
		b7=new Button("sqrt");
		b7.setBounds(130,220,50,50);
		b7.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b7.addActionListener(this);
		
		
		b8=new Button("/");
		b8.setBounds(185,220,50,50);
		b8.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b8.addActionListener(this);
		
		
		b9=new Button("7");
		b9.setBounds(20,275,50,50);
		b9.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b9.addActionListener(this);
		
		
		b10=new Button("8");
		b10.setBounds(75,275,50,50);
		b10.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b10.addActionListener(this);
		
		
		b11=new Button("9");
		b11.setBounds(130,275,50,50);
		b11.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b11.addActionListener(this);
		
		
		b12=new Button("*");
		b12.setBounds(185,275,50,50);
		b12.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b12.addActionListener(this);
		
		
		b13=new Button("4");
		b13.setBounds(20,330,50,50);
		b13.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b13.addActionListener(this);
		
		
		b14=new Button("5");
		b14.setBounds(75,330,50,50);
		b14.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b14.addActionListener(this);
		
		
		b15=new Button("6");
		b15.setBounds(130,330,50,50);
		b15.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b15.addActionListener(this);
		
		
		b16=new Button("-");
		b16.setBounds(185,330,50,50);
		b16.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b16.addActionListener(this);
		
		
		b17=new Button("1");
		b17.setBounds(20,385,50,50);
		b17.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b17.addActionListener(this);
		
		
		b18=new Button("2");
		b18.setBounds(75,385,50,50);
		b18.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b18.addActionListener(this);
		
		
		b19=new Button("3");
		b19.setBounds(130,385,50,50);
		b19.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b19.addActionListener(this);
		
		
		b20=new Button("+");
		b20.setBounds(185,385,50,50);
		b20.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b20.addActionListener(this);
		
		
		b21=new Button("+/-");
		b21.setBounds(20,440,50,50);
		b21.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b21.addActionListener(this);
		
		
		b22=new Button("0");
		b22.setBounds(75,440,50,50);
		b22.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b22.addActionListener(this);
		
		
		b23=new Button(".");
		b23.setBounds(130,440,50,50);
		b23.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b23.addActionListener(this);
		
		
		b24=new Button("=");
		b24.setBounds(185,440,50,50);
		b24.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b24.addActionListener(this);
		
		
		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		
		if(ae.getSource()==b2)
		
		if(ae.getSource()==b3)
		
		if(ae.getSource()==b4)
		
		if(ae.getSource()==b5)
		
		if(ae.getSource()==b6)
	
		if(ae.getSource()==b7)
		
		if(ae.getSource()==b8)
		
		if(ae.getSource()==b9)
			l2.setText(b9.getText());
			
		if(ae.getSource()==b10)
			l2.setText(b10.getText());
			
		if(ae.getSource()==b11)
			l2.setText(b11.getText());
			
		if(ae.getSource()==b12)
		
		if(ae.getSource()==b13)
			l2.setText(b13.getText());
			
		if(ae.getSource()==b14)
			l2.setText(b14.getText());
		
		if(ae.getSource()==b15)
			l2.setText(b15.getText());
			
		if(ae.getSource()==b16)
		
		if(ae.getSource()==b17)
			l2.setText(b17.getText());
			
		if(ae.getSource()==b18)
			l2.setText(b18.getText());
			
		if(ae.getSource()==b19)
			l2.setText(b19.getText());
			
		if(ae.getSource()==b20)
		
		if(ae.getSource()==b21)
		
		if(ae.getSource()==b22)
			l2.setText(b22.getText());
			
		if(ae.getSource()==b23)
		
		if(ae.getSource()==b24)	
	}

	public static void main(String [] ar)
	{
		new awt_011();
	}
}