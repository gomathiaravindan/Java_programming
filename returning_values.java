class Method_1{
	int num_1,num_2;
	
	int sum()
	{
		return num_1 + num_2;
	}
}
public class Class_ret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_1 sum = new Method_1();
		int add;
		sum.num_1 = 4;
		sum.num_2 = 2;
		add = sum.sum();
		System.out.println(add);
	}

}
