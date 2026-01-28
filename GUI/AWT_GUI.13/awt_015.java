import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_015 extends Frame implements ActionListener
{
	Button b1[]=new Button[9],b10;
	Label l1,l2;
	int i=0,x=220,y=120,p1=0,p2=0,p3=0,c=0,count=0;
	
	awt_015()
	{
		l1=new Label("Score");
		l1.setBounds(200,50,200,50);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l1.setBackground(new Color(240,240,240));
		l1.setAlignment(Label.CENTER);
		add(l1);
		
		
		for(i=0;i<b1.length;i++)
		{
			if(i%3==0 && i>0)
			{
				y=y+55;
				x=220;
			}
			
			b1[i]=new Button(String.valueOf(i));
			b1[i].setBounds(x,y,50,50);
			x+=55;
			b1[i].addActionListener(this);
			add(b1[i]);
		}
		
		b10=new Button("Restart");
		b10.setBounds(250,300,100,50);
		b10.setFont(new Font("Times new Roman",Font.PLAIN,25));
		b10.addActionListener(this);
		add(b10);
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		for(i=0;i<b1.length;i++)
		{
			if(ae.getSource()==b1[i])
			{
				Random r=new Random();
				int c=r.nextInt(3)+1;
				if(c==1)
				{
					b1[i].setLabel("#");
					p1++;
					count++;
				}
				else if(c==2)
				{
					b1[i].setLabel("@");
					p2++;
					count++;
				}
				else 
				{
					b1[i].setLabel("X");
					p3++;
					count++;
				}
				b1[i].setEnabled(false);
			}
		}
		
		if(count==b1.length)
		{
			winner();
			count=0;
		}
		
		if(ae.getSource()==b10)
		{
			for(i=0;i<b1.length;i++)
			{
				b1[i].setEnabled(true);
				b1[i].setLabel(String.valueOf(i));
				l1.setText("Score");
			}
		}
		
	}
	
	void winner()
	{
		System.out.println(p1+" "+p2+" "+p3);
		if(p1==p2)
			l1.setText("Winner");
		else if(p2==p3)
			l1.setText("Winner");
		else if(p1==p3)
			l1.setText("Winner");
		else
			l1.setText("You Lost");
		p1=0;
		p2=0;
		p3=0;
	}
			
	public static void main(String []ar)
	{
		new awt_015();
	}
}

	
	
		
		
