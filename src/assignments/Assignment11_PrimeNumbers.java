package assignments;

public class Assignment11_PrimeNumbers {

	public static void main(String[] args) {

		// A Prime number is a number greater than 1
		// that is divisible only by 1 and itself.
		// Example: 2, 3, 5, 7, 11, ...

		int input= 7;

		boolean prime = true;

		if(input<=1) {

			System.out.println("it is not a prime number "+input);
			prime =false;
		}

		for(int i=2 ; i<input ;i++) {

			if(input % i == 0) {

				prime = false;
			}

		}

		if(prime) {
			System.out.println("the number is prime number "+prime);
		}
		else {
			System.out.println("its not a prime number :" +prime);
		}


		//25 is prime or not
		int input1= 25;

		boolean prime1 = true;//false

		if(input1<=1) {
			System.out.println("it is not a prime number "+input1);
			prime1 =false;
		}
		for(int i=2 ; i<input1 ; i++) {


			if(input1 % i == 0) {
				prime1 = false;	

			}

		}
		if(prime1) {
			System.out.println("the number is prime number "+prime1);
		}
		else {
			System.out.println("its not a prime number :" +prime1);
		}


		//1 is prime or not	
		
		int input2 =1;

		boolean prime2 = true;

		if(input2 <=1) {
			
			prime2 = false;
			System.out.println("its not a prime number " +prime2);
			
		}
			

		}
	}
