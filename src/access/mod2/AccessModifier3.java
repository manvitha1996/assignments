package access.mod2;

	import access.mod1.AccessModifier1;

	public class AccessModifier3 extends AccessModifier1{

		public static void main(String[] args) {
			
			AccessModifier3 am1 = new AccessModifier3();
			
			/*to create the obj of public class we can directly create a obj by importibg the package name with class name
			 example : import access.mod1.AccessModifier1;
			 example of obj creation   AccessModifier1 am1 = new AccessModifier1(); */

			System.out.println("Employee Name: " + am1.name);
			am1.printEmpId();	
			
		/* to create an object of protected class u want to create the class3 instead of class1 because 
		 u can't directly access class1 even thought u import the class so when we extends the class the data is
		  copied to class 3 so we can directly create a obj of class 3
		  example: AccessModifier3 am1 = new AccessModifier3(); */
			System.out.println("Employee Name: " + am1.name1);
			am1.printEmpId1();	
			
			
			//u can't access the default and private classes outside of package
		}

	}