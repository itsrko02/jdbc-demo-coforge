package miscellaneous;

import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.Softwares;

public class SoftwareList {

	public static void main(String[] args) {

		Softwares s1 = new Softwares();
		s1.printSoftware();
		
		System.out.println("-----------------");
		OperatingSystem os1 = new OperatingSystem();
		os1.listSoftware();
		
		
		
	}

}
