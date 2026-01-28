/* THREADING 
1. Using Thread class 
*/

import java.util.Scanner;

class Thread1 extends Thread 
{
	int i=0;
	public void run()
	{
		int h=0,m=0,s=0;
		for(h=0;h<=24;h++)
		{
			for(m=0;m<=59;m++)
			{
				for(s=0;s<=59;s++)
				{
					System.out.println(h+" : "+m+" : "+s);
						try{
						Thread.sleep(100);
					}catch(Exception e){}
				}
				s=0;
			}
			m=0;
			
		}
	}
	
	public static void main(String [] ar)
	{
		Thread1 t1=new Thread1();  /* note that : the object name t1 can also be taken as anything  eg ob,ob1,tt etc */
		t1.start();
	}
}


