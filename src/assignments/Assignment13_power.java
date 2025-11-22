package assignments;

public class Assignment13_power {

	public static void main(String[] args) {
	
		double x=2.00000;
		int power=10;
		
		double res=1;
		
		if(power>0) {
			
			for(int i=1;i<=power;i++) {
				
				res=res*x;	
			}
		}
		else {
			
			for(int i=-1;i>=power;i--) {
				
			res=res*(1/x);
			
		}
		}
		
		System.out.println(res);
	}

}
