import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exercise_01 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Asus\\Desktop\\test.txt";
		Scanner fileReader = null;
		int lineNumber = 0;
		try {
			fileReader = new Scanner(new File(fileName));
			System.out.println("File " + fileName + " opened.");
			while (fileReader.hasNextLine()) {
				lineNumber++;
				if (lineNumber % 2 != 0)
					System.out.printf("Line %d:%s%n", lineNumber, fileReader.nextLine());
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + fileName + " not found.");
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.");
		}
	}
}