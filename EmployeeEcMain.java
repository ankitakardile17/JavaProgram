package oops;

public class EmployeeEcMain {

	public static void main(String[] args) {
		EmployeeEc e=new EmployeeEc();
		e.seteId(1);
		System.out.println(e.geteId());
		e.setEname("Ankita");
		System.out.println(e.getEname());
		e.setEsal(400000);
		System.out.println(e.getEsal());
		e.setEdept("Computer science");
		System.out.println(e.getEdept());
	}

}
