package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		
		System.out.println("*****Book Details*****");
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		
		System.out.println(b1); // invoke toString() method in the instance
	}

}
