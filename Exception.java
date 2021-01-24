import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application_2 {

	public static void main(String[] args) {
		

		File file = new File("example.txt");
		
		try {
		Scanner readfile = new Scanner(file);
		String text = readfile.nextLine();
		
		System.out.println(text);
		
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found!!");
		}
		

	}

}
