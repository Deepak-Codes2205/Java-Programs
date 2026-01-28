/*INHERITANCE 
PDF QUESTION 4*/

import java.util.Scanner();

class matrix
{
	int arr[4][4],i=0,j=0;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array is :");
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=3;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
class rowsum extends matrix
{
	int s=0
	void sum(); 
	{
		
	
			