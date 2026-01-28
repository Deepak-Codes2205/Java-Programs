import java.util.*;
import java.awt.*;
import java.awt.event.*;
class awt_014 extends Frame implements ActionListener
{
	Label l1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	
	int c=0,j=0,k=0;
	String arr[]={"","","","","","","","","","","","","","","","",};
	int i=0,p1=0,p2=0,p3=0;
	awt_014()
	{
		l1=new Label("Points");
		l1.setBounds(75,30,80,40);
		l1.setBackground(new Color(244,244,244));
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		b1=new Button("1");
		b1.setBounds(20,80,40,40);
		b1.setBackground(new Color(237, 235, 233));
		b1.addActionListener(this);
		
		b2=new Button("2");
		b2.setBounds(70,80,40,40);
		b2.setBackground(new Color(237, 235, 233));
		b2.addActionListener(this);
		
		b3=new Button("3");
		b3.setBounds(120,80,40,40);
		b3.setBackground(new Color(237, 235, 233));
		b3.addActionListener(this);
		
		b4=new Button("4");
		b4.setBounds(170,80,40,40);
		b4.setBackground(new Color(237, 235, 233));
		b4.addActionListener(this);
		
		b5=new Button("5");
		b5.setBounds(20,130,40,40);
		b5.setBackground(new Color(237, 235, 233));
		b5.addActionListener(this);
		
		b6=new Button("6");
		b6.setBounds(70,130,40,40);
		b6.setBackground(new Color(237, 235, 233));
		b6.addActionListener(this);
		
		b7=new Button("7");
		b7.setBounds(120,130,40,40);
		b7.setBackground(new Color(237, 235, 233));
		b7.addActionListener(this);
		
		b8=new Button("8");
		b8.setBounds(170,130,40,40);
		b8.setBackground(new Color(237, 235, 233));
		b8.addActionListener(this);
		
		b9=new Button("9");
		b9.setBounds(20,180,40,40);
		b9.setBackground(new Color(237, 235, 233));
		b9.addActionListener(this);
		
		b10=new Button("10");
		b10.setBounds(70,180,40,40);
		b10.setBackground(new Color(237, 235, 233));
		b10.addActionListener(this);
		
		b11=new Button("11");
		b11.setBounds(120,180,40,40);
		b11.setBackground(new Color(237, 235, 233));
		b11.addActionListener(this);
		
		b12=new Button("12");
		b12.setBounds(170,180,40,40);
		b12.setBackground(new Color(237, 235, 233));
		b12.addActionListener(this);
		
		b13=new Button("13");
		b13.setBounds(20,230,40,40);
		b13.setBackground(new Color(237, 235, 233));
		b13.addActionListener(this);
		
		b14=new Button("14");
		b14.setBounds(70,230,40,40);
		b14.setBackground(new Color(237, 235, 233));
		b14.addActionListener(this);
		
		b15=new Button("15");
		b15.setBounds(120,230,40,40);
		b15.setBackground(new Color(237, 235, 233));
		b15.addActionListener(this);
		
		b16=new Button("16");
		b16.setBounds(170,230,40,40);
		b16.setBackground(new Color(237, 235, 233));
		b16.addActionListener(this);
		
		b17=new Button("Replay");
		b17.setBounds(75,280,80,40);
		b17.setBackground(new Color(237, 235, 233));
		b17.addActionListener(this);
		b17.setFont(new Font("Times New Roman",Font.PLAIN,20));
		
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
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		if(ae.getSource()==b1)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b1.setLabel("#");
			else if(c==2)
				b1.setLabel("@");
			else 
				b1.setLabel("X");
			arr[0]=b1.getLabel();
			
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b2)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b2.setLabel("#");
			else if(c==2)
				b2.setLabel("@");
			else
				b2.setLabel("X");
			
