package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// generic arrayList - store data of specific type
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		//add elements to arrayList
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		
		System.out.println(a1);
		
		//get elements by index
		System.out.println("Element at Index 1: "+a1.get(1));
		
		System.out.println("Does list contains element Java ?: "+a1.contains("Java"));
		
		//add elements at specific index
		a1.add(2, "Oracle");
		System.out.println(a1);
		
		System.out.println("Is ArrayList Empty ? :"+a1.isEmpty());
		System.out.println("Index of Perl :"+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList :"+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array List after sorting :"+a1);
		
//		a1.add(100); //compiler error
		
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(100);
		a2.add(52);
		a2.add(69);
		a2.add(420);
		a2.add(9820);
		a2.add(21);
		
		System.out.println(a2);
		System.out.println("Size :"+a2.size());
	}

}
