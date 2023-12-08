package myproje;

public class Method {

	public static void main(String[] args) {
		Method m=new Method();
		m.add(2,3);
		int sq=m.square(3);
		System.out.println(sq);

	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
		
		
	}
	public int square(int n)
	{
		return(n*n);
	}

}
