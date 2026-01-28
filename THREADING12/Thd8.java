/* INTER THREADING 
Using Thread class : SYNCHRONIZATION */

import java.util.Scanner;

class fibo
{
	synchronized void series()
	{
		int x=0,y=1,z=0;
		System.out.println(Thread.currentThread().getName()+" "+x);
		System.out.println(Thread.currentThread().getName()+" "+y);
		while(z<=13)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.println(Thread.currentThread().getName()+" "+z);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}

class Thread1 extends Thread 
{
	
	fibo ob;
	Thread1(fibo st)
	{
		ob=st;
	}
	public void run()
	{
		ob.series();
	}
}

class Thread2 extends Thread
{
	fibo ob;
	Thread2( fibo st)
	{
		ob=st;
	}
	public void run()
	{
		ob.series();
	}
}

class Thd8
{
	public static void main(String [] ar)
	{
		fibo ob;
		ob=new fibo();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}
	