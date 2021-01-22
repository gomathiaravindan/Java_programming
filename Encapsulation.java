class Car{
	
	public static final int speed = 250;
	private String type;

	public String getType() {
		return type;
	}
	
	public String getRevenueData()
	{
		String data = "Revenue: "+ calculateRevenue();
		return data;
	}
	private int calculateRevenue()
	{
		return 12000;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setType("Tesla");
		String car_type = car.getType();
		
		String revenue = car.getRevenueData();
		System.out.println("The car model is: "+car_type+ " and "+revenue);
		
		
	}

}
