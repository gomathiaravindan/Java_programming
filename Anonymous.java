class Computer_1
{
	public void shutdown()
	{
		System.out.println("Computer is shutting down!!");
	}
}
//another example for anonymous class using interface

interface Driver{
	public void drive();
}
public class Application_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anonymous class
		Computer_1 comp1 =  new Computer_1()
				{
					public void shutdown()
					{
						System.out.println("Mac is shutting down");
					}
				};
		
		comp1.shutdown();
		
		Driver drive = new Driver()
				{
					public void drive() {
						
						System.out.println("Driver is driving");
					}
					
				};
				
				
		drive.drive();
	}

}
