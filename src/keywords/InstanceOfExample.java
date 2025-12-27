package keywords;

public class InstanceOfExample extends Instance1{

	public static void main(String[] args) {
		
		//InstanceOf : Used to check whether an  instance of a specific class or implement a specific Interface 
	
	     Instance1 obj = new Instance1();
	     InstanceOfExample obj2 = new InstanceOfExample();
	
	     System.out.println(obj instanceof Instance1);
	   
	     System.out.println(obj instanceof InstanceOfExample);
	    
	     
	}

}
