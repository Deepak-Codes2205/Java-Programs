/* SET BOUNDS */
import java.awt.*;
import java.awt.event.*;

class awt_004 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1;
	
	awt_004()
	{
		l1=new Label("Enter Number ");
		l1.setBounds(50,50,100,20);
		
		l2=new Label("Enter Number ");
		l2.setBounds(50,90,100,20); 
		
		l3=new Label("Solution ");
		l3.setBounds(50,130,100,20);
		
		tf1=new TextField(20);
		tf1.setBounds(170,50,100,20);
		
		tf2=new TextField(20);
		tf2.setBounds(170,90,100,20);
		
		tf3=new TextField(20);
		tf3.setBounds(170,130,100,20);
		
		b1=new Button(" SuM ");
		b1.addActionListener(this);
		b1.setBounds(50,210,100,20);
		
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(tf1.getText()); // REFER CLASS FROM STRING TO INTEGER
		int b=Integer.parseInt(tf2.getText()); // REFER CLASS FROM STRING TO INTEGER
		int c=a+b;
		tf3.setText(String.valueOf(c));
	}
	
	
	public static void main(String [] ar)
	{
		new awt_004();
	}
}