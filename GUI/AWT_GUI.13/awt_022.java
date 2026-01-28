/* BACKGROUND AND FOREGROUND COLOR */
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_022 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	Button b1;
	Checkbox rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9;
	CheckboxGroup cbg;
	
	awt_022()
	{
		cbg=new CheckboxGroup();
		rb1=new Checkbox("Male",true,cbg);
		rb1.setBounds(100,50,100,20);
		rb2=new Checkbox("Female",false,cbg);
		rb2.setBounds(210,50,100,20);
		rb3=new Checkbox("Other",cbg,false);
		rb3.setBounds(320,50,100,20);
		
		l1=new Label("MY LABEL");
		l1.setBounds(100,100,200,50);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(new Color(240,240,240));
		
		b1=new Button("BUTTON");
		b1.setBounds(150,160,100,30);
		b1.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b1.addActionListener(this);
		
		l2=new Label("Background Color");
		l2.setBounds(70,210,100,30);
		l2.setBackground(new Color(230,230,230));
		
		rb4=new Checkbox("Red",false,cbg);
		rb4.setBounds(70,260,100,20);
		
		rb5=new Checkbox("Green",false,cbg);
		rb5.setBounds(70,290,100,20);
		
		rb6=new Checkbox("Blue",false,cbg);
		rb6.setBounds(70,320,100,20);

		l3=new Label("Foreground Color");
		l3.setBounds(200,210,100,30);
		l3.setBackground(new Color(230,230,230));
		
		rb7=new Checkbox("White",false,cbg);
		rb7.setBounds(200,260,100,20);
		
		rb8=new Checkbox("Black",false,cbg);
		rb8.setBounds(200,290,100,20);
		
		rb9=new Checkbox("Yellow",false,cbg);
		rb9.setBounds(200,320,100,20);
		
		add(rb1);
		add(rb2);
		add(rb3);
		
		add(rb4);
		add(rb5);
		add(rb6);
		
		add(rb7);
		add(rb8);
		add(rb9);
		
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String msg="";
		if(rb1.getState()==true)
			msg=rb1.getLabel();
		else if(rb2.getState()==true)
			msg=rb2.getLabel();
		else if(rb3.getState()==true)
			msg=rb3.getLabel();
		else
			msg="Please Select Gender ";
		
		if(rb4.getState()==true)
		{
			setBackground(new Color(255,0,0));
			l1.setBackground(new Color(255,0,0));
			l2.setBackground(new Color(255,0,0));
			l3.setBackground(new Color(255,0,0));
			
			b1.setBackground(new Color(255,0,0));
			
			rb1.setBackground(new Color(255,0,0));
			rb2.setBackground(new Color(255,0,0));
			rb3.setBackground(new Color(255,0,0));
			rb4.setBackground(new Color(255,0,0));
			rb5.setBackground(new Color(255,0,0));
			rb6.setBackground(new Color(255,0,0));
			rb7.setBackground(new Color(255,0,0));
			rb8.setBackground(new Color(255,0,0));
			rb9.setBackground(new Color(255,0,0));
	}
		else if(rb5.getState()==true)
		{
			setBackground(new Color(0,128,0));
			l1.setBackground(new Color(0,128,0));
			l2.setBackground(new Color(0,128,0));
			l3.setBackground(new Color(0,128,0));
			
			b1.setBackground(new Color(0,128,0));
			
			rb1.setBackground(new Color(0,128,0));
			rb2.setBackground(new Color(0,128,0));
			rb3.setBackground(new Color(0,128,0));
			rb4.setBackground(new Color(0,128,0));
			rb5.setBackground(new Color(0,128,0));
			rb6.setBackground(new Color(0,128,0));
			rb8.setBackground(new Color(0,128,0));
			rb9.setBackground(new Color(0,128,0));
		}
		else if(rb6.getState()==true)
		{
			setBackground(new Color(0,0,255));
			l1.setBackground(new Color(0,0,255));
			l2.setBackground(new Color(0,0,255));
			l3.setBackground(new Color(0,0,255));
			
			b1.setBackground(new Color(0,0,255));
			
			rb1.setBackground(new Color(0,0,255));
			rb2.setBackground(new Color(0,0,255));
			rb3.setBackground(new Color(0,0,255));
			rb4.setBackground(new Color(0,0,255));
			rb5.setBackground(new Color(0,0,255));
			rb6.setBackground(new Color(0,0,255));
			rb7.setBackground(new Color(0,0,255));
			rb8.setBackground(new Color(0,0,255));
			rb9.setBackground(new Color(0,0,255));
		}
		
		if(rb7.getState()==true)
		{
			l1.setForeground(new Color(255,255,255));
			l2.setForeground(new Color(255,255,255));
			l3.setForeground(new Color(255,255,255));
			
			b1.setForeground(new Color(255,255,255));
			
			rb1.setForeground(new Color(255,255,255));
			rb2.setForeground(new Color(255,255,255));
			rb3.setForeground(new Color(255,255,255));
			rb4.setForeground(new Color(255,255,255));
			rb5.setForeground(new Color(255,255,255));
			rb6.setForeground(new Color(255,255,255));
			rb7.setForeground(new Color(255,255,255));
			rb8.setForeground(new Color(255,255,255));
			rb9.setForeground(new Color(255,255,255));
			
			

		}
		else if(rb8.getState()==true)
		{
			l1.setForeground(new Color(0,0,0));
			l2.setForeground(new Color(0,0,0));
			l3.setForeground(new Color(0,0,0));
			
			b1.setForeground(new Color(0,0,0));
			
			rb1.setForeground(new Color(0,0,0));
			rb2.setForeground(new Color(0,0,0));
			rb3.setForeground(new Color(0,0,0));
			rb4.setForeground(new Color(0,0,0));
			rb5.setForeground(new Color(0,0,0));
			rb6.setForeground(new Color(0,0,0));
			rb7.setForeground(new Color(0,0,0));
			rb8.setForeground(new Color(0,0,0));
			rb9.setForeground(new Color(0,0,0));
		}
		else if(rb9.getState()==true)
		{
			l1.setForeground(new Color(255,255,0));
			l2.setForeground(new Color(255,255,0));
			l3.setForeground(new Color(255,255,0));
			
			b1.setForeground(new Color(255,255,0));
			
			rb1.setForeground(new Color(255,255,0));
			rb2.setForeground(new Color(255,255,0));
			rb3.setForeground(new Color(255,255,0));
			rb4.setForeground(new Color(255,255,0));
			rb5.setForeground(new Color(255,255,0));
			rb6.setForeground(new Color(255,255,0));
			rb7.setForeground(new Color(255,255,0));
			rb8.setForeground(new Color(255,255,0));
			rb9.setForeground(new Color(255,255,0));
		}
		
		l1.setText(msg);
	}
	
	public static void main(String [] ar)
	{
		new awt_022();
	}
}
		
		
		