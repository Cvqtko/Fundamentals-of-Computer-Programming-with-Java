import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_01 {
	private static final String INPUT_FILE_NAME = "C:\\Users\\Asus\\Desktop\\Ðroblem1.txt";
	private static final String OUTPUT_FILE = "C:\\Users\\Asus\\Desktop\\Ðroblem2.txt";
	private static final String CHARSET = "windows-1251";

	public static void main(String args[]) {

		Scanner scanner = null;
		PrintWriter output = null;
		try {
			scanner = new Scanner(new File(INPUT_FILE_NAME), CHARSET);
			output = new PrintWriter(new File(OUTPUT_FILE));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				line = removeAllTags(line);
				if (!line.equals("")) {
					System.out.println(line);
					output.println(line);
				}
			}
		} catch (IOException ioex) {
			System.err.println("Can read file " + INPUT_FILE_NAME);
		} finally {
			if (scanner != null) {
				scanner.close();
				output.close();
			}
		}
	}

	private static String removeAllTags(String str) {
		String strWithoutTags = str.replaceAll("<[^>]*>", "");
		return strWithoutTags;
	}
}
