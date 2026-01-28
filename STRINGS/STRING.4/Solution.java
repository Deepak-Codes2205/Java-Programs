import java.util.Scanner;

class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        int n=s.length()-1,j=-1,i=0;
        while(n>=0)
        {
            int digit=s.charAt(n)-'0';
            if(digit % 2 != 0)
            {
                j=1;
                break;
            }
            n--;
        }

        if(j==-1)
            return "";
        while(i<=n)
        {
            if(s.charAt(i)!='0')
                break;
            i++;
        }
        return s.substring(i,n+1);
    }
    
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        
        String result = solution.largeOddNum(s);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}