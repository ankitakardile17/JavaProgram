package encapsulationassignment;

public class AccountEc {
	int ac_no;
	String name;
	double balance;
	
	public void setBal(double b)
	{
		if(b>0)
		{
		balance=b;
		}
		
		
	}
	public double getBal()
	{
		return balance;
		
		
	}
}
