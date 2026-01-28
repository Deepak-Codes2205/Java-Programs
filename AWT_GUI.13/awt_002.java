import java.awt.*;
import java.awt.event.*;

class awt_002 extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3,tf4;
	Button b1;
	
	awt_002()
	{
		l1=new Label("Principal");
		l2=new Label("Rate");
		l3=new Label("Time");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		tf4=new TextField(20);
		
		b1=new Button("SI");
		b1.addActionListener(this);
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(tf4);
		
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c=Integer.parseInt(tf3.getText());
		int s=(a*b*c)/100;
		tf4.setText(String.valueOf(s));
	}
		
	public static void main(String [] ar)
	{
		new awt_002();
	}
}
		