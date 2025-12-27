package assignments;

public class Assignment16_StringOperation02 {

	
		/*Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
		indexes.
		1. Divide into multiple words
		2. Find total number of occurrences
		3. Print count and Indexes of the word
		
		String paragraph = "Java is a popular programming language. Java is used for web
development, mobile applications, and more.";*/
	
	public static void main(String[] args) {
		
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		System.out.println("Original Para :"+paragraph);
		
		String[] words = paragraph.split(" ");
		
		//get total count and index of 'java' words
		
		int count=0;
		for(int i=0;i<words.length;i++) {
			
			if(words[i].equalsIgnoreCase("Java")) {
				
				System.out.println("Java word is present in Array with Index :"+i);
				count++;
			}				
		}
		
		System.out.println("Total words with Java are :"+count);
		

	}


}
