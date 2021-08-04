package miscellaneous;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer("Java"); //mutable string
        
		
		buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
        buf.append(7);
        int index = 5;   // Insert  // Java Student Guide Ver1/7
        buf.insert(index, "Student ");                              
        index = 23;      // Set  // Java Student Guide Ver1.7
        buf.setCharAt(index, '.');                                   
        int start = 24;   // Replace  // Java Student Guide Ver1.8
        int end = 25;
        buf.replace(start, end, "8");                               
        String s = buf.toString();   //Convert to string
        System.out.println(buf.reverse());
        System.out.println(s);

        
        System.out.println("*****");
        char a[] = {'a', '5', 'A', ' '};   
        System.out.print(Character.isDigit(a[0]) + " ");
        System.out.print(Character.isWhitespace(a[3]) + " ");
        System.out.print(Character.isUpperCase(a[2]));
	}

}
