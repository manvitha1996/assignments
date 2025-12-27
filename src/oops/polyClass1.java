 package oops;

public class polyClass1 {
	
	public void add(int a,int b) {
		System.out.println("sum: "+(a+b));
	}

	//@overloading
	//Method overloading /compile time polymorphism 
	// Multiple methods with same name with in same class but different arguments
	public void add(int a,int b,int c) {
		System.out.println("sum: "+(a+b+c));
	}
	
	
	
	
	public static void main(String[] args) {
		polyClass1 obj=new polyClass1();
		obj.add(10, 20);
		obj.add(10,20,30);
	}

}
