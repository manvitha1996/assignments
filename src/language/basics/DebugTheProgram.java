package language.basics;

public class DebugTheProgram {

	public static void main(String[] args) {
		int i =1;
		System.out.println("Step 1: Program Starts");
		System.out.println("Step 2:preparing to execute the next step");
		System.out.println("Step 3: performing calculations");
		int j = i+1;
		System.out.println(i / j);
		System.out.println("Step 5: program execution completed");
		

	}
      // When an error comes in a java program
	 // the first line of the error is always going to give you the information about the error and the documentation location
	 // the last line of the error is going to give you the location of the error that occured in your program.

}
