import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[10];
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 number:");
		for(i=0;i<10;i++)
		{
			numbers[i] = input.nextInt();
			
		}
		for(i=0;i<numbers.length;i++)
		{
			System.out.println("Your value is: "+numbers[i]);
		}
	}

}
