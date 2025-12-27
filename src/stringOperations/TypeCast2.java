package stringOperations;

public class TypeCast2 extends TypeCast1 {

	public static void main(String[] args) {
		
		TypeCast2 obj =new TypeCast2();//Normal way to create object of TypeCast2 class

		//UpCasting(Storing child class object into parent class)
		TypeCast1 obj1 = new TypeCast2();
		

		// Downcasting
		TypeCast2 obj2 = (TypeCast2) obj1;
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//TakesScreenshot ts = (TakesScreenshot) driver;
	
		
	}

}
