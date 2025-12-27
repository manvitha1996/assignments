package exceptionHandling;

public class StackOverFlowErrorExample {
	
	
	//we cannot control the flow  . we calling the method and it goes on circle it is called Stack OverFlowError
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}
