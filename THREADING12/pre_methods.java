/* PRE EXISTING METHODS */

import java.util.Scanner;

class Thread1 extends Thread
{
	public void run()
	{
		//for(int i=1;i<=10;i++)
		{
			System.out.println("This is thread 1");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	
	public static void main(String [] ar)
	{
		Thread1 ob=new Thread1();
		ob.start();
			
			
		System.out.println("Thread Name "+ob.getName());
		ob.setName("Deepak");
		System.out.println("Thread Name "+ob.getName());
		
		System.out.println("Thread Name "+ob.getPriority());
		
		ob.setPriority(6);      // OR ob.setPriority(Thread.MAX_PRIORITY);
		
		//Thread.MIN_PRIORITY - 1
		//Thread.MAX_PRIORITY - 10
		//Thread.NORM_PRIORIY - 5
		
		System.out.println("Thread Name "+ob.getPriority());
		System.out.println("Thread is Alive : "+ob.isAlive());
		
		
		
	}
}