package language.basics;

public class Arrays {

	public static void main(String[] args) {
		
		String emp1Name ="Manvi";
		int emp1Id = 1234;
		
		String emp2Name = "Varni";
		int emp2Id = 1235;
		
		String emp3Name ="Uppi";
		int emp3Id = 1236;
		
		//3D Array
		
		//two organisations. In each organisation there are three project .In each project four employees are working
		
		//Company 1:(0)
		//(0) project 1: "varni","Uppi","Manvi","mani";
		//(1)project 2:"chanti","sunny","abhi","madhu";
		//(2)project 3:"bunny","Tinku","bunty","chintu";
		
		//company 2:(1)
		//(0)Project 1:"puppy","sri","raj","kiran";
		//(1)project 2:"pavani","suchi","manisha","myna";
		//(2)project 3:"sucha","padma","uma","laxmi";
		
		String [][][] empData= new String[2][3][4];
		
		empData [0][1][1] ="sunny";
		empData [1][1][2]="manisha";
		empData [1][2][0] ="sucha";
		empData [0][2][3]="chintu";
		
		
		System.out.println(empData [0][1][1]);
		System.out.println(empData [1][1][2]);
		System.out.println(empData [1][2][0]);
		System.out.println(empData [0][2][3] );
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
