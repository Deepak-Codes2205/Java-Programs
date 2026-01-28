/* THREADING 
1. Using Thread class 
	SYNCHRONIZATION 
*/

import java.util.Scanner;

class stopwatch
{
	synchronized void count()
	{
		int h=0,m=0,s=0;
		for(h=0;h<=24;h++)
		{
			for(m=0;m<=59;m++)
			{
				for(s=0;s<=59;s++)
				{
					System.out.println(Thread.currentThread().getName()+" : "+h+" : "+m+" : "+s);
						try{
						Thread.sleep(100);
					}catch(Exception e){}
				}
				s=0;
			}
			m=0;		
		}
	}
}
class Thread1 extends Thread 
{
	stopwatch ob;
	Thread1(stopwatch st)
	{
		ob=st;
	}
	public void run()
	{
		ob.count();
	}
}

class Thread2 extends Thread 
{
	stopwatch ob;
	Thread2(stopwatch st)
	{
		ob=st;
	}
	public void run()
	{
		ob.count();
	}
}


class Thd7
{
	public static void main(String [] ar)
	{
		stopwatch ob=new stopwatch();
		Thread1 t1=new Thread1(ob);  /* note that : the object name t1 can also be taken as anything  eg ob,ob1,tt etc */
		Thread2 t2=new Thread2(ob); 
		
		t1.start();
		t2.start();
	}
}


