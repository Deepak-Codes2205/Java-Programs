/* EXCEPTION HANDLING 
CUSTOM EXCEPTION */

import java.util.*;

class InvalidQuantityException extends Exception 
{
	public String toString()
	{
		return"Invalid Quantity :Quantity should be under 1000 ";
	}
}

class ProductNotFoundException extends Exception 
{
	public String toString()
	{
		return"Invalid Product id :Enter the valid id for this product";
	}
}

class InventoryManager
{
	String id="Q0u001";
	int i=0,j=0,c=0;
		void addProduct(String productId, int quantity)
		{
			try
			{
				if(quantity<=1000)
					System.out.println("product id : "+productId+" and its quantity is : "+quantity);
				else if(quantity>1000)
					throw (new InvalidQuantityException());
			}
			catch(InvalidQuantityException e)
			{
				System.out.println(e);
			}
			
		}
		
		void removeProduct(String productId, int quantity)
		{
			try
			{
				for(i=0;i<productId.length();i++)
				{
					if(productId.charAt(i)==id.charAt(j))
					{
						c=c+1;
					}
					j++;
				}
				if(c<0 &&  quantity<=1000)
					System.out.println("product id : "+productId+" and its quantity is : "+quantity);
				else if(c<0 &&  quantity<=1000)
					throw (new ProductNotFoundException());
			}
			catch(ProductNotFoundException e)
			{
				System.out.println(e);
			}
		}
	public static void main(String [] ar)
	{
		InventoryManager ob=new InventoryManager();
		ob.addProduct("Q0u001",1100);
		ob.removeProduct("Q0u001",999);
	}
}
		
			
