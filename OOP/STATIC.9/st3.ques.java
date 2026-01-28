/* STATIC */

import java.util.Sacnner;

class BankAccount()
{
	int accno,accholder,bal;
	static int bname,totAcc,intrate;
	
	bankAccount()
	{
		accno=0
		accholder=" ";
		bal=0;
		totAcc=totAcc+1;
	}
	
	static void setBname(String );
	static void getBname();
	static void setinterestrate();
	static void getinterestrate(double rate);
	static void getinterestrate();
	static getotAcc();
	
	void deposit();
	void withdraw();
	void getbalance();
	void applyinterest();
	public static void main(String [] ar)
	{
		Scannner sc=new Scanner(System.in);
		System.out.println("Enter the bank name :");
		
		bname=sc.nextLine();
		
		setBname();
		getBname();
		setinterestrate();
		getinterestrate();
		getotAcc();
		