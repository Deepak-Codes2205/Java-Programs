/* INTERTHREAD COMMUNICATION */

import java.util.Scanner;

class ABC
{
	synchronized void count1()
	{
		int n=0,i=0;
		for(i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				if(i==5)
					wait();
				
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
	
	synchronized void count2()
	{
		int n=0,i=0;
		for(i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
		notify();
	}
}

class Thread1 extends Thread 
{
	ABC ob;
	Thread1(ABC st)
	{
		ob=st;
	}
	public void run()
	{
		ob.count1();
	}
}


class Thread2 extends Thread 
{
	ABC ob;
	Thread2(ABC st)
	{
		ob=st;
	}
	public void run()
	{
		ob.count2();
	}
}



class Thd10
{
	public static void main(String [] ar)
	{
		/*
		ABC ob;
		ob=new ABC ob;      or line 73*/
		ABC ob=new ABC();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}
		

	
		