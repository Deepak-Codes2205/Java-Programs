import java.awt.*;    
import javax.swing.*;    
    
class border_layout extends Frame   
{    
	border_layout()  
	{    
		Button b1 = new Button("NORTH"); // the button will be labeled as NORTH   
		Button b2 = new Button("SOUTH"); // the button will be labeled as SOUTH  
		Button b3 = new Button("EAST"); // the button will be labeled as EAST  
		Button b4 = new Button("WEST"); // the button will be labeled as WEST  
		Button b5 = new Button("CENTER"); // the button will be labeled as CENTER  
		
		add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
		add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
		add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
		add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
		add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
			
		setSize(300,300);    
		setVisible(true);    
	}    
	
	public static void main(String[] args)
	{    
		new border_layout();    
	}    
}   