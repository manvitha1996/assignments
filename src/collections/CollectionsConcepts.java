package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsConcepts {

	public static void main(String[] args) {
		
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
		
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Manvitha");
		empNamesArrayList.add("Manvitha");
		empNamesArrayList.add("Upendar");
		empNamesArrayList.add("Varnika");
		empNamesArrayList.add("Karthik");
		empNamesArrayList.add("Manvitha");//duplicate value
		empNamesArrayList.add("Null");//Null value
		empNamesArrayList.remove("Manvitha");
		empNamesArrayList.remove(4);
		empNamesArrayList.add(0,"manvi");
		System.out.println("Number of employees :" + empNamesArrayList.size());
		System.out.println("employee name at index(3) " + empNamesArrayList.get(3));
		System.out.println("employee list " + empNamesArrayList);
		
		
		
		System.out.println("************ HashSet *****************");
		// Syntax to Initialize: List<DataType> variable = newHashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to get the value: variable.get(index);
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//LinkedList follows insertion order.
		//LinkedList allows Null values.
		//LinkedList follows  non-contiguous memory allocation.
		
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Manvitha");
		empNamesLinkedList.add("Upendar");
		empNamesLinkedList.add("Varnika");
		empNamesLinkedList.add("Karthik");
		empNamesLinkedList.add("Manvitha");//duplicate value
		empNamesLinkedList.add("Null");//Null value
		empNamesLinkedList.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesLinkedList.size());
		System.out.println("employee name at index(3) " + empNamesLinkedList.get(3));
		System.out.println("employee list " + empNamesLinkedList);
	
	
		
		System.out.println("************ HashSet *****************");
		// Syntax to Initialize: List<DataType> variable = newHashSet<DataType>();
		// Syntax to add data: variable.add(value);
		
		// Syntax to remove the value: variable.remove(index/value);
		// Syntax to get the size: variable.size();
		
		//HashSet follows Random order.
		//HashSet wont allow duplicate values
		//HashSet allows Null values.
		//HashSet follows  non-contiguous memory allocation.
		
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Manvitha");
		empNamesHashSet.add("Upendar");
		empNamesHashSet.add("Varnika");
		empNamesHashSet.add("Karthik");
		empNamesHashSet.add("Manvitha");//duplicate value
		empNamesHashSet.add("Null");//Null value
		empNamesHashSet.remove("Manvitha");
		System.out.println("Number of employees :" + empNamesHashSet.size());
		//System.out.println("employee name at index(3) " + empNamesHashSet.get(3));
		System.out.println("employee list " + empNamesHashSet);
	
	}

}
