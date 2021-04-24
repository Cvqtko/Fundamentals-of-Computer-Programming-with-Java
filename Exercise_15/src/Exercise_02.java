import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 2. Напишете програма, която чете списък от имена от един текстов файл, 
сортира ги по азбучен ред и ги запазва в друг файл. Имената да са с латински букви. 
На всеки ред от файла, където са записани имената, има точно по едно име. 
На всеки ред от файла с резултата също трябва да има само по едно име.*/
public class Exercise_02 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Asus\\Desktop\\test1.txt";
		Scanner fileReader = null;
		ArrayList<String> array = new ArrayList<>();
		try {
			fileReader = new Scanner(new File(fileName));
			System.out.println("File " + fileName + " opened.");
			while (fileReader.hasNextLine()) {
				String word = fileReader.nextLine();
				array.add(word);
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
			System.out.println("Scanner closed.\n");
		}
		Collections.sort(array);
		for (String word : array) {
			System.out.println(word);
		}
	}
}