class Myprogram{
	
	String name;
	int age;
	
	public Myprogram(String name, int age)
	{
		this(5);
		this.name = name;
		this.age = age;
	}
	public Myprogram(int value)
	{
		System.out.println("The value is: "+value);
	}
	void print()
	{
		System.out.println("My name is "+this.name+" and I am "+this.age+" years old");
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myprogram pro = new Myprogram("Gomathi", 20);
		Myprogram pro1 = new Myprogram("Rathesh", 21);
		pro.print();
		pro1.print();
		
	}

}
