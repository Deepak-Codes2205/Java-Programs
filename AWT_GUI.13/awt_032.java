/* Methods */
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class awt_032 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	Button b1;
	Checkbox rb1,rb2,rb3;
	CheckboxGroup cbg;
	
	awt_032()
	{
		cbg=new CheckboxGroup();
		
		rb1=new Checkbox("Black",false,cbg);
		rb1.setBounds(100,50,100,20);
		
		rb2=new Checkbox("Blue",cbg,false);
		rb2.setBounds(210,50,100,20);
		
		rb3=new Checkbox("Green",cbg,false);
		rb3.setBounds(320,50,100,20);
		
		l1=new Label("MY LABEL");
		l1.setBounds(100,100,200,50);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(new Color(240,240,240));
		
		b1=new Button("Get Select");
		b1.setBounds(150,160,100,30);
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
		if(ae.getSource()==b1)
		{
			cbg.setSelectedCheckbox(rb2);   // void setSelectedCheckbox(Checkbox which)
		}
	}
	
	public static void main(String [] ar)
	{
		new awt_032();
	}
}
		
		
		