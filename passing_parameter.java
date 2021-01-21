class Method_1{
	int num_1,num_2;
	
	int sum(int num_1,int num_2)
	{
		return num_1 + num_2;
	}
}
public class Class_ret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_1 sumof = new Method_1();
		int add;
		sumof.num_1 = 4;
		sumof.num_2 = 2;
		add = sumof.sum(sumof.num_1,sumof.num_2);
		System.out.println(add);
	}

}
