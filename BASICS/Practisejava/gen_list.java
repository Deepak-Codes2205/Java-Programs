import java.util.*;

class gen_list
{
	public static void main(String [] ar)
	{
		ArrayList<String> path=new ArrayList<>();
		
		String str="",tmp="";
		
		str="A E";
		tmp="C D";
		
		String arr[]=tmp.split(" ");
		
		for(int i=0;i<2;i++)
		{
			path.add(str);
		}
		
		for(int i=0;i<path.size();i++)
		{
			path.set(i,path.get(i)+" "+arr[i]);
		}
		
		for(int i=0;i<path.size();i++)
			System.out.println(path.get(i));
	}
}