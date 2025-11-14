package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment6_Operators {

	public static void main(String[] args) {
		
		String[] studentName = {"Suresh","Mahesh", "Naresh"};
		 int[] marks = {75 ,80,82};
		
		
		marks[0] = marks[0]+10;
		marks[1] = marks[1]+10;
		marks[2] = marks[2]+10;
		
		System.out.println(" by using Arrays");
		
		System.out.println("UpdatedMarks");
		System.out.println(studentName[0] +":" +  marks[0]);
		System.out.println(studentName[1] +":" +  marks[1]);
		System.out.println(studentName[2] + ":" +  marks[2]);
		
		 double averageMarks = (marks[0]+marks[1]+marks[2])/3.0;
		System.out.println("average marks of students :" + averageMarks);
		
		
		
		System.out.println("by using maps");
		
		Map<String,Integer> student1 = new HashMap<String,Integer>();

		student1.put("Suresh",75);
		student1.put("Mahesh",80);
		student1.put("Naresh", 82);
		 
		int val1=student1.get("Suresh");
		int val2=student1.get("Mahesh");
		int val3=student1.get("Naresh");
		
		student1.put("Suresh",val1+10);
		student1.put("Mahesh",val2+10);
		student1.put("Naresh",val3+10);
		System.out.println("updatedMarks");
		
		System.out.println(student1);
		
		double averageMarks2 = (student1.get("Suresh")+student1.get("Mahesh")+student1.get("Naresh"))/3.0;
		
		System.out.println("averageMarks :" +averageMarks2);
		

	}

}
