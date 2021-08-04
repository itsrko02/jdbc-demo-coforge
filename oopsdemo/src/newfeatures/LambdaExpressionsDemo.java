package newfeatures;

@FunctionalInterface
interface MyFunctionalInterface{
	
	public String sayHello();
}


//FI
interface MyFunctionalInterface1{
	
	public int incrementbyFive(int a);
}


interface StringConcat{
	
	public String sconcat(String a, String b);
}


public class LambdaExpressionsDemo {

	public static void main(String[] args) {
	
		
		//Lambda expression with no parameter
		MyFunctionalInterface msg = ()->{return "Hello from Lambda Expressions";};
		System.out.println(msg.sayHello());
		
		
		//Lambda expression with single parameter
		MyFunctionalInterface1 f = (num)->num+5;
		System.out.println(f.incrementbyFive(20));
		
		
		//Lambda expression with multiple arguments
		StringConcat s = (str1, str2)-> str1+str2;
		System.out.println("String concat using lamba expression");
		System.out.println(s.sconcat("Hello", "Java8"));
		
	}

}
