package access.mod1;

public class AccessModifier2 {


	public static void main(String[] args) {
		
		AccessModifier1 am1 = new AccessModifier1();
		
		System.out.println("Employee Name: " + am1.name);
		am1.printEmpId();	
		
		System.out.println("Employee Name: " + am1.name1);
		am1.printEmpId1();	
		
		System.out.println("Employee Name: " + am1.name2);
		am1.printEmpId2();	
		
		// private is not even access as class level even thought it is in same package
		
	}

}