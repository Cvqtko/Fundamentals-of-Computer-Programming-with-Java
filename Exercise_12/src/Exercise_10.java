import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/* 10. Потърсете информация в Интернет и дефинирайте собствен клас за изключение FileParseException. 
Вашето изключение трябва да съдържа в себе си името на файл, който се обработва и номер на ред, 
в който възниква изключението. Добавете подходящи конструктори за вашето изключение. 
Напишете програма, която чете от текстов файл числа. Ако при четенето се стигне до ред, 
който не съдържа число, хвърлете вашия exception и го обработете в извикващия метод.*/
public class Exercise_10 {
	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\Asus\\Desktop\\test1.txt";
		try {
			readFile(fileLocation);
		} catch (FileParseException fpe) {
			// TODO Auto-generated catch block
			System.out.println(fpe.getMessage());

		}
	}

	public static void readFile(String fileLocation) throws FileParseException {
		File f = new File(fileLocation);
		Scanner scan = null;
		try {
			scan = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exists.");

		}
		int number;
		int line = 0;
		while (scan.hasNextLine()) {
			line++;
			try {
				number = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException nfe) {
				throw new FileParseException("Line " + line + " doesn`t contain a number", fileLocation, line);
			}
		}

	}
}
