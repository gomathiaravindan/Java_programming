class Student{
	
	public static final String Text = "Good Morning";
	public String name;//it cannot be accessed by static function
	public static String studentclass;//it can be accessed by other non-static functions
	//Constructor
	public static int counter = 0;
	public Student()
	{
		counter++;
	}
	public static void value()
	{
		System.out.println(studentclass);
	}
}
public class Static_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To access static variable or class we have to provide Classname.staticvariable
		Student.studentclass = "5th Standard";
		Student.value();
		
		Student stu1= new Student();
		Student stu2 =  new Student();
		
		System.out.println("After creating two objects the counter will be: "+ Student.counter);
		stu1.name = "Gomathi";
		stu2.name = "George";
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		System.out.println(Student.Text);//This is static final variable which is constant 
		
	}

}
