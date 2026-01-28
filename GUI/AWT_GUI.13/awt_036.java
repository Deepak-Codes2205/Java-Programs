import java.util.*;
import java.awt.*;
import java.awt.event.*;
class awt_014 extends Frame implements ActionListener
{
	Label l13;
	Button b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
	
	int q1=0,g=0,f=0;
	String arr[]={"","","","","","","","","","","","","","","","",};
	int e=0,pm1=0,pm2=0,pm3=0;
	awt_014()
	{
		l13=new Label("Points");
		l13.setBounds(75,30,80,40);
		l13.setBackground(new Color(244,244,244));
		l13.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		b31=new Button("1");
		b31.setBounds(20,80,40,40);
		b31.setBackground(new Color(237, 235, 233));
		b31.addActionListener(this);
		
		b32=new Button("2");
		b32.setBounds(70,80,40,40);
		b32.setBackground(new Color(237, 235, 233));
		b32.addActionListener(this);
		
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
		
		add(l13);
		add(b31);
		add(b32);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		add(b25);
		add(b26);
		add(b27);
		add(b28);
		add(b29);
		add(b30);
		add(b31);
		add(b32);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{	
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
				b32.setLabel("#");
			else if(q1==2)
				b32.setLabel("@");
			else
				b32.setLabel("X");
			
			arr[1]=b32.getLabel();
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
			k++;
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
		}
		
	}
	void winner_mem()
	{
		pm1=0;
		pm2=0;
		pm3=0;
		
		for(g=0;g<arr.length;g++)
		{
			if(arr[g].eq1uals("#"))
				pm1=pm1+1;
			else if(arr[g].eq1uals("@"))
				pm2=pm2+1;
			else if(arr[g].eq1uals("X"))
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