package keywords;

public class EnumExamples {

	
	enum Direction {
		NORTH,SOUTH,EAST,WEST
	}
	 enum Operation{
		 ADD{
			 @Override
			 public int result(int a,int b) {
				 return a+b;
			 }
		 },
		 SUBSTRACT{
			 @Override
			 public int result(int a,int b) {
				 return a-b;
			 }
			 
		 },
		 MULTIPLE{
			 @Override
			 public int result(int a,int b) {
				 return a * b;
			 }
		 },
		 DIVIDE{
			 @Override
			 public int result(int a,int b) {
				 return a/b;
			 }
		 };
		 
		 public abstract int result(int a,int b);
	 }
	
	 // before using enum
	final String direction1 = "NORTH";
	final String direction2 = "SOUTH";
	final String direction3 = "EAST";
	final String direction4 = "WEST";
	
	public static void main(String[] args) {
		
		System.out.println(Direction.NORTH);
        System.out.println(Operation.DIVIDE.result(10,5));
	}

}
