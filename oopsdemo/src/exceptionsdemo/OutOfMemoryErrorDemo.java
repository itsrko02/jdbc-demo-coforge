package exceptionsdemo;

public class OutOfMemoryErrorDemo {

	
	public void createArray(int size) {
		try {
			Integer[] a = new Integer[size];
		}
		catch(OutOfMemoryError e) {
			System.err.println("Array Size too large"+e);
			System.err.println("Max JVM Memory: "+Runtime.getRuntime().maxMemory());
			System.out.println("Java Version :"+Runtime.version());
		}
	}
	/*
	 * System.err is a PrintStream. System.err works like 
	 * System.out except it is normally only used to output error texts.
		Some programs (like Eclipse) will show the output to System.err in red text, 
		to make it more obvious that it is error text.
	 */
	
	public static void main(String[] args) {
		
		OutOfMemoryErrorDemo d1 = new OutOfMemoryErrorDemo();
		
		d1.createArray(1000*1000*1000);
		
		
		//open notepad
		try {
		Runtime.getRuntime().exec("notepad");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
