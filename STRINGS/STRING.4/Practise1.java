/* 
import java.util.Scanner;

class Stringss
{
    public static void main(String [] ar)
    {
		String s1="dehradun";
        String s2="";
        String s3="";
        int i=0;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<s1.length();i++)
        {
            char Ch1=s1.charAt(i);
            char Ch2=s1.charAt(i+1);
            if(Ch1!=Ch2)
            {
                s2=s2+Ch1;
            }
            else if(Ch1==Ch2)
            {
                if(s3.length()<=s2.length())
                {
                    s3=s2;
                    s2="";
                }
				else
					s2="";
            }
        }
        i=s3.length();
        System.out.println("The substring without reapting characters is : "+s3+" and its length is : "+i);
    }
}