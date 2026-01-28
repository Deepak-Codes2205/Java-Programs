import java.awt.*;
import java.awt.event.*;

class menu extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1, mi2, mi3, mi4, mi5;	
	TextArea ta;
	
	Dialog d1;
	Button b1;
	FileDialog fd1,fd2;
	
	menu()
	{
		fd1=new FileDialog(this,"Open File",FileDialog.LOAD);
		fd2=new FileDialog(this,"Save File",FileDialog.SAVE);
		
		d1=new Dialog(this);
		d1.setSize(300,300);
		d1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		b1=new Button(" Close ");
		b1.addActionListener(this);
		d1.add(b1);
		
		ta=new TextArea("write here",10,10,0);
		add(ta);
		
		mb=new MenuBar();
		setMenuBar(mb);
		
		m1=new Menu("File ");
		m2=new Menu("Edit ");
		m3=new Menu("Search ");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		mi1=new MenuItem("New ");
		mi1.addActionListener(this);
		
		mi2=new MenuItem("Open ");
		mi2.addActionListener(this);
		
		mi3=new MenuItem("Save ");
		mi3.addActionListener(this);
		
		mi4=new MenuItem("Cut ");
		mi5=new MenuItem("Paste ");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		m2.add(mi4);
		m2.add(mi5);
		
		setSize(500,500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
			d1.show();
		if(ae.getSource()==b1)
			d1.dispose();
		if(ae.getSource()==mi2)
		{
			fd1.show();
			fd2.dispose();
		}
		if(ae.getSource()==mi3)
		{
			fd2.show();
			fd1.dispose();
		}
	}
	public static void main(String [] ar)
	{
		new menu();	
	}
}