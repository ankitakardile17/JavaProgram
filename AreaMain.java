package encapsulationassignment;

public class AreaMain {

	public static void main(String[] args) {
		Area a=new Area();
		a.setLen(2);
		System.out.println(a.getLen());
		a.setBreadth(2);
		System.out.println(a.getBreadth());
		
		System.out.print("Area is:"+a.getArea(2, 2));
		
		
	}

}
