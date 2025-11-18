package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment10_HikePercentage {

	public static void main(String[] args) {
		
		//employee names
		
		String[] empName = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		 // Employee Data: {Base Salary, Experience, Rating}
		
        Double[] emp1Data = {75000.0, 5.0, 4.2};
        Double[] emp2Data = {68000.0, 3.0, 3.8};
        Double[] emp3Data = {82000.0, 7.0, 4.5};
        Double[] emp4Data = {90000.0, 10.0, 2.0};
        Double[] emp5Data = {60000.0, 2.0, 3.5};
        
        //combining names and data by using map
        
        Map<String,Double[]> empData = new HashMap();
        
        empData.put(empName[0],emp1Data);/*(key,value)=(Alice,750000,......)*/
        empData.put(empName[1],emp1Data);
        empData.put(empName[2],emp1Data);
        empData.put(empName[3],emp1Data);
        empData.put(empName[4],emp1Data);
        

		Map<String,Double> hikeMap = new HashMap();
		
		// Calculate hike for each employee using common method
        for (String emp : empName) {
            Double[] data = empData.get(emp);
            double hikePercentage = calculateHike(data[0], data[1], data[2]); 
            hikeMap.put(emp, hikePercentage);
        }
        
        System.out.println("Hike Percentage for each employee:");
        for(String emp : empName) {
        	System.out.println(emp + ": " + hikeMap.get(emp) + "%");
        }
	}
        
        //calculating hike by using rating
	
        public static double calculateHike(double baseSalary, double experience, double rating) {
        	
            double variablePayPercentage=0;
            double bonus=0;
            double reward = 0;

        
        if(rating >= 4) {
        	
        	 variablePayPercentage =15.0;
        	 bonus =1500;
        	 
        }else if(rating >= 3) {
        	
        	 variablePayPercentage =10.0 ;
        	 bonus =1200;
        }else {
        	 variablePayPercentage = 3.0;
        	 bonus =300;
        }

        // Additional reward for employees with 5+ years of experience
        if (experience >= 5) {
            reward = 5000;
        }

        // Calculate total hike amount
        double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;

        // Return hike percentage
        return (hike / baseSalary) * 100;
        

	}

}
