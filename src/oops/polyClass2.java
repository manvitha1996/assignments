package oops;

public class polyClass2 extends polyClass1 {

	//Methord Overriding /Runtime polymorphism
	//Multiple methods with same name with same arguments between parent and child class
	//@Override
	public void add(int a,int b) {
		System.out.println("Addition of two numbers "+(a+b));
	}
	public static void main(String[] args) {
		polyClass2 obj=new polyClass2();
		obj.add(20,30);
		
	}

}
