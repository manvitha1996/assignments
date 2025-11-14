   package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsConcepts {

	public static void main(String[] args) {
		
		//An array is a data structure that is going to allow us to store multiple values with similar data types together in the same memory location.

				String [] empNames = new String[3]; // This can hold 3 employee names.
				empNames[0] = "Varnika";
				empNames[1] = "Upendar";
				empNames[2] = "Varnika";
				
		System.out.println(empNames.length);
		
		/****Challenges with Array****/
		//1. Arrays are fixed in size.
		//2. Memory will be allocated at the beginning of creating the array. That means it is a static memory allocation.
		//3. Array allows similar data types only.
		//4. Arrays won't allow modifications.
		
		/****** Collections Framework ******/
		
		// Advantages
		
		//1. Collections are dynamic in size, meaning no need to declare the size at the beginning.
		//2. Memory will be allocated dynamically based on the data that we are going to store.
		//3. Collections allow different data types within the same data structure.
		//4. Collections allow modifications.
		
		//Major categories of collections that we are going to use in our day-to-day automation roles. ==> List, Set, Map
		
		//List ==> ArrayList,HashSet
		//1. List can store multiple values with similar data types together at one place by allocating the memory dynamically.
		//2. List follows dynamic memory allocation.
		//3. List allows Duplicate values.
		//4. List allows modifications.		
		
		//Set ==> HashSet, LinkedHashSet, TreeSet
		//1. Set can store multiple values with similar data types together at one place by allocating the memory dynamically.
		//2. Set follows dynamic memory allocation.
		//3. Set won't allow duplicate values.
		//4. Set allows modifications.
		
		//Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		
		//1. Map can store multiple values with different data types together (like Key, Value) at one place by allocating memory dynamically.
		//2. Map follows dynamic memory allocation.
		//3. Map won't allow duplicate Keys, But allows duplicate values.
		//4. Set allows modifications.

		// Difference between each sub-category of List, Set, and Map.
		
		// Order of storing values : Insertion order, Sorted/Ascending Order , Random order
		// Allowing the Null values : Allowed / Not-Allowed
		// Memory Allocation Technique : Contiguous Memory Allocation/Non-Contiguous Memory Allocation
		
		/*************Wrapper Classes************/
		//Wrapper classes are used to convert primitive data types into class data types.
		
		//byte --> Byte
		//short --> Short
		//int --> Integer
		//long --> Long
		//float --> Float
		//double --> Double
		//boolean --> Boolean
		//char --> Character
		
		
		/************Key-Words************/
		//1. Hash  --> Random order
		//2. Linked --> Insertion order
		//3. Tree --> Sorted/Ascending order
		
		/************  ArrayList *****************/
		
		System.out.println("************  ArrayList *****************");
		// Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//ArrayList follows insertion order.
		//ArrayList allows Null values.
		//ArrayList follows contiguous memory allocation.
		
		//Store employee Name using ArrayList
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Manvitha");
		empNamesArrayList.add("Manvitha");
		empNamesArrayList.add("Upendar");
		empNamesArrayList.add("Varnika");
		empNamesArrayList.add("Karthik");
		empNamesArrayList.add("Manvitha");//duplicate value
		empNamesArrayList.add(null);//Null value
		empNamesArrayList.remove(5);
		empNamesArrayList.add(0,"manvi");
		System.out.println("Number of employees :" + empNamesArrayList.size());
		System.out.println("employee name at index(3) " + empNamesArrayList.get(3));
		System.out.println("employeeList " + empNamesArrayList);
		
		
		
		System.out.println("************ LinkedList *****************");
		// Syntax to Initialize: List<DataType> variable = new HashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//LinkedList follows insertion order.
		//LinkedList allows Null values.
		//LinkedList follows  non-contiguous memory allocation.
		
		//Store employee Name using LinkedList
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Manvitha");
		empNamesLinkedList.add("Upendar");
		empNamesLinkedList.add("Varnika");
		empNamesLinkedList.add("Karthik");
		empNamesLinkedList.add("Manvitha");//duplicate value
		empNamesLinkedList.add(null);//Null value
		empNamesLinkedList.remove(4);
		System.out.println("Number of employees :" + empNamesLinkedList.size());
		System.out.println("employee name at index(3) " + empNamesLinkedList.get(3));
		System.out.println("employee list " + empNamesLinkedList);
	
	
		
		System.out.println("************ HashSet *****************");
		// Syntax to Initialize: Set<DataType> variable = new HashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//HashSet follows Random order.
		//HashSet wont allow duplicate values
		//HashSet allows Null values.
		
		
		//Store employee Name using HashSet
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Manvitha");
		empNamesHashSet.add("Upendar");
		empNamesHashSet.add("Varnika");
		empNamesHashSet.add("Karthik");
		empNamesHashSet.add("Manvitha");//duplicate value
		empNamesHashSet.add(null);//Null value
		empNamesHashSet.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesHashSet.size());
		//System.out.println("employee name at index(3) " + empNamesHashSet.get(3));
		System.out.println("employee list " + empNamesHashSet);
	
		
		System.out.println("************ LinkedHashSet *****************");
		// Syntax to Initialize: Set<DataType> variable = new LinkedHashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//LinkedHashSet follows Insertion order.
		//LinkedHashSet wont allow duplicate values
		//LinkedHashSet allows Null values.
		//LinkedHashSet follows  non-contiguous memory allocation.
		
		//Store employee Name using LinkedHashSet
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Manvitha");
		empNamesLinkedHashSet.add("Upendar");
		empNamesLinkedHashSet.add("Varnika");
		empNamesLinkedHashSet.add("Karthik");
		empNamesLinkedHashSet.add("Abhi");
		empNamesLinkedHashSet.add("Manvitha");//duplicate value
		empNamesLinkedHashSet.add(null);//Null value
		empNamesLinkedHashSet.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesLinkedHashSet.size());
		//System.out.println("employee name at index(3) " + empNamesLinkedHashSet.get(3));
		System.out.println("employee list " + empNamesLinkedHashSet);
		
		
		System.out.println("************ TreeSet *****************");
		// Syntax to Initialize: Set<DataType> variable = new TreeSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//TreeSet follows Sorted/ascending order.
		//TreeSet wont allow duplicate values
		//TreeSet wont allows Null values.
		
		
		//Store employee names using TreeSet
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Manvitha");
		empNamesTreeSet.add("Upendar");
		empNamesTreeSet.add("Varnika");
		empNamesTreeSet.add("Karthik");
		empNamesTreeSet.add("Abhi");
		empNamesTreeSet.add("Manvitha");//duplicate value
		//empNamesTreeSet.add(null);//Null value
		empNamesTreeSet.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesTreeSet.size());
		//System.out.println("employee name at index(3) " + empNamesTreeSet.get("Abhi"));
		System.out.println("employee list " + empNamesTreeSet);
		
	
		
		System.out.println("************ HashMap *****************");
		// Syntax to Initialize: Map<key,value> variable = new HashMap<key,value>();
		// Syntax to add data: variable.put(key,value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//HashMap follows random order of keys
		//HashMap allow duplicate values
		//HashMap allows Null keys and null values.
		
		
		//Store employee names using HashMap
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Manvitha",1234);
		empNamesHashMap.put("Upendar",1235);
		empNamesHashMap.put("Varnika",1236);
		empNamesHashMap.put("Karthik",1237);
		empNamesHashMap.put("Manvitha",1238);//duplicate value
		empNamesHashMap.put("Sunny" ,null);//Null value
		empNamesHashMap.put(null ,1239);//Null key 
		empNamesHashMap.remove("Karthik");
		System.out.println("Number of employees :" + empNamesHashMap.size());
		System.out.println("employee name at index(3) " + empNamesHashMap.get("Varnika"));
		System.out.println("employee list " + empNamesHashMap);
		
		
		System.out.println("************ LinkedHashMap *****************");
		// Syntax to Initialize: Map<key,value> variable = new LinkedHashMap<key,value>();
		// Syntax to add data: variable.put(key,value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//LinkedHashMap follows Insertion order of keys
		//LinkedHashMap  allow duplicate values
		//LinkedHashMap allows Null keys and null values.
		
		
		//Store employee names using LinkedHashMap
		Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Manvitha",1234);
		empNamesLinkedHashMap.put("Upendar",1235);
		empNamesLinkedHashMap.put("Varnika",1236);
		empNamesLinkedHashMap.put("Karthik",1237);
		empNamesLinkedHashMap.put("Manvitha",1238);//duplicate value
		empNamesLinkedHashMap.put("Sunny" ,null);//Null value
		empNamesLinkedHashMap.put(null ,1239);//Null key 
		empNamesLinkedHashMap.remove("Karthik");
		System.out.println("Number of employees :" + empNamesLinkedHashMap.size());
		System.out.println("employee name at index(3) " + empNamesLinkedHashMap.get("Varnika"));
		System.out.println("employee list " + empNamesLinkedHashMap);
		
		

		System.out.println("************ TreeMap *****************");
		// Syntax to Initialize: Map<key,value> variable = new TreeMap<key,value>();
		// Syntax to add data: variable.put(key,value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//TreeMap follows Ascending order of keys
		//TreeMap  allow duplicate values
		//TreeMap allows null values but not allows null keys
	
		
		//Store employee names using TreeMap
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Manvitha",1234);
		empNamesTreeMap.put("Upendar",1235);
		empNamesTreeMap.put("Varnika",1236);
		empNamesTreeMap.put("Karthik",1237);
		empNamesTreeMap.put("Manvitha",1238);//duplicate value
		empNamesTreeMap.put("Sunny" ,null);//Null value
		//empNamesTreeMap.put(null ,1239);//Null key 
		empNamesTreeMap.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesTreeMap.size());
		System.out.println("employee name at index(3) " + empNamesTreeMap.get("Varnika"));
		System.out.println("employee list " + empNamesTreeMap);
		
		
		System.out.println("************ Hashtable *****************");
		// Syntax to Initialize: Map<key,value> variable = new Hashtable<key,value>();
		// Syntax to add data: variable.put(key,value);
		// Syntax to get the value: variable.get(key);
		// Syntax to remove the value: variable.remove(key);
		// Syntax to get the size: variable.size();
		
		//Hashtable follows random order
		//Hashtable allow duplicate values
		//Hashtable  wont allows null values and null keys
	
		
		//Store employee names using Hashtable
		Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Manvitha",1234);
		empNamesHashtable.put("Upendar",1235);
		empNamesHashtable.put("Varnika",1236);
		empNamesHashtable.put("Karthik",1237);
		empNamesHashtable.put("Manvitha",1238);//duplicate value
		//empNamesHashtable.put("Sunny" ,null);//Null value
		//empNamesHashtable.put(null ,1239);//Null key 
		empNamesHashtable.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesHashtable.size());
		System.out.println("employee name at index(3) " + empNamesHashtable.get("Varnika"));
		System.out.println("employee list " + empNamesHashtable);
	}

}
