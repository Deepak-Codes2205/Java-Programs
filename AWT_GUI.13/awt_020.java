import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_020 extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	Checkbox rb1,rb2,rb3;
	CheckboxGroup cbg;
	
	awt_020()
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
		l1.setBackground(new Color(244,244,244));
		
		b1=new Button("BUTTON");
		b1.setBounds(100,160,100,30);
		b1.setFont(new Font("Times New Roman",Font.PLAIN,15));
		b1.addActionListener(this);
		
		
		add(rb1);
		add(rb2);
		add(rb3);
		
		add(l1);
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
		
		l1.setText(msg);
	}
	
	public static void main(String [] ar)
	{
		new awt_020();
	}
}
		
		
		