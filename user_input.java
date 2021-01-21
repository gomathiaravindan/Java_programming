import java.util.Scanner;

public class user_input {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter something: ");
		String txt = input.nextLine();
		
		System.out.println("Enter an integer:");
		int n = input.nextInt();
		
		System.out.println("Enter a decimal value:");
		double deci = input.nextDouble();
		
		System.out.println("Your input is: "+txt);
		System.out.println("Your number is: "+n);
		System.out.println("Yout decimal value is: "+deci);
	}

}
