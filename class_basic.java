class Methods{
	String animal;
	int val;
	String color;
	
	void character()
	{
		System.out.println("Animal is running!!");
		System.out.println("My pet is "+animal+ " and it is " + val+ " years old which is "+color);
	}
}
public class Class_meth_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods name = new Methods();
		
		name.animal= "Cat";
		name.val = 12;
		name.color = "Milky white";
		name.character();
	}

}
