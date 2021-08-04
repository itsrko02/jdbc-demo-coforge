package newfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Using Lambda Expressions to iterate in Map

public class LambdaInMap {

	public static void main(String[] args) {
		
		
		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        //use lambda expression to traverse a map - Java 8
        books.forEach((key,value)->System.out.println("Book Name :"+key+" - Author :"+value));
		
        System.out.println("-------Normal way to traverse a map--------------");
        for(Entry<String,String> e: books.entrySet()) { //for-in loop - Java 5
        	System.out.println(e.getKey()+" "+e.getValue());
        }
		
	}

}
