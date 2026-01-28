/* PANELS */

import java.awt.*;
import java.awt.event.*;

class border_layout1 extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	Button b1,b2,b3;
	Panel p1,p2,p3;
	int c=0;
	
	border_layout1()
	{
		p1=new Panel();
		p1.setBounds(10,30,200,200);
		p1.setBackground(Color.red);
		p1.setLayout(null);

		p2=new Panel();
		p2.setBounds(220,30,200,200);
		p2.setBackground(Color.blue);
		p2.setLayout(null);
		
		p3=new Panel();
		p2.setBounds(430,30,200,200);
		p3.setBackground(Color.green);
		p3.setLayout(null);
		
		
		l1=new Label("NUM1");
		l1.setBounds(50,50,70,30);
		l1.setBackground(Color.gray);
		
		tf1=new TextField(20);
		tf1.setBounds(130,50,70,30);
		
		l2=new Label("NUM2");
		l2.setBounds(50,100,70,30);
		l2.setBackground(Color.gray);
		
		tf2=new TextField(20);
		tf2.setBounds(130,100,70,30);
		
		l3=new Label("SUM");
		l3.setBounds(50,140,70,30);
		l3.setBackground(Color.gray);
		
		tf3=new TextField(20);
		tf3.setBounds(130,140,70,30);
		
		b1=new Button("Cal:SUM");
		b1.setBounds(100,180,100,30);
		
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);
		p1.add(b1);
		
		
		l4=new Label("PRINCIPAL");
		l4.setBounds(50,50,70,30);
		l4.setBackground(Color.gray);
		
		tf4=new TextField(20);
		tf4.setBounds(130,50,70,30);
		
		l5=new Label("RATE");
		l5.setBounds(50,100,70,30);
		l5.setBackground(Color.gray);
		
		tf5=new TextField(20);
		tf5.setBounds(130,100,70,30);
		
		l6=new Label("TIME");
		l6.setBounds(50,140,70,30);
		l6.setBackground(Color.gray);
		
		tf6=new TextField(20);
		tf6.setBounds(130,140,70,30);
		
		l7=new Label("SI");
		l7.setBounds(50,180,70,30);
		l7.setBackground(Color.gray);
		
		tf7=new TextField(20);
		tf7.setBounds(130,180,70,30);
		
		b2=new Button("Cal:SI");
		b2.setBounds(100,220,100,30);
		
		p2.add(l4);
		p2.add(tf4);
		p2.add(l5);
		p2.add(tf5);
		p2.add(l6);
		p2.add(tf6);
		p2.add(l7);
		p2.add(tf7);
		p2.add(b2);
		
		l8=new Label("NUM1");
		l8.setBounds(50,50,70,30);
		l8.setBackground(Color.gray);
		
		tf8=new TextField(20);
		tf8.setBounds(130,50,70,30);
		
		l9=new Label("NUM2");
		l9.setBounds(50,100,70,30);
		l9.setBackground(Color.gray);
		
		tf9=new TextField(20);
		tf9.setBounds(130,100,100,20);
		
		l10=new Label("NUM3");
		l10.setBounds(50,140,70,30);
		l10.setBackground(Color.gray);
		
		tf10=new TextField(20);
		tf10.setBounds(130,140,70,30);
		
		l11=new Label("GREAT");
		l11.setBounds(50,180,70,30);
		l11.setBackground(Color.gray);
		
		tf11=new TextField(20);
		tf11.setBounds(130,180,70,30);
		
		b3=new Button("Cal:GREAT");
		b3.setBounds(100,220,100,30);
		
		p3.add(l8);
		p3.add(tf8);
		p3.add(l9);
		p3.add(tf9);
		p3.add(l10);
		p3.add(tf10);
		p3.add(l11);
		p3.add(tf11);
		p3.add(b3);
		
		add(p1,BorderLayout.WEST);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.EAST);
		setSize(800,800);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		// if(ae.getSource()==b1)
		// {
			// if(c==0)
			// {
				// p1.setVisible(false);
				// p2.setVisible(false);
				// c=1;
			// }
			// else 
			// {
				// c=0;
				// p1.setVisible(true);
				// p2.setVisible(true);
			// }
		// }
	}
	
	public static void main(String [] ar)
	{
		new border_layout1();
	}
}
	

