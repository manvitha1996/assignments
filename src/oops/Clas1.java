package oops;

public class Clas1 {
	
private int age = 30;

private int salary = 150000;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	private int getSalary() {
		
		return salary;
	}
	
	public void setSalary(int newSalary) {
		salary= newSalary;
	}

	public static void main(String[] args) {
		
		Clas1 obj =new Clas1();
		System.out.println(+obj.getSalary());
	    obj.setSalary(200000);
	   System.out.println(+obj.getSalary());
		
		
	}

}

