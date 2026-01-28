/* THREADING 
1. Using Thread class 
*/

import java.util.Scanner;

class Thread1 extends Thread 
{
	public void run()
	{
		System.out.println("This is Thread ");
	}
	
	public static void main(String [] ar)
	{
		Thread1 t1=new Thread1();  /* note that : the object name t1 can also be taken as anything  eg ob,ob1,tt etc */
		t1.start();
	}
}


