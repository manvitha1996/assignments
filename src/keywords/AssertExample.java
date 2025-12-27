package keywords;

public class AssertExample {

	public static void main(String[] args) {
		
		//assert : assert is a keyword we are going to use to implement assertion in Java.
		//Assertions will be used to compare the expected result versus the actual result.
		
		int age =17;
		assert age >= 18 :"Age is not valid to vote";
		
		System.out.println("you are eligible to vote");

	}

}
