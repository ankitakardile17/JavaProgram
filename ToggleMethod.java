package myproje;

public class ToggleMethod {

	public static void main(String[] args) {
		//int a=2;
		ToggleMethod t=new ToggleMethod();
		//t.toggle(6);
		int sign=t.toggle(6);
		System.out.println(sign);

	}
	public int toggle(int a )
	{
		return -a;
	}

}
