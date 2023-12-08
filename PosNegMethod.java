package myproje;

public class PosNegMethod {

	public static void main(String[] args) {
		
		PosNegMethod p=new PosNegMethod();
		p.positive(-1);
		int pos=p.positive(-2);
		System.out.println(pos);
		
		
	}
	public  int positive(int a)
	{
		if(a>0)
		{
			return 1;
		}
		if(a==0)
		{
			return 0;
		}
			
		else 
		{
			return -1;
		}
	}
	
}
