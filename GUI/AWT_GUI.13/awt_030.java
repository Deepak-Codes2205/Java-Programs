import java.awt.*;
import java.awt.event.*;
class awt_030 extends Frame implements ActionListener
{
	Label l1;
	Choice ch1;
	Button b1;
	awt_030()
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
		
		ch1.select(4); //Method : void select(int index)
		
		ch1.select("Haridwar"); //Method : void select(String name)
		
		b1=new Button("Print Values");
		b1.setBounds(150,220,100,20);
		b1.addActionListener(this);
		
		add(l1);
		add(ch1);
		//add(list1);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Selected Value "+ch1.getSelectedItem());  // getSelectedItem()
		System.out.println("Selected Index "+ch1.getSelectedIndex());  // getSelectedIndex()
		System.out.println("Get Item Count "+ch1.getItemCount()); // int getItemCount()
		System.out.println("Get Item at 3 "+ch1.getItem(3)); // String getItem(int index)
	
	}
	public static void main(String [] ar)
	{
		new awt_030 ();
	}
}