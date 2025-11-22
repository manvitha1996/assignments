package assignments;

public class Assignment12_Stocks {

	public static void main(String[] args) {
		
		int[] prices = {7,1,5,3,6,4};
		
		int min=prices[0];
		int max=0;
		int index=0;
		int index1=0;
		
		for(int i =0; i<prices.length; i++) {  
			
			if(prices[i]<min ) {
				min=prices[i];  //1 
				index=i;
				
			}
				}
		
		for(int i=index ;i<prices.length ;i++) {
			
			if(prices[i]>max) {
				max=prices[i];
				index1=i;
			}
		}
			
		int profit = max-min;
		
		
		if(profit>0) {
			
			System.out.println("the profit we earned :" +profit);	
		}else {
			System.out.println("no profits");
		}
		
	}

}
