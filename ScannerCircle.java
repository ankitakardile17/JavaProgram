package myproje;
import java.util.*;
public class ScannerCircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius:");
		
		float radius=s.nextFloat();
		System.out.println("Enter radius:");
		System.out.println("Area:"+3.14*radius*radius);
		System.out.println("Diameter:"+2*radius);
		System.out.println("Perimeter:"+2*3.14*radius);
		

	}

}
