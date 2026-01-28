/* LIST AND CHOICE */

import java.awt.*;
import java.awt.event.*;
class awt_023 extends Frame implements ActionListener
{
	Label l1;
	Choice ch1;
	List list1;
	Button b1;
	awt_023()
	{
		l1=new Label("MY LABEL");
		l1.setBounds(150,50,100,50);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(new Color(240,240,240));
		
		ch1=new Choice();
		ch1.add("Dehradun");
		ch1.add("Nainital");
		ch1.add("Rudraprayag");
		ch1.add("Haridwar");
		ch1.add("Rurkee");
		ch1.add("Tehri");
		ch1.setBounds(150,110,100,20);
		
		list1=new List();
		list1.add("Dehradun");
		list1.add("Nainital");
		list1.add("Rudraprayag");
		list1.add("Haridwar");
		list1.add("Rurkee");
		list1.add("Tehri");
		list1.setBounds(150,140,100,70);
		
		b1=new Button("Print Values");
		b1.setBounds(150,220,100,20);
		b1.addActionListener(this);
		
		add(l1);
		add(ch1);
		add(list1);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Selected Value"+ch1.getSelectedItem());
		System.out.println("Selected Index"+ch1.getSelectedIndex());
		System.out.println("Get Item Count"+ch1.getItemCount());
		System.out.println("Get Item at 3"+ch1.getItem(3));
		System.out.println("\n\n");
		
		System.out.println("Selected Value"+list1.getSelectedItem());
		System.out.println("Selected Index"+list1.getSelectedIndex());
		System.out.println("Get Item Count"+list1.getItemCount());
		System.out.println("Get Item at 3"+list1.getItem(3));
	}
	public static void main(String [] ar)
	{
		new awt_023();
	}
}