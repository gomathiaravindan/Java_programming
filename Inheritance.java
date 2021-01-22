//Main file

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived_class car1 = new Derived_class();
		
		car1.design();
		car1.build();
		
		Car c1 = new Car();
		c1.design();
		c1.build();
		c1.brand();
	}

}

//Parent file
public class Derived_class {
	public void design()
	{
		System.out.println("Design the car");
	}
	
	public void build()
	{
		System.out.println("Built the car");
	}
}

//Inherited file

public class Car extends Derived_class{
		
	public void brand() {
		System.out.println("Tata");
	}
	
}
