import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_016 extends Frame implements ActionListener
{
	String names[]={"Batman","Theraid","Herapheri","Suryavansham","Gladiator","Terminator","Khatameeta","Sholay","Hobbit","Lordoftherings",
	"Harrypottor","Avengers","Deadpool","PiaratesofcarrabianSea"};
	Button b1[];
	Label l1;
	TextField tf1;
	Button b101,b102;
	String str1="";
	String mv="";
	int x=50,j=0,t=0,k=0,m=0,count=0;
	awt_016()
	{
		l1=new Label("MOVIE MANIA");
		l1.setBounds(100,50,200,50);
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l1.setBackground(new Color(230,230,230));
		l1.setAlignment(Label.CENTER);
		add(l1);
		
		
		m=names.length;
		Random r=new Random();
		System.out.println(k);
		int k=r.nextInt(m);
		System.out.println("k is "+k+" m is "+m);
		mv=names[k];
		
		
		b1=new Button[mv.length()];
		
		
		for(int i=0;i<mv.length();i++)
		{
			b1[i]=new Button(String.valueOf(mv.charAt(i)));
			b1[i].setBounds(x,120,50,50);
			add(b1[i]);
			b1[i].addActionListener(this);
			x=x+55;
		}
		
		blankspc();
		
		tf1=new TextField(20);
		tf1.setBounds(50,190,325,40);
		add(tf1);
		
		b101=new Button("Check");
		b101.setBounds(100,250,50,30);
		b101.addActionListener(this);
		add(b101);
		
		b102=new Button("Restart");
		b102.setBounds(250,250,50,30);
		b102.addActionListener(this);
		add(b102);
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
		
	void blankspc()
	{
		int f=(mv.length()*50)/100;
		
		for(int i=0;i<mv.length();i++)
		{
			b1[i].setLabel(String.valueOf(mv.charAt(i)));
		}
		
		j=0;
		int n=mv.length()-1;
		while(j!=f)
		{
			Random r=new Random();
			int c=r.nextInt(n+1);
			if(c==0)
			{
				if(b1[c+1].getLabel()!="__")
				{
					b1[c].setLabel("__");
					j=j+1;
				}
			}
			else if(c==n)
			{
				if (b1[c-1].getLabel()!="__")
				{
					b1[c].setLabel("__");
					j=j+1;
				}
			}
				
			else 
			{
				if(b1[c+1].getLabel()!="__" && b1[c-1].getLabel()!="__")
				{
					b1[c].setLabel("__");
					j=j+1;
				}
			}
			
		}
		
		int p=0;
		for(int i=0;i<b1.length;i++)
		{
			if(b1[i].getLabel().equals("__"))
					p++;
		}
		if(p!=f)
		{	
			blankspc();
		}
		
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b101)
		{
			if(tf1.getText().equals(mv))
			{
				for(int i=0;i<mv.length();i++)
					b1[i].setLabel(String.valueOf(mv.charAt(i)));
				tf1.setBackground(new Color(0,255,0));
			}
			else 
				tf1.setBackground(new Color(255,0,0));	
		}
		
		while(count<=2)
		{
			for(int i=0;i<b1.length;i++)
			{
				if(ae.getSource()==b1[i])
				{
					b1[i].setLabel(String.valueOf(mv.charAt(i)));
					count++;
				}
			}
		}
		if(ae.getSource()==b102)
		{
			//dispose();
			new awt_016();
		}	
	}		
	
	public static void main(String [] ar) 
	{
		new awt_016();
	}
}

		
		
		
		
	