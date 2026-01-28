/* FUNCTION OVERRIDING */

class ABC
{
	void show ()
	{
		System.out.println("ABC : show");
	}
}
class xyz extends ABC
{
	void show()
	{
		super.show();
		System.out.println("xyz : show");
	}
	public static void main(String [] ar)
	{
		xyz ob=new xyz();
		ob.show();
	}
}