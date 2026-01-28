/* METHODS */
import java.awt.*;
import java.awt.event.*;
class awt_033 extends Frame implements ActionListener
{
	Label l1;
	List list1;
	Button b1;
	awt_033()
	{
		l1=new Label("MY LABEL");
		l1.setBounds(150,50,100,50);
		l1.setAlignment(Label.CENTER);
		l1.setBackground(new Color(240,240,240));
		
		list1=new List(5,true);
		list1.add("Dehradun");
		list1.add("Nainital");
		list1.add("Rudraprayag");
		list1.add("Haridwar");
		list1.add("Rurkee");
		list1.add("Tehri");
		list1.setBounds(150,140,100,70);
		
		list1.select(2);  // Method  : void select(int index)	:  For selecting a particular values at the begaining 
		
		b1=new Button("Print Values");
		b1.setBounds(150,220,100,20);
		b1.addActionListener(this);
		
		add(l1);
		add(list1);
		add(b1);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{	
		System.out.println("Selected Value "+list1.getSelectedItem()); // getSelectedItem()
		System.out.println("Selected Index "+list1.getSelectedIndex());  // getSelectedIndex()
		System.out.println("Get Item Count "+list1.getItemCount());  // int getItemCount()
		System.out.println("Get Item at 3 "+list1.getItem(3));  // String getItem(int index)
		
		System.out.println("\n");
		
		String val[]=list1.getSelectedItems();  // MULTIPLE SELECTION METHODS : String [] getSelectedItems()
		for(int i=0;i<val.length;i++)
			System.out.println(val[i]);
		
		System.out.println("\n");
		
		int  ind[]=list1.getSelectedIndexes();  // MULTIPLE SELECTION METHODS : String [] getSelectedIndexes()
		for(int i=0;i<ind.length;i++)
			System.out.println(ind[i]);
		
		
		
		
		
		
	}
	public static void main(String [] ar)
	{
		new awt_033 ();
	}
}