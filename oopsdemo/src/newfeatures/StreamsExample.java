package newfeatures;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Product> lp1 = new ArrayList<Product>();
		
		
		// add products
        lp1.add(new Product(101,"Apple LapTop",35000f));
        lp1.add(new Product(102,"Lenova LapTop",29000f));
        lp1.add(new Product(101,"Hp LapTop",32000f));
        lp1.add(new Product(101,"Dell LapTop",25000f));
        lp1.add(new Product(101,"Sony LapTop",27000f));
		
		
        System.out.println("Laptop price greater than 30000");
        lp1.stream().filter(p ->p.price > 30000)
        			.forEach(p->System.out.println(p.name));
        
        
        //Iterate in a ArrayList
        System.out.println("******Display Products*******");
        lp1.stream()
		.forEach(p->System.out.println(p.id+" "+p.name+" "+p.price));

        
        
        
	}

}
