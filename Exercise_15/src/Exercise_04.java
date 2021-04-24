import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 4. Ќапишете програма, ко€то замен€ вс€ко срещане на подниза "start" с "finish" в текстов файл.
ћожете ли да пренапишете програмата така, че да замен€ само цели думи?*/
public class Exercise_04 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Asus\\Desktop\\test4.txt";
		Scanner fileReader = null;
		PrintStream fileOutput = null;
		ArrayList<String> array = new ArrayList<>();
		StringBuilder outputString = new StringBuilder("");

		try {
			fileReader = new Scanner(new File(fileName));

			System.out.println("File " + fileName + " opened.");
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				line = line.replaceAll("start", "finish");
				System.out.println(line);
				outputString.append(line);
			}
		} catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + fileName + " not found.");
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
				try {
					fileOutput = new PrintStream(fileName);
					fileOutput.println(outputString.toString());
					fileOutput.close();
				} catch (FileNotFoundException e) {
					System.out.println("File " + fileName + " not found.");
				}

			}
			System.out.println("Scanner closed.\n");
		}
		Collections.sort(array);
		for (String word : array) {
			System.out.println(word);
		}
	}
}