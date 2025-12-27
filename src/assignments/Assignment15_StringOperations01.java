package assignments;

public class Assignment15_StringOperations01 {
	
	/*Assignment: Write a program to perform the following tasks:
	1. Count the total number of words in the sentence.
	2. Print the sentence words in reverse order.
	3. Convert the first character of each word to uppercase and print original sentence

	String sentence = "Java programming is fun and challenging";*/

	public static void main(String[] args) {
		
		String sentence = "Java programming is fun and challenging";
		System.out.println("Original String :"+sentence);
		
		//1. Count the total number of words in the sentence.
		String[] words = sentence.split(" ");
		System.out.println("Total number of words :"+words.length);
		
		//2. Print the sentence words in reverse order.
		
		String reversedSentence ="";
		for(int i=words.length-1;i>=0;i--) {
			reversedSentence = reversedSentence + words[i]+" ";
		}
		System.out.println("reverse order :"+reversedSentence);
		
		
		//3. Convert the first character of each word to uppercase and print original sentence
		
		String upperCaseSentence ="";
		
		for(String word : words) {
			
			upperCaseSentence =upperCaseSentence+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
			
		}
		System.out.println("Uppercase Sentence is :"+upperCaseSentence);
	}

}
