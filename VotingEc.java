package encapsulationassignment;

public class VotingEc {
	String name;
	int age=10;
	String city;
	char gender;
	
	public void setAge(int a)
	{
		if(a>=18 && a<=100)
		{
			
			System.out.println("Eligible to vote");
			age=a;
		}
		
	}
	public int getAge()
	{
		
		return age;
	}

}
