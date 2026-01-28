/* INTER THREADING 
SYNCHRONIZATION */

import java.util.Scanner;

class table
{
	synchronized void values()
	{
		int n=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number whose table you want to print :");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+n+" * "+i+"="+n*i);
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
	table ob;
	Thread1(table st)
	{
		ob=st;
	}
	public void run()
	{
		ob.values();
	}
}


class Thread2 extends Thread 
{
	table ob;
	Thread2(table st)
	{
		ob=st;
	}
	public void run()
	{
		ob.values();
	}
}



class Thd9
{
	public static void main(String [] ar)
	{
		/*
		table ob;
		ob=new table ob;      or line 57*/
		table ob=new table();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}
		

	
		