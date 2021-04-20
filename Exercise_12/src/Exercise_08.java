import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/* 8. Напишете метод, който приема като параметър име на текстов файл и прочита съдържанието му и го връща като String.*/
public class Exercise_08 {
	public static void main(String[] args) {

		String fileLocation = "C:\\Users\\Asus\\Desktop\\test.txt";
		try {
			System.out.println(readFile(fileLocation));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String readFile(String fileLocation) throws IOException {
		File file = null;
		FileReader reader = null;
		StringBuilder fileContent = new StringBuilder("");
		try {
			file = new File(fileLocation);
			reader = new FileReader(file);
			int i;
			while ((i = reader.read()) != -1) {
				fileContent.append((char) i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file \"" + file + "\" does not exist! Unable to read it.");
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return fileContent.toString();
	}
}
