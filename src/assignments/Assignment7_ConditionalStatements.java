package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		String customerName = "John Doe";
		 int creditScore = 720;
		double income = 55000.0;
		 boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;;
		
/*		If the credit score is above 750, the loan is automatically approved.
		If the credit score is between 650 and 750, additional checks are performed.
		If the credit score is below 650, the loan is denied.*/
		
		if(creditScore>=750) {
		System.out.println(" the credit score is above 750, the loan is automatically approved");
		
	}
		else if(creditScore>=650) {
			System.out.println(" the credit score is between 650 and 750, additional checks are performed.");
			
		/*For credit scores between 650 and 750, the customer’s income must be at least $50,000
			for the loan to be considered.*/	
			
			if(income>=50000.0) {
				System.out.println("For credit scores between 650 and 750, the customer’s income must be at least $50,000 for the loan to be considered.");
			/*If the customer’s income is at least 50,000, the system checks whether the customer is employed.
			 * If the customer is unemployed, the loan is denied.
			 */
				if(isEmployed) {
					System.out.println("customer is employed");
					
					/*If the customer is employed, the system checks the debt-to-income (DTI) ratio.
					 * the DTI ratio is less than 40%, the loan is approved
					 * If the DTI ratio is 40% or greater, the loan is denied.
					  */
					if (debtToIncomeRatio <= 40.0) {
						System.out.println(" the DTI ratio is less than 40%, the loan is approved.");
						}
					else {
						System.out.println(" the DTI ratio is 40% or greater, the loan is denied");
					}
					
					
				}
				else {
					System.out.println("the customer is unemployed, the loan is denied.");
				}
			}
			else {
				System.out.println("the income is less than 50,000 the loan is denied");
			}
		}
		
		else  {
			System.out.println("the credit score is below 650, the loan is denied.");
		}

		
}
}