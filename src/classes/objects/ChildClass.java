package classes.objects;

public class ChildClass extends MainClass{//child extend parent

	//Inheritance is an OOP concept
	//Extending parent class properties into child class without any object.
	
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		   
		   System.out.println("stdName is :" +obj.stdName);
		   System.out.println("stdId is :" +obj.stdId);
		   System.out.println("jobStatus is :" +obj.jobStatus);
		   System.out.println("age is :" +age);
		

	}

}
