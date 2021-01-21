import java.util.Scanner;
public class switch_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String ch = input.nextLine();
		
		switch(ch)
		{
		case "Apple":
			System.out.println("You got an apple!!");
			break;
		case "Ball":
			System.out.println("You got a ball!!");
			break;
		case "Cat":
			System.out.println("Meowww pushy cat!!");
			break;
		default:
			System.out.println("Oops, sorry better luck next time!!");
			break;
		}
	}

}
