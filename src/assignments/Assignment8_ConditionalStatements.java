package assignments;

public class Assignment8_ConditionalStatements {

	public static void main(String[] args) {
		
		//assuming positive values are credits and negative values debits
		
		int[] transactions = {5000,-2000,3000,-15000,-200,-300,4000,-3000};
	
		//variable to store debit credits amount
		int totalCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransaction = 0;
		
		for(int amount : transactions) {
			if(amount > 0) {
				//credit transaction
				totalCredits++;
				totalCreditAmount += amount;
				
				//checking suspicious transaction
				if(amount > 10000) {
					System.out.println("Suspicious credit transaction amount: "+amount);
					suspiciousTransaction++;
				}
				
			}else {
				
				//debit transaction
				totalDebits++;
				totalDebitAmount -=amount;
				
				//checking the suspicious transaction
				if (amount<-10000) {
					System.out.println("suspicious debit transaction amount : "+amount);
					suspiciousTransaction++;
				}
			}
				
		}
		//final amount
		
		int finalAmount = totalCreditAmount - totalDebitAmount;
		
		System.out.println("total credits : "+totalCredits);
		System.out.println("total debits : "+totalDebits);
		System.out.println("total credited amount : "+totalCreditAmount);
		System.out.println("total debited amount : "+totalDebitAmount);
		System.out.println("final transaction : "+finalAmount);
		System.out.println("Suspicious Transaction : "+suspiciousTransaction);
			
		
		
		
		
	}

}
