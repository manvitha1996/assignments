package stringOperations;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) {
		
		//Convert Other data type to string==>String.valueOf(data);
		
		int std = 144;
		int phone =345323;
		String stdCode = String.valueOf(std);
		System.out.println(stdCode+phone);
		
		//converting string to other data types==>Integer.parseInt(String),Integer.valueOf(String)
		String balance = "Account Balance is : 99999.99$";
		balance = balance.replaceAll("[^0-9.]", "");
		double balValue = Double.valueOf(balance);
		System.out.println(balValue>10000);
		
		//Converting today's date and time to String 
				SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy hh:mm:ss");
				String dateString = sdf.format(Calendar.getInstance().getTime());
				System.out.println("Today's date and time: " + dateString);
				
		
	}

}
