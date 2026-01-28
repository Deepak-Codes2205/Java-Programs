/* SET BOUNDS 
Ques:DICE GAME
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_010 extends Frame implements ActionListener 
{
	int c=0,n1=0,n2=0,p1=0,p2=0,k=0;
	Label l1,l2,l3,l4,l5,l6;
	TextField tf1,tf2,tf3,tf4,tf5;
	Button b1,b2,b3,b4;
	
	awt_010()
	{
		l1=new Label("DICE NUMBER GAME");
		l1.setBounds(100,50,300,50);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l1.setAlignment(Label.CENTER);
		
		l2=new Label("0");
		l2.setBounds(150,120,100,100);
		l2.setBackground(new Color(244,244,244));
		l2.setFont(new Font("Times New Roman",Font.PLAIN,24));
		l2.setAlignment(Label.CENTER);
		
		
		l3=new Label("PLAYER 1");
		l3.setBounds(80,240,100,20);
		
		l4=new Label("PLAYER 2");
		l4.setBounds(250,240,100,20);
		
		l5=new Label("Score");
		l5.setBounds(20,270,50,20);
		
		l6=new Label("Score");
		l6.setBounds(190,270,50,20);
		
		tf1=new TextField(20);
		tf1.setBounds(80,270,100,20);
		tf1.setEnabled(false);
		
		tf2=new TextField(20);
		tf2.setBounds(250,270,100,20);
		tf2.setEnabled(false);
		
		b1=new Button("Dice");
		b1.setBounds(100,310,50,20);
		b1.addActionListener(this);
		b1.setEnabled(false);
		
		b2=new Button("Dice");
		b2.setBounds(270,310,50,20);
		b2.addActionListener(this);
		b2.setEnabled(false);
		
		
		tf3=new TextField(20);
		tf3.setBounds(100,350,50,20);
		tf3.setEnabled(false);
		
		tf4=new TextField(20);
		tf4.setBounds(270,350,50,20);
		tf4.setEnabled(false);

		b3=new Button("Start");
		b3.setBounds(160,390,80,20);
		b3.addActionListener(this);
		
		b4=new Button("Restart");
		b4.setBounds(160,430,80,20);
		b4.addActionListener(this);
		
		tf5=new TextField(20);
		tf5.setBounds(100,470,220,20);
		tf5.setEnabled(false);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(tf3);
		add(tf4);
		add(b3);
		add(b4);
		add(tf5);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3)
		{
			b1.setEnabled(true);
			b2.setEnabled(true);
			tf1.setEnabled(true);
			tf2.setEnabled(true);
			tf3.setEnabled(true);
			tf4.setEnabled(true);
			tf5.setEnabled(true);
			
			tf1.setText("0");
			tf2.setText("0");
			tf3.setText("0");
			tf3.setText("0");
		}
		
		if(ae.getSource()==b4)
		{
			b1.setEnabled(true);
			b2.setEnabled(true);
			tf1.setEnabled(true);
			tf2.setEnabled(true);
			tf3.setEnabled(true);
			tf4.setEnabled(true);
			tf5.setEnabled(true);
		
			tf1.setText("0");
			tf2.setText("0");
			l2.setText("0");
			
			
			c=0;
			n1=0;
			n2=0;
			tf5.setText("MATCH Ongoing");
		}
		
		if(ae.getSource()==b1)
		{	
			c=c+1;
			
			for(int i=0;i<10;i++)
			{
				Random d=new Random();
				try{
					Thread.sleep(100);
				}catch(Exception e){}
				int dice1 =d.nextInt(6)+1;
				l2.setText(String.valueOf(dice1));
			}
			
			n1=n1+Integer.parseInt(l2.getText());
			tf1.setText(String.valueOf(n1));
			b2.setEnabled(true);
			b1.setEnabled(false);
			Matchwinner();
		}
		
		if(ae.getSource()==b2)
		{
			c=c+1;
			for(int i=0;i<10;i++)
			{
				Random d=new Random();
				try{
					Thread.sleep(100);
				}catch(Exception e){}
				int dice2 =d.nextInt(6)+1;
				l2.setText(String.valueOf(dice2));
			}
			
			n2=n2+Integer.parseInt(l2.getText());
			tf2.setText(String.valueOf(n2));
			b1.setEnabled(true);
			b2.setEnabled(false);
			Matchwinner();
		}
		
	}
	void Matchwinner()
	{
		if(c<10)
		{
			tf5.setText("Match ONGOING ");
		}
		else if(c==10)
		{	
			k=k+1;
			if(n1>n2)
			{
				p1=p1+1;
				tf5.setText("Matchwinner :player1");
				tf3.setText(String.valueOf(p1));
				Finalwinner();
			}
			else if(n2>n1)
			{
				p2=p2+1;
				tf5.setText("Matchwinner :player2");
				tf4.setText(String.valueOf(p2));
				Finalwinner();
			}
			
			else if(n1==n2)
			{
				tf5.setText("MATCH DRAW");
				Finalwinner();
			}
			
			b1.setEnabled(false);
			b2.setEnabled(false);
			tf1.setEnabled(false);
			tf2.setEnabled(false);
			tf3.setEnabled(false);
			tf4.setEnabled(false);
			tf5.setEnabled(false);
		}
	
	}
	void Finalwinner()
	{
		if(k==5)
		{
			if(p1>p2)
				tf5.setText("Final winner :Player1");
			else if(p2>p1)
				tf5.setText("Final winner :Player2");
			else if(p1==p2)
				tf5.setText("Finals : Draw");
			b1.setEnabled(false);
			b2.setEnabled(false);
			tf1.setEnabled(false);
			tf2.setEnabled(false);
			tf3.setEnabled(false);
			tf4.setEnabled(false);
			tf5.setEnabled(false);
		}
	}
	
	public static void main(String [] ar)
	{
		new awt_010();
	}
}

		
		
		