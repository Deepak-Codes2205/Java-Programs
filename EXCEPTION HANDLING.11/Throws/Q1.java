
import java.io.*;

class input
{
	public static void main(String [] ar) throws IOException
	{ 
		String nm="";
		int age=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name and age reps. ");
		nm=br.readLine();
		age=Integer.parseInt(br.readLine());
		System.out.println(nm+" your age is "+age);
	}
}