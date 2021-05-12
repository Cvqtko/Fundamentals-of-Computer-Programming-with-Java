
import java.io.File;
import java.util.Scanner;

public class codeFromBook {
	// Java Program to illustrate reading from
	// FileReader using FileReader

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Asus\\Desktop\\test.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if(s.length()>3) {
			s = s.substring(s.indexOf(" "));
			System.out.println(s);
			}
		}
	}
}
