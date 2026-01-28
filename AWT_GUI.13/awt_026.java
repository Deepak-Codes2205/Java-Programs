/* PANELS */

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_026 extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,
	b27,b28,b29,b30,b31,b32,b102,b103,b104,b105;
	Panel p1,p2,p3;
	int count=0;
	int c=0,a=0,b=0,m=0,l=0,n1=0,n2=0,plx1=0,plx2=0,h=0,q=0,q1=0,g=0,f=0,e=0,pm1=0,pm2=0,pm3=0;;
	String k="",ply1="",ply2="";
	String arr[]={"","","","","","","","","","","","","","","","",};
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	
	awt_026()
	{
		p1=new Panel();
		p1.setBounds(160,30,500,500);
		p1.setBackground(Color.red);
		p1.setLayout(null);
		
		l1=new Label("TIC TAK TOE ");
		l1.setBounds(100,50,100,70);
		
		b1=new Button("1");
		b1.setBounds(50,170,50,70);
		b1.addActionListener(this);
		b1.setEnabled(false);
		
		b2=new Button("2");
		b2.setBounds(110,170,50,70);
		b2.addActionListener(this);
		b2.setEnabled(false);
		
		b3=new Button("3");
		b3.setBounds(170,170,50,70);
		b3.addActionListener(this);
		b3.setEnabled(false);
		
		b4=new Button("4");
		b4.setBounds(50,250,50,70);
		b4.addActionListener(this);
		b4.setEnabled(false);
		
		b5=new Button("5");
		b5.setBounds(110,250,50,70);
		b5.addActionListener(this);
		b5.setEnabled(false);
		
		b6=new Button("6");
		b6.setBounds(170,250,50,70);
		b6.addActionListener(this);
		b6.setEnabled(false);
		
		b7=new Button("7");
		b7.setBounds(50,330,50,70);
		b7.addActionListener(this);
		b7.setEnabled(false);
		
		b8=new Button("8");
		b8.setBounds(110,330,50,70);
		b8.addActionListener(this);
		b8.setEnabled(false);
		
		b9=new Button("9");
		b9.setBounds(170,330,50,70);
		b9.addActionListener(this);
		b9.setEnabled(false);
		
		tf1=new TextField(20);
		tf1.setBounds(50,420,170,30);
		
		b10=new Button("Restart");
		b10.setBounds(80,470,100,30);
		b10.setEnabled(false);
		b10.addActionListener(this);
		
		l2=new Label("Player1 score");
		l2.setBounds(280,170,100,40);
		l2.setEnabled(false);
			
		tf2=new TextField(20);
		tf2.setBounds(280,220,100,40);
		tf2.setText(String.valueOf(a));
		tf2.setEnabled(false);
		
		l3=new Label("Player2 score");
		l3.setBounds(280,280,100,40);
		l3.setEnabled(false);
		
		tf3=new TextField(20);
		tf3.setBounds(280,330,100,40);
		tf3.setText(String.valueOf(b));
		tf3.setEnabled(false);
		
		l4=new Label("Final Winner ");
		l4.setBounds(280,390,100,40);
		l4.setEnabled(false);
		
		tf4=new TextField(20);
		tf4.setBounds(280,440,100,40);
		tf4.setEnabled(false);
		
		l5=new Label("Player 1 : 0");
		l5.setBounds(250,50,100,20);
		
		l6=new Label("Player 2 : X");
		l6.setBounds(370,50,100,20);
		
		tf5=new TextField(20);
		tf5.setBounds(250,90,100,20);
		
		tf6=new TextField(20);
		tf6.setBounds(370,90,100,20);
		
		b11=new Button("Start");
		b11.setBounds(280,130,100,30);
		b11.addActionListener(this);
		
		
		p1.add(l1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(tf1);
		p1.add(b10);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(tf3);
		p1.add(l4);
		p1.add(tf4);
		p1.add(l5);
		p1.add(l6);
		p1.add(tf5);
		p1.add(tf6);
		p1.add(b11);
		
		
		// Second Panel Making
		p2=new Panel();
		p2.setBounds(160,30,500,500);
		p2.setBackground(Color.green);
		p2.setLayout(null);
		
		l7=new Label("DICE NUMBER GAME");
		l7.setBounds(100,50,300,50);
		l7.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l7.setAlignment(Label.CENTER);
		
		l8=new Label("0");
		l8.setBounds(150,120,100,100);
		l8.setBackground(new Color(244,244,244));
		l8.setFont(new Font("Times New Roman",Font.PLAIN,24));
		l8.setAlignment(Label.CENTER);
		
		
		l9=new Label("PLAYER 1");
		l9.setBounds(80,240,100,20);
		
		l10=new Label("PLAYER 2");
		l10.setBounds(250,240,100,20);
		
		l11=new Label("Score");
		l11.setBounds(20,270,50,20);
		
		l12=new Label("Score");
		l12.setBounds(190,270,50,20);
		
		tf7=new TextField(20);
		tf7.setBounds(80,270,100,20);
		tf7.setEnabled(false);
		
		tf8=new TextField(20);
		tf8.setBounds(250,270,100,20);
		tf8.setEnabled(false);
		
		b12=new Button("Dice");
		b12.setBounds(100,310,50,20);
		b12.addActionListener(this);
		b12.setEnabled(false);
		
		b13=new Button("Dice");
		b13.setBounds(270,310,50,20);
		b13.addActionListener(this);
		b13.setEnabled(false);
		
		
		tf9=new TextField(20);
		tf9.setBounds(100,350,50,20);
		tf9.setEnabled(false);
		
		tf10=new TextField(20);
		tf10.setBounds(270,350,50,20);
		tf10.setEnabled(false);

		b14=new Button("Start");
		b14.setBounds(160,390,80,20);
		b14.addActionListener(this);
		
		b15=new Button("Restart");
		b15.setBounds(160,430,80,20);
		b15.addActionListener(this);
		
		tf11=new TextField(20);
		tf11.setBounds(100,470,220,20);
		tf11.setEnabled(false);
		
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		p2.add(l10);
		p2.add(l11);
		p2.add(l12);
		p2.add(tf7);
		p2.add(tf8);
		p2.add(b12);
		p2.add(b13);
		p2.add(tf9);
		p2.add(tf10);
		p2.add(b14);
		p2.add(b15);
		p2.add(tf11);
		
		
		//Panel3 :Memory Game
		p3=new Panel();
		p3.setBounds(160,30,500,500);
		p3.setBackground(Color.blue);
		p3.setLayout(null);
		
		l13=new Label("Points");
		l13.setBounds(75,30,80,40);
		l13.setBackground(new Color(244,244,244));
		l13.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		b16=new Button("1");
		b16.setBounds(20,80,40,40);
		b16.setBackground(new Color(237, 235, 233));
		b16.addActionListener(this);
		
		b17=new Button("2");
		b17.setBounds(70,80,40,40);
		b17.setBackground(new Color(237, 235, 233));
		b17.addActionListener(this);
		
		b18=new Button("3");
		b18.setBounds(120,80,40,40);
		b18.setBackground(new Color(237, 235, 233));
		b18.addActionListener(this);
		
		b19=new Button("4");
		b19.setBounds(170,80,40,40);
		b19.setBackground(new Color(237, 235, 233));
		b19.addActionListener(this);
		
		b20=new Button("5");
		b20.setBounds(20,130,40,40);
		b20.setBackground(new Color(237, 235, 233));
		b20.addActionListener(this);
		
		b21=new Button("6");
		b21.setBounds(70,130,40,40);
		b21.setBackground(new Color(237, 235, 233));
		b21.addActionListener(this);
		
		b22=new Button("7");
		b22.setBounds(120,130,40,40);
		b22.setBackground(new Color(237, 235, 233));
		b22.addActionListener(this);
		
		b23=new Button("8");
		b23.setBounds(170,130,40,40);
		b23.setBackground(new Color(237, 235, 233));
		b23.addActionListener(this);
		
		b24=new Button("9");
		b24.setBounds(20,180,40,40);
		b24.setBackground(new Color(237, 235, 233));
		b24.addActionListener(this);
		
		b25=new Button("10");
		b25.setBounds(70,180,40,40);
		b25.setBackground(new Color(237, 235, 233));
		b25.addActionListener(this);
		
		b26=new Button("11");
		b26.setBounds(120,180,40,40);
		b26.setBackground(new Color(237, 235, 233));
		b26.addActionListener(this);
		
		b27=new Button("12");
		b27.setBounds(170,180,40,40);
		b27.setBackground(new Color(237, 235, 233));
		b27.addActionListener(this);
		
		b28=new Button("13");
		b28.setBounds(20,230,40,40);
		b28.setBackground(new Color(237, 235, 233));
		b28.addActionListener(this);
		
		b29=new Button("14");
		b29.setBounds(70,230,40,40);
		b29.setBackground(new Color(237, 235, 233));
		b29.addActionListener(this);
		
		b30=new Button("15");
		b30.setBounds(120,230,40,40);
		b30.setBackground(new Color(237, 235, 233));
		b30.addActionListener(this);
		
		b31=new Button("16");
		b31.setBounds(170,230,40,40);
		b31.setBackground(new Color(237, 235, 233));
		b31.addActionListener(this);
		
		b32=new Button("Replay");
		b32.setBounds(75,280,80,40);
		b32.setBackground(new Color(237, 235, 233));
		b32.addActionListener(this);
		b32.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
		p3.add(l13);
		p3.add(b16);
		p3.add(b17);
		p3.add(b18);
		p3.add(b19);
		p3.add(b20);
		p3.add(b21);
		p3.add(b22);
		p3.add(b23);
		p3.add(b24);
		p3.add(b25);
		p3.add(b26);
		p3.add(b27);
		p3.add(b28);
		p3.add(b29);
		p3.add(b30);
		p3.add(b31);
		p3.add(b32);
		
		
		
		b102=new Button("Panel1");
		b102.setBounds(20,30,100,30);
		b102.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b102.addActionListener(this);
		
		b103=new Button("Panel2");
		b103.setBounds(20,70,100,30);
		b103.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b103.addActionListener(this);
		
		b104=new Button("Panel3");
		b104.setBounds(20,110,100,30);
		b104.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b104.addActionListener(this);
		
		b105=new Button("Hide/Show");
		b105.setBounds(20,150,100,30);
		b105.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b105.addActionListener(this);
		
		add(b102);
		add(b103);
		add(b104);
		add(b105);
		
		add(p1);
		add(p2);
		add(p3);
		
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Start
		if(ae.getSource()==b11)
		{

			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			tf1.setEnabled(true);
			b10.setEnabled(true);
			l2.setEnabled(true);
			tf2.setEnabled(true);
			l3.setEnabled(true);
			tf3.setEnabled(true);
			l4.setEnabled(true);
			tf4.setEnabled(true);
			tf5.setEnabled(false);
			tf6.setEnabled(false);
			
			
			l2.setText(String.valueOf(tf5.getText()));
			l3.setText(String.valueOf(tf6.getText())); 
		}
		// Restart 
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
			
			tf5.setEnabled(true);
			tf6.setEnabled(true);
			
			if(m==0)
			{
				tf2.setText(String.valueOf(a));
				tf3.setText(String.valueOf(b));
			}
			
			// FOR A NEW TOURNAMENT FRESH SCREEN
			if(m==5)
			{
				m=0;
				tf1.setText(" ");
				tf2.setText(" ");
				tf3.setText(" ");
				tf4.setText(" ");
				tf5.setText(" ");
				tf6.setText(" ");
				
				b1.setLabel("1");
				b1.setEnabled(false);
				
				b2.setLabel("2");
				b2.setEnabled(false);
				
				b3.setLabel("3");
				b3.setEnabled(false);
				
				b4.setLabel("4");
				b4.setEnabled(false);
				
				b5.setLabel("5");
				b5.setEnabled(false);
				
				b6.setLabel("6");
				b6.setEnabled(false);
				
				b7.setLabel("7");
				b7.setEnabled(false);
				
				b8.setLabel("8");
				b8.setEnabled(false);
				
				b9.setLabel("9");
				b9.setEnabled(false);
				
				tf5.setEnabled(true);
				tf6.setEnabled(true);
			}
		}
		
		// Assigning symbols "0" and "X" when the buttons are clicked and also calling funtion to check the winner . 
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
		
		
		// Second panel : Dice game
		
		if(ae.getSource()==b14)
		{
			b12.setEnabled(true);
			b13.setEnabled(true);
			tf7.setEnabled(true);
			tf8.setEnabled(true);
			tf9.setEnabled(true);
			tf10.setEnabled(true);
			tf11.setEnabled(true);
			
			tf7.setText("0");
			tf8.setText("0");
			tf9.setText("0");
			tf10.setText("0");
		}
		
		if(ae.getSource()==b15)
		{
			b12.setEnabled(true);
			b13.setEnabled(true);
			tf7.setEnabled(true);
			tf8.setEnabled(true);
			tf9.setEnabled(true);
			tf10.setEnabled(true);
			tf11.setEnabled(true);
		
			tf7.setText("0");
			tf8.setText("0");
			l8.setText("0");
			
			
			h=0;
			n1=0;
			n2=0;
			tf11.setText("MATCH Ongoing");
		}
		
		if(ae.getSource()==b12)
		{	
			h=h+1;
			
			for(int i=0;i<10;i++)
			{
				Random d=new Random();
				try{
					Thread.sleep(100);
				}catch(Exception e){}
				int dice1 =d.nextInt(6)+1;
				l8.setText(String.valueOf(dice1));
			}
			
			n1=n1+Integer.parseInt(l8.getText());
			tf7.setText(String.valueOf(n1));
			b13.setEnabled(true);
			b12.setEnabled(false);
			Matchwinner();
		}
		
		if(ae.getSource()==b13)
		{
			h=h+1;
			for(int i=0;i<10;i++)
			{
				Random d=new Random();
				try{
					Thread.sleep(100);
				}catch(Exception e){}
				int dice2 =d.nextInt(6)+1;
				l8.setText(String.valueOf(dice2));
			}
			
			n2=n2+Integer.parseInt(l8.getText());
			tf8.setText(String.valueOf(n2));
			b12.setEnabled(true);
			b13.setEnabled(false);
			Matchwinner();
		}
		if(ae.getSource()==b16)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b16.setLabel("#");
			else if(q1==2)
				b16.setLabel("@");
			else 
				b16.setLabel("X");
			arr[0]=b16.getLabel();
			
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b17)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b17.setLabel("#");
			else if(q1==2)
				b17.setLabel("@");
			else
				b17.setLabel("X");
			
			arr[1]=b17.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b18)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b18.setLabel("#");
			else if(q1==2)
				b18.setLabel("@");
			else
				b18.setLabel("X");
			
			arr[2]=b18.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b19)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(q1==1)
				b19.setLabel("#");
			else if(q1==2)
				b19.setLabel("@");
			else
				b19.setLabel("X");
			arr[3]=b19.getLabel();
			
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b20)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b20.setLabel("#");
			else if(q1==2)
				b20.setLabel("@");
			else 
				b20.setLabel("X");
			arr[4]=b20.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b21)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(q1==1)
				b21.setLabel("#");
			else if(q1==2)
				b21.setLabel("@");
			else
				b21.setLabel("X");
			arr[5]=b21.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b22)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b22.setLabel("#");
			else if(q1==2)
			    b22.setLabel("@");
			else
				b22.setLabel("X");
			arr[6]=b22.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b23)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b23.setLabel("#");
			else if(q1==2)
				b23.setLabel("@");
			else
				b23.setLabel("X");
			arr[7]=b23.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b24)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b24.setLabel("#");
			else if(q1==2)
				b24.setLabel("@");
			else 
				b24.setLabel("X");
			arr[8]=b24.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
	
		if(ae.getSource()==b25)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b25.setLabel("#");
			else if(q1==2)
				b25.setLabel("@");
			else
				b25.setLabel("X");
			arr[9]=b25.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b26)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b26.setLabel("#");
			else if(q1==2)
				b26.setLabel("@");
			else
				b26.setLabel("X");
			arr[10]=b26.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b27)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b27.setLabel("#");
			else if(q1==2)
				b27.setLabel("@");
			else
				b27.setLabel("X");
			arr[11]=b27.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b28)
		{
			Random r=new Random();
			int h=r.nextInt(3)+1;
			if(h==1)
				b28.setLabel("#");
			else if(h==1)
				b28.setLabel("@");
			else
				b28.setLabel("X");
			arr[12]=b28.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b29)
		{
			Random r=new Random();
			int h=r.nextInt(3)+1;
			if(h==1)
				b29.setLabel("#");
			else if(h==2)
				b29.setLabel("@");
			else
				b29.setLabel("X");
			arr[13]=b29.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b30)
		{
			Random r=new Random();
			int q1=r.nextInt(3)+1;
			if(q1==1)
				b30.setLabel("#");
			else if(q1==2)
				b30.setLabel("@");
			else
				b30.setLabel("X");
			
			arr[14]=b30.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b31)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(h==1)
				b31.setLabel("#");
			else if(h==2)
				b31.setLabel("@");
			else
				b31.setLabel("X");
			arr[15]=b31.getLabel();
			display(arr);
			winner_mem();
			f++;
		}
		
		if(ae.getSource()==b32)
		{
			b16.setLabel("1");
			b17.setLabel("2");
			b18.setLabel("3");
			b19.setLabel("4");
			b20.setLabel("5");
			b21.setLabel("6");
			b22.setLabel("7");
			b23.setLabel("8");
			b24.setLabel("9");
			b25.setLabel("10");
			b26.setLabel("11");
			b27.setLabel("12");
			b28.setLabel("13");
			b29.setLabel("14");
			b30.setLabel("15");
			b31.setLabel("16");
			
			q1=0;
			b16.setEnabled(true);
			b17.setEnabled(true);
			b18.setEnabled(true);
			b19.setEnabled(true);
			b20.setEnabled(true);
			b21.setEnabled(true);
			b22.setEnabled(true);
			b23.setEnabled(true);
			b24.setEnabled(true);
			b25.setEnabled(true);
			b26.setEnabled(true);
			b27.setEnabled(true);
			b28.setEnabled(true);
			b29.setEnabled(true);
			b30.setEnabled(true);
			b31.setEnabled(true);
			
			l13.setText("Points");
			
		}
		
		

	// To display other panels 
		if(ae.getSource()==b102)
		{
			p1.setVisible(true);
			p2.setVisible(false);
			p3.setVisible(false);
		}
		
		if(ae.getSource()==b103)
		{
			p2.setVisible(true);
			p1.setVisible(false);
			p3.setVisible(false);
		}
		
		if(ae.getSource()==b104)
		{
			p3.setVisible(true);
			p2.setVisible(false);
			p1.setVisible(false);
		}
		
		// To hide or show panels
		if(ae.getSource()==b105)
		{
			if(count==0)
			{
				p1.setVisible(false);
				p2.setVisible(false);
				p3.setVisible(false);
				count=1;
			}
			else 
			{
				p1.setVisible(true);
				p2.setVisible(true);
				p3.setVisible(true);
				count=0;
			}
		}
				
	}
	//Function to find the winner of each match and also the final winner of the tournament of 5 matches
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
				tf1.setText("WINNER :"+tf5.getText());
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
				tf1.setText("WINNER :"+tf6.getText());
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
			else if(c==9 && !k.equals("0") && !k.equals("X"))
			{
				tf1.setText("Match Draw");
				m++;
			}
			else if(k.equals("!"))
				tf1.setText("Match Ongoing");
		}
		
			
		if(m==5)
		{
			if(a>b)
				tf4.setText("Final Winner :"+tf5.getText());
			else if(a<b)
				tf4.setText("Final Winner :"+tf6.getText());
			else if(a==b)
			tf4.setText("Tournament Draw ");
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
			tf1.setEnabled(false);
			
			l2.setEnabled(false);
			tf2.setEnabled(false);
			l3.setEnabled(false);
			tf3.setEnabled(false);
			l4.setEnabled(false);
			tf4.setEnabled(false);
			a=0;
			b=0;
			
		}
	}
	void Matchwinner()
	{
		if(h<10)
		{
			tf11.setText("Match ONGOING ");
		}
		else if(h==10)
		{	
			q=q+1;
			if(n1>n2)
			{
				plx1=plx1+1;
				tf11.setText("Matchwinner :player1");
				tf9.setText(String.valueOf(plx1));
				Finalwinner();
			}
			else if(n2>n1)
			{
				plx2=plx2+1;
				tf11.setText("Matchwinner :player2");
				tf10.setText(String.valueOf(plx2));
				Finalwinner();
			}
			
			else if(n1==n2)
			{
				tf11.setText("MATCH DRAW");
				Finalwinner();
			}
			
			b12.setEnabled(false);
			b13.setEnabled(false);
			tf7.setEnabled(false);
			tf8.setEnabled(false);
			tf9.setEnabled(false);
			tf10.setEnabled(false);
			tf11.setEnabled(false);
		}
	}
	void Finalwinner()
	{
		if(q==5)
		{
			if(plx1>plx2)
				tf11.setText("Final winner :Player1");
			else if(plx2>plx1)
				tf11.setText("Final winner :Player2");
			else if(p1==p2)
				tf11.setText("Finals : Draw");
			b12.setEnabled(false);
			b13.setEnabled(false);
			tf7.setEnabled(false);
			tf8.setEnabled(false);
			tf9.setEnabled(false);
			tf10.setEnabled(false);
			tf11.setEnabled(false);
		}
	}
	void winner_mem()
	{
		pm1=0;
		pm2=0;
		pm3=0;
		
		for(g=0;g<arr.length;g++)
		{
			if(arr[g].equals("#"))
				pm1=pm1+1;
			else if(arr[g].equals("@"))
				pm2=pm2+1;
			else if(arr[g].equals("X"))
				pm3=pm3+1;
		
		}
		
		if(f==15)
		{
			if(pm1==pm2)
				l13.setText("winner_mem");
			else if(pm2==pm3)
				l13.setText("winner_mem");
			else if(pm1==pm3)
				l13.setText("winner_mem");
			else if(pm1!=pm2 && pm2!=pm3 && pm1!=pm3)
				l13.setText("Loss");
		}
	}
	
	void display(String ar[])
	{
		System.out.println("Value of f "+f);
		System.out.println();
	}


	public static void main(String [] ar)
	{
		new awt_026();
	}
}
			
		
		
		
		
		
		
		
		