package newfeatures;

public class VariableArgsDemo {

	// takes string as 1st input parameter & followed by varargs
	
	static void fun(String s, int ...a) {
		System.out.println("String Passed: "+s);
		System.out.println("No of Argumnets passed :"+a.length);
	
	
	//for each loop to display varargs
	for(int i: a) {
		System.out.println(i+" ");
	}
	
	
}
	
	
	public static void main(String[] args) {
		
		fun("JDBC",100,200);
		fun("Swings",1,2,3,4,5,6,7);
		fun("MySQL");
//		fun(10,20);
		
	}

}