			arr[1]=b2.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b3)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b3.setLabel("#");
			else if(c==2)
				b3.setLabel("@");
			else
				b3.setLabel("X");
			
			arr[2]=b2.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b4)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b4.setLabel("#");
			else if(c==2)
				b4.setLabel("@");
			else
				b4.setLabel("X");
			arr[3]=b4.getLabel();
			
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b5)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b5.setLabel("#");
			else if(c==2)
				b5.setLabel("@");
			else 
				b5.setLabel("X");
			arr[4]=b5.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b6)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b6.setLabel("#");
			else if(c==2)
				b6.setLabel("@");
			else
				b6.setLabel("X");
			arr[5]=b6.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b7)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b7.setLabel("#");
			else if(c==2)
			    b7.setLabel("@");
			else
				b7.setLabel("X");
			arr[6]=b7.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b8)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b8.setLabel("#");
			else if(c==2)
				b8.setLabel("@");
			else
				b8.setLabel("X");
			arr[7]=b8.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b9)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b9.setLabel("#");
			else if(c==2)
				b9.setLabel("@");
			else 
				b9.setLabel("X");
			arr[8]=b9.getLabel();
			display(arr);
			winner();
			k++;
		}
	
		if(ae.getSource()==b10)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b10.setLabel("#");
			else if(c==2)
				b10.setLabel("@");
			else
				b10.setLabel("X");
			arr[9]=b10.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b11)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b11.setLabel("#");
			else if(c==2)
				b11.setLabel("@");
			else
				b11.setLabel("X");
			arr[10]=b11.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b12)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b12.setLabel("#");
			else if(c==2)
				b12.setLabel("@");
			else
				b12.setLabel("X");
			arr[11]=b12.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b13)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b13.setLabel("#");
			else if(c==1)
				b13.setLabel("@");
			else
				b13.setLabel("X");
			arr[12]=b13.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b14)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b14.setLabel("#");
			else if(c==2)
				b14.setLabel("@");
			else
				b14.setLabel("X");
			arr[13]=b14.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b15)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b15.setLabel("#");
			else if(c==2)
				b15.setLabel("@");
			else
				b15.setLabel("X");
			
			arr[14]=b15.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b16)
		{
			Random r=new Random();
			int c=r.nextInt(3)+1;
			if(c==1)
				b16.setLabel("#");
			else if(c==2)
				b16.setLabel("@");
			else
				b16.setLabel("X");
			arr[15]=b16.getLabel();
			display(arr);
			winner();
			k++;
		}
		
		if(ae.getSource()==b17)
		{
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("9");
			b10.setLabel("10");
			b11.setLabel("11");
			b12.setLabel("12");
			b13.setLabel("13");
			b14.setLabel("14");
			b15.setLabel("15");
			b16.setLabel("16");
			
			c=0;
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			b10.setEnabled(true);
			b11.setEnabled(true);
			b12.setEnabled(true);
			b13.setEnabled(true);
			b14.setEnabled(true);
			b15.setEnabled(true);
			b16.setEnabled(true);
		}
		
	}
	void winner()
	{
		p1=0;
		p2=0;
		p3=0;
		
		for(j=0;j<arr.length;j++)
		{
			if(arr[j].equals("#"))
				p1=p1+1;
			else if(arr[j].equals("@"))
				p2=p2+1;
			else if(arr[j].equals("X"))
				p3=p3+1;
		
		}
		
		if(k==15)
		{
			if(p1==p2)
				l1.setText("winner");
			else if(p2==p3)
				l1.setText("winner");
			else if(p1==p3)
				l1.setText("winner");
			else if(p1!=p2 && p2!=p3 && p1!=p3)
				l1.setText("Loss");
		}
	}
	
	void display(String ar[])
	{
		System.out.println("Value of K "+k);
		System.out.println();
		for(int i=0;i<ar.length;i++)
			System.out.print(i+" ");
		
		System.out.println();
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
	
	public static void main(String[] ar)
	{
		new awt_014();
	}
}