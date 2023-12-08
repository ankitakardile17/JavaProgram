package myproje;
import java.util.*;

public class ScannerGender {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name:");
	
	String name=s.next();
	System.out.println("Name is:"+name);
	System.out.println("Enter the gender:");
	char gender=s.next().charAt(0);
	System.out.println("Gender is:"+gender);
	System.out.println("  Name is Mrs " + name +" and the gender is:"+ gender);
	}

}
