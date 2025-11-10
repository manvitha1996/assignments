package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		
		/* 1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		cities combined.*/
	
		List<Double>area = new ArrayList<Double>();
		area.add(14563.0 );  
		area.add(12345.0);
		area.add(10452.12);
		area.add(9562.956);
		area.add(9548.12);
		
		double totalArea = area.get(2) + area.get(3);
		
		System.out.println("total area of the 3rd and 4th combined " + totalArea  );
		
		
		/* 2. Create a set of the top 10 most visited tourist attractions in the world and print out all
		of them and its size.*/
		
		Set<String> places = new HashSet<String>();
		places.add("Paris");
		places.add("Dubai");
		places.add("London");
		places.add("Bali");
		places.add("Bangkok");
		places.add("New York");
		places.add("Taj Mahal");
		places.add("Sydney");
		places.add("Maldives");
		places.add("Burj Khalif");
		System.out.println("top 10 most visited tourist attractions in the world ");
		System.out.println(places);
		System.out.println("total number of tourist places " +  places.size());
		
		
		/* 3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
       6th Value.*/
		
		int[] numbers = { 25,45,75,85,74,65,15,54,25,18 };
		double average = ( numbers[4]+numbers[5])/ 2.0 ;
		 System.out.println("Average of 5th and 6th Value : " + average);
		 
		 
		/*4. Create a list of the top 5 highest-grossing movies of all time and print out the third
		 movie on the list.*/
		 
		 List<String> movies =new ArrayList<String>();
		 movies.add("Avatar");
		 movies.add("Avengers");
		 movies.add("Titanic");
		 movies.add("Spider Man");
		 movies.add("The Lion King");
		System.out.println("The third movie on the list : " + movies.get(2));
		 
	}

}
