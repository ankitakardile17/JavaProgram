package myproje;

public class EvenOddMethod {

	public static void main(String[] args) {
		EvenOddMethod e=new EvenOddMethod();
		//e.even(4);
		boolean ans=e.even(4);
		int n=11;
		if(ans==true)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static boolean even(int n)
	{
		if(n%2==0)
		return true;
		else
			return false;
	}
	
}
