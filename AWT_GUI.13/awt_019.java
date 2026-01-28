/* SET BOUNDS 
Ques: KUMAI SWEETS SHOP
*/

import java.awt.*;
import java.awt.event.*;

class awt_019 extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	Button b1,b2;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	
	awt_019()
	{
		l1=new Label("KUMAI SWEETS SHOP");
		l1.setBounds(150,50,200,50);
		
		l2=new Label("Samosa@10");
		l2.setBounds(50,150,100,20);
		
		l3=new Label("Tea@15");
		l3.setBounds(50,190,100,20);
		
		l4=new Label("coffee@25");
		l4.setBounds(50,230,100,20);
		
		l5=new Label("Total");
		l5.setBounds(200,270,80,20);
		
		l6=new Label("Dis");
		l6.setBounds(200,310,80,20);
		
		l7=new Label("Amt");
		l7.setBounds(200,350,80,20);
		
		tf1=new TextField(20);
		tf1.setBounds(170,150,100,20);
		
		tf2=new TextField(20);
		tf2.setBounds(290,150,100,20);
		tf2.setEnabled(false);// this field will be calculated ,therefore user input is not required so we are restricting user input in this textfield .
		
		cb1=new Checkbox("Chole");
		cb1.setBounds(410,150,100,20);
		
		cb2=new Checkbox("kadi");
		cb2.setBounds(530,150,100,20);
		
		tf3=new TextField(20);
		tf3.setBounds(170,190,100,20);
		
		tf4=new TextField(20);
		tf4.setBounds(290,190,100,20);
		tf4.setEnabled(false);// this field will be calculated ,therefore user input is not required so we are restricting user input in this textfield .
		
		cb3=new Checkbox("Cutting");
		cb3.setBounds(410,190,100,20);
		
		cb4=new Checkbox("Masala");
		cb4.setBounds(530,190,100,20);
		
		tf5=new TextField(20);
		tf5.setBounds(170,230,100,20);
		
		tf6=new TextField(20);
		tf6.setBounds(290,230,100,20);
		tf6.setEnabled(false);// this field will be calculated ,therefore user input is not required so we are restricting user input in this textfield .*/
		
		cb5=new Checkbox("Capechino");
		cb5.setBounds(410,230,100,20);
		
		cb6=new Checkbox("Latte");
		cb6.setBounds(530,230,100,20);
		
		tf7=new TextField(20);
		tf7.setBounds(290,270,100,20);
		tf7.setEnabled(false);// this field will be calculated ,therefore user input is not required so we are restricting user input in this textfield .
		
		tf8=new TextField(20);
		tf8.setBounds(290,310,100,20);
		tf8.setEnabled(false);// this field will be calculated ,therefore user input is not required so we are restricting user input in this textfield .
		
		tf9=new TextField(20);
		tf9.setBounds(290,350,100,20);
		tf9.setEnabled(false);// this field will be calculated ,therefore user input is not required so we are restricting user input in this textfield .
		
		b1=new Button("Calculate Bill");
		b1.setBounds(80,390,100,20);
		b1.addActionListener(this);
		
		b2=new Button("Cancel");
		b2.setBounds(200,390,100,20);
		b2.addActionListener(this);
		
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		
		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		add(l3);
		add(tf3);
		add(tf4);
		add(l4);
		add(tf5);
		add(tf6);
		add(l5);
		add(tf7);
		add(l6);
		add(tf8);
		add(l7);
		add(tf9);
		add(b1);
		add(b2);
		
		setSize(600,600);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		int c=0,d=0,e=0,f=0,g=0,h=0,a1=0,a2=0,a3=0;
		
		if(ae.getSource()==b1)
		{
			a1=Integer.parseInt(tf1.getText());
			a2=Integer.parseInt(tf3.getText());
			a3=Integer.parseInt(tf5.getText());
			
			c=a1*10;
			d=a2*15;
			e=a3*25;
			
			if(cb1.getState()==true || cb2.getState()==true)
				c=a1*20;	
			if(cb1.getState()==true && cb2.getState()==true)
				c=a1*30;
			
			if(cb3.getState()==true || cb4.getState()==true)
				d=a2*25;
			if(cb3.getState()==true && cb4.getState()==true)
				d=a2*35;
			
			if(cb5.getState()==true || cb6.getState()==true)
				e=a3*35;
			if(cb5.getState()==true && cb6.getState()==true)
				e=a3*45;
				
			tf2.setText(String.valueOf(c));
			tf4.setText(String.valueOf(d));
			tf6.setText(String.valueOf(e));
			
			f=c+d+e;
			g=(f*10)/100;
			h=f-g;
			
			tf7.setText(String.valueOf(f));
			tf8.setText(String.valueOf(g));
			tf9.setText(String.valueOf(h));
		}
		
		
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			tf7.setText("");
			tf8.setText("");
			tf9.setText("");
		}
		
	}
	
	public static void main(String []ar)
	{
		new awt_019();
	}
}
			
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		