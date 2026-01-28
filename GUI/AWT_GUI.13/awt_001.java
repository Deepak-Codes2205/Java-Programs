import java.awt.*;
import java.awt.event.*;

class awt_001 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1;
	
	awt_001()
	{
		l1=new Label("Enter Number ");
		l2=new Label("Enter Number ");
		l3=new Label("Solution ");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		
		b1=new Button(" SuM ");
		b1.addActionListener(this);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{	/* Taking values from the textfield 1,2 ,adding them  and entering them into the textfield3*/ 
		int a=Integer.parseInt(tf1.getText()); // REFER CLASS FROM STRING TO INTEGER
		int b=Integer.parseInt(tf2.getText()); // REFER CLASS FROM STRING TO INTEGER
		int c=a+b;
		tf3.setText(String.valueOf(c));
	}
	
	
	public static void main(String [] ar)
	{
		new awt_001();
	}
}