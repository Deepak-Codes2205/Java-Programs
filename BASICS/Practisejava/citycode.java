String City_code() // GENERATING CITY CODE FOR USER ENTER CITY (NEW ENTRY).
	{
		
		int f=0;
		String s1="",s2="";
		
		s1=tf1.getText();
		
		System.out.println("City  is : "+s1);
		
		query="select count(city) from state_city where city like '"+s1.substring(0,3)+"%"+"'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain","root","12345");
	        System.out.println("Connected successfully");
	        st=con.createStatement();
	        rs=st.executeQuery(query);
	        System.out.println("Inside Function ");
	        if(rs.next())
	        {
	        	f=Integer.parseInt(rs.getString("count(city)"));
	        }
	    
	        if(f>=1)
	        {	
	        	while(s1.charAt(f)==s1.charAt(2))
	        		f++;
	        	
	        	s2="";
				s2=s1.substring(0,2)+s1.charAt(f+2);
	        }
	        else if(f==0)
	        {
	        	s2="";
				s2=s1.substring(0,3);
	        }
	    }catch(Exception e) {}	
		System.out.println("City is :"+s1+" Code : "+s2+" Value of f :"+f);
		
		return s2;
	}