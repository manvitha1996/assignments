package assignments;

public class Assignments3EmpGroups {
	
	public static void main(String[] args) {
		
		Assignments3Employees obj =new Assignments3Employees();
		 
		 String [] empName = new String[3];
		 empName[0] = obj.empName1;
		 empName[1] = obj.empName2;
		 empName[2] = obj.empName3;
		 
		 int [] empId =new int[3]; 
		 empId[0] = obj.empId1;
		 empId[1] = obj.empId2;
		 empId[2] = obj.empId3;
		 
		 System.out.println(empName[0] +":"+ empId[0] );
		 System.out.println(empName[1] +":"+ empId[1] );
		 System.out.println(empName[2] +":"+ empId[2] );
		 
		 
		
	}

}
