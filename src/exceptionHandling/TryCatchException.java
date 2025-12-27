package exceptionHandling;

public class TryCatchException {

	public static void main(String[] args) {
		
		String[] empNames = new String[3];
		
		try {
			
		empNames [0] = "Manvitha";
		empNames [1] = "Varnika";
		empNames [2] = "Upendar";
		empNames [3] = "Karthik";
		
		}catch (Exception e) {
			
			System.out.println("Array Index is Exceeded .Please provide the valid index.");
			empNames [3] = "Abhi";
			 
		}finally {// finally block will be executed always, irrespective of exception occurred or not.
			
			System.out.println("Execution completed Successfully.");
			
		}
	}

}
