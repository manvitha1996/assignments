package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//println(); print the informtaion and goto next line
		System.out.println("Hello World!");
		System.out.println("hello everyone");
		
		
		//print(); print the information and stay on the same line
		System.out.print("Hello");
		System.out.print("World");
		System.out.println("");

		//printf();print the formatted content and stay on same line
		System.out.println("Varni is completed Btech,an Emp ID 1234,her visa status is True");
		System.out.println("Mani is completed Btech,an Emp ID 1235,her visa status is False");
		System.out.println("Uppi is completed Btech,an Emp ID 1236,her visa status is True");
		/* %s refers to string or text value
		 * %d refers to digital or number
		 * %f refers to decimal point, number with decimals
		 * %b refers to Boolean value, true or false*/
		
		System.out.printf("%s is completed Btech,an Emp ID %d,her visa status is %b.","varni",1234,true);
		System.out.println("");
		System.out.printf("%s is completed Btech,an Emp ID %d,her visa status is %b","Mani",1235,false);
		System.out.println("");
		
		// Print error messages within Java
		System.out.println();
		System.err.println("There is a error in line number 33.");
		System.out.println(); 
		
		//Print the logs
		Logger logger =Logger.getLogger("Hello World");
		logger.info("there is an information within the line number 39, Program is going well.");
		System.out.println();
		logger.warning("there is a warning that something is going wrong in line number 41");
		System.out.println();
		
		//Print and export the logs into a text file.
		PrintWriter log = new PrintWriter("C:\\AutomationTraining\\Javatraining\\HelloWorld.txt");
		log.println("currently the line number 49 is executed successfully.");
		log.println("currently the line number 50 is executed successfully.");
		log.println("program is successfully completed without any issues ");
		log.close();
		
	}

}
