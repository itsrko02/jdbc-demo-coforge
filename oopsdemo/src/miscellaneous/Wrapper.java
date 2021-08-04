package miscellaneous;




public class Wrapper {

	public static void main(String[] args) {
		
		//create primitive types
		int a=5;
		float b=10.10f;
		
		//covert in to wrapper objects
		Integer aObj =a; //Auto boxing - Convert value type to Object
		Float bObj =b;
		
		
		//create wrapper class Object
		Integer x =Integer.valueOf(100);
		Double y = Double.valueOf(200.00);
		
		//convert into primitive types
		int p = x.intValue(); // Auto unboxing - coverting obj to value type
		double q= y.doubleValue();
		
		System.out.println(p+" "+q);
		System.out.println(aObj + " "+ bObj);
		
		
		char e= 'a';
		Character objE=e; // boxing 
		System.out.println(objE);
		System.out.println(Character.isUpperCase(e));
	
	
		Double d = 200.55;
		Double objD = Double.valueOf(d);
		System.out.println(d);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		
		
		String hex ="0xff";
		String oct ="005";
		
		
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
	}

	
	
}
