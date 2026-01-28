/* SET BOUNDS 
Ques: TIC TAK TOE
*/

import java.awt.*;
import java.awt.event.*;

class awt_008 extends Frame implements ActionListener
{
	int c=0,a=0,b=0,m=0;
	String k="";
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3,tf4;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	awt_008()
	{
		l1=new Label("TIC TAK TOE ");
		l1.setBounds(100,50,100,70);
		
		b1=new Button("1");
		b1.setBounds(50,170,50,70);
		b1.addActionListener(this);
		
		b2=new Button("2");
		b2.setBounds(110,170,50,70);
		b2.addActionListener(this);
		
		b3=new Button("3");
		b3.setBounds(170,170,50,70);
		b3.addActionListener(this);
		
		b4=new Button("4");
		b4.setBounds(50,250,50,70);
		b4.addActionListener(this);
		
		b5=new Button("5");
		b5.setBounds(110,250,50,70);
		b5.addActionListener(this);
		
		b6=new Button("6");
		b6.setBounds(170,250,50,70);
		b6.addActionListener(this);
		
		b7=new Button("7");
		b7.setBounds(50,330,50,70);
		b7.addActionListener(this);
		
		b8=new Button("8");
		b8.setBounds(110,330,50,70);
		b8.addActionListener(this);
		
		b9=new Button("9");
		b9.setBounds(170,330,50,70);
		b9.addActionListener(this);
		
		tf1=new TextField(20);
		tf1.setBounds(50,420,170,30);
		
		b10=new Button("Restart");
		b10.setBounds(80,470,100,30);
		b10.addActionListener(this);
		
		l2=new Label("0's score");
		l2.setBounds(280,170,100,40);
			
		tf2=new TextField(20);
		tf2.setBounds(280,220,100,40);
		tf2.setText(String.valueOf(a));
		
		l3=new Label("X's score");
		l3.setBounds(280,280,100,40);
		
		tf3=new TextField(20);
		tf3.setBounds(280,330,100,40);
		tf3.setText(String.valueOf(b));
		
		l4=new Label("Final Winner ");
		l4.setBounds(280,390,100,40);
		
		tf4=new TextField(20);
		tf4.setBounds(280,440,100,40);
		
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(tf1);
		add(b10);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(l4);
		add(tf4);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b10)
		{
			c=0;
			b1.setLabel("1");
			b1.setEnabled(true);
			
			b2.setLabel("2");
			b2.setEnabled(true);
			
			b3.setLabel("3");
			b3.setEnabled(true);
			
			b4.setLabel("4");
			b4.setEnabled(true);
			
			b5.setLabel("5");
			b5.setEnabled(true);
			
			b6.setLabel("6");
			b6.setEnabled(true);
			
			b7.setLabel("7");
			b7.setEnabled(true);
			
			b8.setLabel("8");
			b8.setEnabled(true);
			
			b9.setLabel("9");
			b9.setEnabled(true);
			if(m==0)
			{
				tf2.setText(String.valueOf(a));
				tf3.setText(String.valueOf(b));
			}
		}
		String symbol=(c%2==0)?"0":"X";
		if(ae.getSource()==b1)
		{
			c++;
			b1.setLabel(symbol);
			b1.setEnabled(false);
			winner();
		}
		if(ae.getSource()==b2)
		{
			c++;
			b2.setLabel(symbol);
			b2.setEnabled(false);
			winner();
		}
		if(ae.getSource()==b3)
		{
			c++;
			b3.setLabel(symbol);
			b3.setEnabled(false);
			winner();
		}
		
		if(ae.getSource()==b4)
		{
			c++;
			b4.setLabel(symbol);
			b4.setEnabled(false);
			winner();
		}
		
		if(ae.getSource()==b5)
		{
			c++;
			b5.setLabel(symbol);
			b5.setEnabled(false);
			winner();
		}
		
		if(ae.getSource()==b6)
		{
			c++;
			b6.setLabel(symbol);
			b6.setEnabled(false);
			winner();
		}
		
		if(ae.getSource()==b7)
		{
			c++;
			b7.setLabel(symbol);
			b7.setEnabled(false);
			winner();
		}
		
		if(ae.getSource()==b8)
		{
			c++;
			b8.setLabel(symbol);
			b8.setEnabled(false);
			winner();
		}
		
		if(ae.getSource()==b9)
		{
			c++;
			b9.setLabel(symbol);
			b9.setEnabled(false);
			winner();
		}
		System.out.println(c);
	}
	
		void winner()
		{
			String s1=b1.getLabel();
			String s2=b2.getLabel();
			String s3=b3.getLabel();
			String s4=b4.getLabel();
			String s5=b5.getLabel();
			String s6=b6.getLabel();
			String s7=b7.getLabel();
			String s8=b8.getLabel();
			String s9=b9.getLabel();
			
			if(s1==s2 && s2==s3)
				k=s1;
			
			else if(s4==s5 && s5==s6)
				k=s4;
			
			else if(s7==s8 && s8==s9)
				k=s7;
			
			else if(s1==s4 && s4==s7)
				k=s1;
			
			else if(s2==s5 && s5==s8)
				k=s2;
			
			else if(s3==s6 && s6==s9)
				k=s3;
			
			else if(s1==s5 && s5==s9)
				k=s1;
			
			else if(s3==s5 && s5==s7)
				k=s3;
			else
				k="!";
			
			if(m<=5)
			{
				if(k.equals("0"))
				{
					tf1.setText("WINNER : 0");
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);					
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					a=a+1;
					m++;
					tf2.setText(String.valueOf(a));
				}
						
				else if(k.equals("X"))
				{
					tf1.setText("WINNER :X");
					b1.setEnabled(false);				
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					b=b+1;
					m++;
					tf3.setText(String.valueOf(b));
				}
				else if(k.equals("!"))
					tf1.setText("match Ongoing");
				
				if(m==5)
				{
					if(a>b)
						tf4.setText("Final Winner : 0");
					else if(a<b)
						tf4.setText("Final Winner : X");
					m=0;
					a=0;
					b=0;
				}
			}	
		}
		
		
	public static void main(String [] ar)
	{
		new awt_008();
	}
}
	
		
		
		
		