import java.awt.*;
import java.awt.event.*;

class menu1 extends Frame //implements Action Listener
{
	MenuBar mb;
	Menu m1,m2,m3,m4;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9;
	Dailog d1;
	
	menu1()
	{
		mb=new MenuBar();
		setMenuBar(mb);
		
		m1=new Menu("File ");
		m2=new Menu("Edit ");
		m3=new Menu("Search ");
		m4=new Menu("View ");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		mi1=new MenuItem("New ");
		mi2=new MenuItem("Open ");
		mi3=new MenuItem("Save ");
		
		mi4=new MenuItem("Copy ");
		mi5=new MenuItem("Paste ");
		
		mi6=new MenuItem("Find ");
		mi7=new MenuItem("Mark ");
		
		mi8=new MenuItem("Tab ");
		mi9=new MenuItem("Zoom ");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		m2.add(mi4);
		m2.add(mi5);
		
		m3.add(mi6);
		m3.add(mi7);
		
		m4.add(mi8);
		m4.add(mi9);
		
		d1=new Dialog(this);
		d1.setSize(200,200);
		d1.setLayout(new Layout
		
		
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String [] ar)
	{
		new menu1();
	}
}
		