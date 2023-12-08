package myproje;

public class CalculatorSwitch {

	public static void main(String[] args) {
	int a=2,b=3;
	char sign='+';	
	switch(sign)
		{
		case '+':
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
			
		case '%':
			System.out.println(a%b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;

	}

}}
