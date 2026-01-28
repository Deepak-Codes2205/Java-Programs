/* THREADING 
1. Using Runnable Interface 
*/

import java.util.Scanner;

class Thread1 implements Runnable
{
	public void run()
	{
		System.out.println("This is Thread ");
	}
	
	public static void main(String [] ar)
	{
		Thread1 t1=new Thread1();		/* note that : the object name t1 can also be taken as anything  eg ob,ob1,tt etc */
		Thread t2=new Thread(t1);	
		t2.start();
	}
	
	
}


