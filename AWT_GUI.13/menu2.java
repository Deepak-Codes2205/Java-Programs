/* NOTEPAD */

import java.awt.*;
import java.awt.event.*;

class menu2 extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9, mi10, mi11, mi12, mi13, mi14, mi15, mi16, mi17, mi18, mi19, mi20, mi21, mi22, 
	mi23, mi24, mi25, mi26, mi27, mi28;	
	TextArea ta;
	Dialog d1;
	Button b1,b2,b3;
	FileDialog fd1;
	String str="",str1="",str2="";
	
	menu2()
	{
		setTitle("Notepad");
		
		d1=new Dialog(this);
		d1.setSize(300,300);
		d1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		fd1=new FileDialog(this,"Save File",FileDialog.SAVE);
		
		b1=new Button("Save");
		b1.addActionListener(this);
		d1.add(b1);
		
		b2=new Button("Don't Save");
		b2.addActionListener(this);
		d1.add(b2);
		
		b3=new Button("Close");
		b3.addActionListener(this);
		d1.add(b3);
		
		
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
		
		mi1=new MenuItem("New             Ctrl+N");
		mi1.addActionListener(this);
		
		mi2=new MenuItem("New Window     Ctrl+Shift+N");
		mi2.addActionListener(this);
		
		mi3=new MenuItem("Open                 Ctrl+O");
		mi4=new MenuItem("Save                 Ctrl+s");
		mi5=new MenuItem("Save as        Ctrl+Shift+S");
		mi6=new MenuItem("Save All         Ctrl+Alt+S");
		mi7=new MenuItem("Page setup                 ");
		mi8=new MenuItem("Print     	       Ctrl+p");
		mi9=new MenuItem("Close Tab            Ctrl+W");
		mi10=new MenuItem("Close Window  Ctrl+Shift+W");
		mi11=new MenuItem("Exit ");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		m1.add(mi6);
		m1.add(mi7);
		m1.add(mi8);
		m1.add(mi9);
		m1.add(mi10);
		m1.add(mi11);
		
		mi12=new MenuItem("Undo                  Ctrl+Z");
		mi13=new MenuItem("Cut                   Ctrl+X");
		mi14=new MenuItem("Copy    			     Ctrl+C");
		mi14.addActionListener(this);
		
		mi15=new MenuItem("Paste                 Ctrl+V");
		mi15.addActionListener(this);
		
		mi16=new MenuItem("Delete                   Del");
		mi17=new MenuItem("SEarch with bing      Ctrl+E");
		mi18=new MenuItem("Find    			     Ctrl+F");
		mi19=new MenuItem("Find next    	         F3");
		mi20=new MenuItem("Find Previous       Shift+F3");
		mi21=new MenuItem("Replace               Ctrl+H");
		mi22=new MenuItem("Go to                 Ctrl+G");
		mi23=new MenuItem("Select All            Ctrl+A");
		mi24=new MenuItem("Time/Date    	         F5");
		mi25=new MenuItem("Font ");
		
		m2.add(mi12);
		m2.add(mi13);
		m2.add(mi14);
		m2.add(mi15);
		m2.add(mi16);
		m2.add(mi17);
		m2.add(mi18);
		m2.add(mi19);
		m2.add(mi20);
		m2.add(mi21);
		m2.add(mi22);
		m2.add(mi23);
		m2.add(mi24);
		m2.add(mi25);
		
		mi26=new MenuItem("Zoom ");
		mi27=new MenuItem("Status Bar ");
		mi28=new MenuItem("Word Wrap ");
		
		m3.add(mi26);
		m3.add(mi27);
		m3.add(mi28);
		
		setSize(500,500); 
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
		{
			str=ta.getText();
			if(!str.equals(""))
				d1.show();
		}
		
		if(ae.getSource()==b1)
		{
			d1.dispose();
			if(!str.equals(""))
				fd1.show();
		}
		if(ae.getSource()==b2)
		{
			d1.dispose();
			ta.setText("");
		}
			
		if(ae.getSource()==b3)
			d1.dispose();
		
		if(ae.getSource()==mi2)
			new menu();
		
		if(ae.getSource()==mi14)
			str1=ta.getSelectedText();
		
		if(ae.getSource()==mi15)
		{
			str2=ta.getText();
			str2=str2+str1;
			ta.setText(str2);
		}
		
			
		
	}
	public static void main(String [] ar)
	{
		new menu2();	
	}
}