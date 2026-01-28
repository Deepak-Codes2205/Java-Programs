import java.awt.*;
import java.awt.event.*;

class awt_003 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4;	
	
	awt_003()
	{
		l1=new Label("Enter Number ");
		l2=new Label("Enter Number ");
		l3=new Label("Solution");
	
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		
		
		b1=new Button("SUM");
		b1.addActionListener(this);
		
		b2=new Button("SUBSTRACT");
		b2.addActionListener(this);
		
		b3=new Button("MULTIPLY");
		b3.addActionListener(this);
		
		b4=new Button("DIVIDE");
		b4.addActionListener(this);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(tf1.getText()); // REFER CLASS FROM STRING TO INTEGER
		int b=Integer.parseInt(tf2.getText()); // REFER CLASS FROM STRING TO INTEGER
		
		int c=0;
		
		if(ae.getSource()==b1)
			c=a+b;
		if(ae.getSource()==b2)
			c=a-b;
		if(ae.getSource()==b3)
			c=a*b;
		if(ae.getSource()==b4)
			c=a/b;
		
		tf3.setText(String.valueOf(c));
	}
	
	
	public static void main(String [] ar)
	{
		new awt_003();
	}
}