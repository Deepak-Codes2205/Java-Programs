/* THREADING 
1. Using Thread class 
*/

import java.util.Scanner;

class Thread1 extends Thread 
{
	int i=0;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	
	public static void main(String [] ar)
	{
		Thread1 t1=new Thread1();  /* note that : the object name t1 can also be taken as anything  eg ob,ob1,tt etc */
		t1.start();
	}
}


