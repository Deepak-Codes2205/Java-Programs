import java.util.Scanner;

class Djikstra
{
	
	int InputArrays(int array[][], int Array[], int Minimum[], int n)
	{
		int i=0,j=0,v,c=0,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements :");
		for(i=0;i<n;i++)
		{
			while(true)
			{
				System.out.println("Enter Vertex connected to vertext, if not exist input -1 "+i);
				v=sc.nextInt();
				if(v==-1)
					break;
				
				System.out.println("Enter Weight for "+i+" to "+v);
				c=sc.nextInt();
				array[i][v]=c;
				array[v][i]=c;
			}
		}
		
		System.out.println("Enter the index no of the source from which you want to find shortest paths :");
		s=sc.nextInt();
		while(j<n)
		{
			Array[j]=array[s][j];
			Minimum[j]=-1;
			j++;
		}
		
		Minimum[s]=1;
		return s;
	}
	static int GetMinimumIndex(int Array[], int Minimum[], int n)
	{
		int i=0,ind=0, m=Integer.MAX_VALUE;
		while(i<n)
		{
			if(Array[i] < m && Minimum[i]==-1)
			{
				m=Array[i];
				ind=i;
			}
			i++;
		}  
		return ind;
	}
	
	void FindShortestPath(int array[][], int Array[], int Minimum[], int n, int s)
	{
		int i=0,l=0,h=0,ind=0,c=0;
		int m=0;	
		
		for(l=0;l<n;l++)
		{
			ind=GetMinimumIndex(Array, Minimum, n);
			Minimum[ind]=1;
			m=Array[ind];
			System.out.println("\nIndex with minimum value is "+ind+" with value :"+m);
			
			for(h=0;h<n;h++)
			{
				if(h==0)
				{
					if((m + array[ind][h]) < Array[h])
					{
						Array[h]= m;
						//System.out.println(Array[h]);
					}
				}
				else
				{
					if((m + array[ind][h]) < Array[h])
					{
						Array[h]= m + array[ind][h];
						//System.out.println(Array[h]);
					}
				}
			}
		}
		System.out.println("\nThe shortest distances are :");
		for(i=0;i<n;i++)
		{
			System.out.println(Array[i]);
		}
	}
		
	
	public static void main(String [] args)
	{
		Djikstra obj1 = new Djikstra();
		int arr[][]=new int[5][5];
		
		//int max=Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		int max=99;
		
		int i=0,j=0,s=0,n=0;
		int Arr[]=new int[5];
		int Min[]=new int[5];
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				arr[i][j]=max;
			}
		}
		n=i;
		
		s=obj1.InputArrays(arr, Arr, Min, n);
		
		System.out.println("The Elements  of 2D array are :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("The Elements  of 1D array are :");
		for(i=0;i<n;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		
		// int m=arr[s][0];
		// int ind = obj1.GetMinimumIndex(Arr,Min,n,m);
		// System.out.println("\nIndex with minimum value is "+ind+" with value :"+Arr[ind]);
		
		obj1.FindShortestPath(arr, Arr, Min, n, s);		
		
		// System.out.println("The Shortest Paths from "+s+" are :");
		// for(i=0; i<n; i++)
		// {
			// System.out.print(Arr[i]+" ");
		// }
	}
	
}
	
	
			
