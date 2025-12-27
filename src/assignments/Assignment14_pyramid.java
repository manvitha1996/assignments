package assignments;

public class Assignment14_pyramid {
	
   static  int n=5;
 
	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=n;i++) {
			//print spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");	
				
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
			
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

		


