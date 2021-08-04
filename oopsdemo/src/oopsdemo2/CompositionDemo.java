package oopsdemo2;


class Honda extends Car{

	public void hondaStart() {
		
		Engine heng = new Engine(); //Composition - Honda class fully dependent on Engine
		heng.startEngine();
	}
}


public class CompositionDemo {

	public static void main(String[] args) {

		Honda hondaCity = new Honda();
		
		hondaCity.setColor("Silver");
		hondaCity.setMax_speed(180);
		
		
		System.out.println("*********Honda Car Details******");
		System.out.println(hondaCity.getColor()+" Color");
		System.out.println(hondaCity.getMax_speed()+ " Speed");
		
		hondaCity.hondaStart();
	}

}
