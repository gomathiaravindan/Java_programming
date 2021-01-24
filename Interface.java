//Interface creation

public interface Information {

	public void displayInformation();
}

//main file


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer cmp = new Computer();
		
		Vehicle veh =  new Vehicle("Bike");
		
		cmp.start();
		cmp.displayInformation();
		
		veh.drive();
		veh.displayInformation();
		
		Information inform = new Computer();
		inform.displayInformation();
		
		Information inform1 = veh;
		inform1.displayInformation();
		
		System.out.println();
		
		showInformation(cmp);
		showInformation(veh);
	}
	
	private static void showInformation(Information info)
	{
		info.displayInformation();
	}

}

//Computer.java

public class Computer implements Information{

	private int serial_no = 903;
	public void start()
	{
		System.out.println("Computer started!!");
	}
	@Override
	public void displayInformation() {
		
		System.out.println("Computer serial_no is: "+ serial_no);
		
	}

}

//Vehicle.java

public class Vehicle extends Computer implements Information{

	private String type;
	
	public Vehicle(String type) {
		this.type = type;
	}
	public void drive()
	{
		System.out.println("Driving the vehicle");

	}
	@Override
	public void displayInformation() {
		
		System.out.println("Vehicle is running");
	}

}


