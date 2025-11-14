package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections2 {

	public static void main(String[] args) {
		
		//Student 1 details are stored by using map(HashMap)
		
		       Map<String,String> Student1 = new LinkedHashMap<String,String>();
		       Student1.put("name","John Doe");
		       Student1.put("Age","20");
	           Student1.put("Gender","Male");
		       Student1.put("Roll Number","SBA12345");
		       Student1.put("Grade","A++");
		       Student1.put("Major","Computer Science");
		       Student1.put("GPA","A3.8");
		       Student1.put("Email","john@exam");
		       Student1.put("PAN Number","SDF6543210");
		       Student1.put("Adress","123 Elm St");
		
		//Student 2 details are stored by using map(HashMap)
		
				Map<String,String> Student2 = new LinkedHashMap<String,String>();
				Student2.put("name","Jane Smith");
				Student2.put("Age","21");
				Student2.put("Gender","Female");
				Student2.put("Roll Number","SBA12346");
				Student2.put("Grade","B+");
				Student2.put("Major","Mathematics");
				Student2.put("GPA","A3.5");
				Student2.put("Email","jane@exam");
				Student2.put("PAN Number","SDF6543211");
				Student2.put("Adress","456 Oak St");
				
				//Student 3 details are stored by using map(HashMap)
				
				Map<String,String> Student3 = new LinkedHashMap<String,String>();
				Student3.put("name","Mike Brown");
				Student3.put("Age","22");
				Student3.put("Gender","Male");
				Student3.put("Roll Number","SBA12347");
				Student3.put("Grade","A+");
				Student3.put("Major","Physics");
				Student3.put("GPA","A3.9");
				Student3.put("Email","mike@exam");
				Student3.put("PAN Number","SDF6543212");
				Student3.put("Adress","789 Pine St");		
		
				//creating list of all the student tables by using list
				
				List<Map<String,String>> StudentList = new ArrayList<Map<String,String>>();
				
				StudentList.add(Student1);
				StudentList.add(Student2);
				StudentList.add(Student3);
				
				System.out.println("Students List " + StudentList);
				
				
				//creating employee list by using Map(HashMap)
				
				Map<String,String> emp1 = new LinkedHashMap<String,String>();
				
				emp1.put("Employee ID","E001");
				emp1.put("Name","Alice Green");
				emp1.put("Age","30");
				emp1.put("Gender","Female");
				emp1.put("Department","Engineering");
				emp1.put("Position","Software Engineering");
				emp1.put("Salary","75 k Pounds");
				emp1.put("Email","alice@example.com");
				emp1.put("PAN Number","SDF6543210");
				
				
				
Map<String,String> emp2 = new LinkedHashMap<String,String>();
				
				emp2.put("Employee ID","E002");
				emp2.put("Name","Bob Johnson");
				emp2.put("Age","35");
				emp2.put("Gender","Male");
				emp2.put("Department","Marketing");
				emp2.put("Position","Marketing Manager");
				emp2.put("Salary","85 k Pounds");
				emp2.put("Email","bob@example.com");
				emp2.put("PAN Number","REW6543211");
				
				
Map<String,String> emp3 = new LinkedHashMap<String,String>();
				
				emp3.put("Employee ID","E003");
				emp3.put("Name","Carol White");
				emp3.put("Age","28");
				emp3.put("Gender","Female");
				emp3.put("Department","Sales");
				emp3.put("Position","sales Executive");
				emp3.put("Salary","65k Pounds");
				emp3.put("Email","carol@example.com");
				emp3.put("PAN Number","TYR6543212");
				
		// combing all employee details by using List	
				
	List<Map<String,String>> empList = new ArrayList<Map<String,String>>();
	    
	    empList.add(emp1);
	    empList.add(emp2);
	    empList.add(emp3);
	    
	    System.out.println("Employees List " +empList);
	    
	    //creating product details by using Map(HashMap)
				
	    Map<String,String> product1 = new LinkedHashMap<String,String>();
	     
	     product1.put("Product ID","P001");
	     product1.put("Name","Laptop");
	     product1.put("Category","Electronics");
	     product1.put("Price","12K Pounds");
	     product1.put("Stock Quantity","Not Available");
	     product1.put("Supplier","Tech Suppliers");
	     product1.put("Warrenty","2 Years");
	     product1.put("Rating","4.5 Stars");
	     product1.put("Manufacturing Date","Aug 2023");
	     product1.put("Expiry Date","Aug 2028");
	     
				
			
		    Map<String,String> product2 = new LinkedHashMap<String,String>();
		    
		     product2.put("Product ID","P002");
		     product2.put("Name","DeskChair");
		     product2.put("Category","Furniture");
		     product2.put("Price","150 K Pounds");
		     product2.put("Stock Quantity","Two");
		     product2.put("Supplier","Office Depot");
		     product2.put("Warrenty","1 Years");
		     product2.put("Rating","4 Stars");
		     product2.put("Manufacturing Date","Aug 2024");
		     product2.put("Expiry Date","N/A");
		     
		     Map<String,String> product3 = new LinkedHashMap<String,String>();
			    
		     product3.put("Product ID","P003");
		     product3.put("Name","Coffee Maker");
		     product3.put("Category","Kitchen");
		     product3.put("Price","75 K Pounds");
		     product3.put("Stock Quantity","Two Hundred");
		     product3.put("Supplier","KitchenWorld");
		     product3.put("Warrenty","6 Months");
		     product3.put("Rating","4.2 Stars");
		     product3.put("Manufacturing Date","Aug 2025");
		     product3.put("Expiry Date","Jan 2027");
		     
		List<Map<String,String>> productList = new ArrayList<Map<String,String>>();
		     productList.add(product1);
		     productList.add(product2);
		     productList.add(product3);
		     
		     System.out.println("Products List " + productList);
		     
		     
		Map<String,List<Map<String,String>>> data = new LinkedHashMap<String,List<Map<String,String>>>();    
		     
		     data.put("Student Data", StudentList);
		     data.put("Employee Data", empList);
		     data.put("Product Data", productList);
		     System.out.println("dataList :" + data);
		     
		 System.out.println("Supplier Name of 2 row of Product Data :" + data.get("Product Data").get(1).get("Supplier"));    
		     
		     
		     			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
