/* INTERTHREAD COMMUNICATION */
import java.util.Scanner;

class Transactions
{
	int bal=1500;
	synchronized void deposit(int x)
	{
		bal=bal+x;
		System.out.println(Thread.currentThread().getName()+"The account balance after deposit is "+bal);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		notify();
	}
		

	synchronized void withdraw(int x)
	{
		try
		{
			if(bal<x)
			{
				System.out.println("Insufficient balance ");
				wait();
			}
			bal=bal-x;
			System.out.println(Thread.currentThread().getName()+"The account balance after withdraw is "+bal);
			Thread.sleep(1000);
		}
		catch(Exception e){};
	}
}

class Thread1 extends Thread 
{
	Transactions ob;
	Thread1(Transactions st)
	{
		ob=st;
	}
	public void run()
	{
		ob.deposit(1000);
	}
}


class Thread2 extends Thread 
{
	Transactions ob;
	Thread2(Transactions st)
	{
		ob=st;
	}
	public void run()
	{
		ob.withdraw(2000);
	}
}



class Thd11
{
	public static void main(String [] ar)
	{
		/*
		Transactions ob;
		ob=new Transactions ob;      or line 76*/
		Transactions ob=new Transactions();
		Thread2 t2=new Thread2(ob);
		Thread1 t1=new Thread1(ob);
		t2.start();
		t1.start();
	}
}