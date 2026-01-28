import java.util.*;

class Pincode
{
	String arr[]={"Dehradun","Almora","Dehradun","Tehri","Delhi","Mandi","Dehrapur","Tehrumpur","Delhi"};
	String cdd[]=new String[arr.length];
	String s1="",s2="";
	int i,d,l,f=0;
	
	public void Codegen()
	{
		int k=0;
		for(i=0;i<arr.length;i++)
		{	
			s1=arr[i];
			cdd[k++]=s1.substring(0,3);
		}
		
		s1=arr[arr.length-1];
		s2=s1.substring(0,3);
		
		for(l=0;l<k;l++)
		{
			if(cdd[l].equals(s2))
				f=f+1;
		}
		if(f>=1)
		{
			s2=s1.substring(0,2)+s1.charAt(f+1);
		}
		System.out.println("City is :"+arr[arr.length-1]+" Code : "+s2+" Value of f :"+f);
		f=0;
	}
	
	public static void main(String args[])
	{
		Pincode ob1=new Pincode();
		ob1.Codegen();
	}
	
}

/*
import java.util.*;

class Pincode
{
	String arr[]={"Dehradun","Almora","Dehradun","Tehri","Mandi","Dehrapur","Tehrumpur","Delhi"};
	String s1="",s2="";
	int i,d,l,f=0;
	
	public void Codegen()
	{
		int k=0;
		s2=arr[arr.length-1];
		s1=s2;
		for(i=0;i<=arr.length;i++)
		{	
			if(arr[i].equals(s2))
				f=f+1;
			if(f>=1)
			{
				s2=s1.substring(0,2)+s1.charAt(f+1);
			}
		}
		System.out.println("City is :"+arr[i]+" Code : "+s2+" Value of f :"+f);
	}
	
	public static void main(String args[])
	{
		Pincode ob1=new Pincode();
		ob1.Codegen();
	}
	
	
	 select count(city) from state_city where city like 'Cha%';
+-------------+
| count(city) |
+-------------+
|           3 |
+-------------+
1 row in set (0.00 sec)

}*/
		


String[] getCities()  // FETCHES ALL CITIES AND STORE THEM IN AN ARRAY TO BE UTILIZED BY THE FUNCTION City_code FOR GENERATING CITY_CODE 
	{
		String arr[]=new String[count+1];
		query="Select city from state_city";
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain","root","12345");
		        System.out.println("Connected successfully");
		        st=con.createStatement();
		        rs=st.executeQuery(query);
		        int i=0;
		        while(rs.next())
		        	arr[i++]=rs.getString("city");
		    
		        arr[i]=tf1.getText();
		}catch(Exception e) {}
		
		return(arr);
	}
	
	String City_code()
	{
		String arr[]=getCities();
		String cdd[]=new String[arr.length];
		String s1="",s2="";
		int l,f=0;
		
		for(int k=0,i=0;i<arr.length;i++,k++)
		{	
			s1=arr[i];
			cdd[k]=s1.substring(0,3);
		}
		
		s1=arr[arr.length-1];
		s2=s1.substring(0,3);
		
		for(l=0;l<cdd.length;l++)
		{
			if(cdd[l].equals(s2))
				f=f+1;
		}
		if(f>=1)
			s2=s1.substring(0,2)+s1.charAt(f+1);
		
		System.out.println("City is :"+arr[arr.length-1]+" Code : "+s2+" Value of f :"+f);
		
		return s2;
	}
	
	
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }
}