package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

//HashSet with user defined objects
public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		
		Set<Customer> customers = new HashSet<Customer>();
		
		//add new Customer Object to set
		customers.add(new Customer(101, "Arun", "Bengaluru"));
		customers.add(new Customer(102, "Mike", "NewYork"));
		customers.add(new Customer(103, "John", "Sydney"));
		customers.add(new Customer(104, "Harry", "Delhi"));
		customers.add(new Customer(105, "Jim", "Bombay"));

		//add duplicate customer
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

		
		customers.add(new Customer(103, "John", "Sydney"));

		for(Customer i: customers) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
		
	}

}
