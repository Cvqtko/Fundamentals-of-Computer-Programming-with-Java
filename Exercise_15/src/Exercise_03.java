import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/* 3. Напишете програма, която чете от файл квадратна матрица от цели числа 
и намира подматрицата с размери 2 х 2 с най-голяма сума и записва тази сума в отделен текстов файл. 
Първия ред на входния файл съдържа големината на записаната матрица (N). 
Следващите N реда съдържат по N числа, разделени с интервал.*/
public class Exercise_03 {
	public static final String FILE_INPUT = "C:\\Users\\Asus\\Desktop\\test2.txt";
	public static final String FILE_OUTPUT = "C:\\Users\\Asus\\Desktop\\test3.txt";

	public static void main(String[] args) {

		Scanner fileReader = null;
		PrintStream fileOutput = null;
		int[][] matrix;
		int maxSum = Integer.MIN_VALUE;
		try {
			fileReader = new Scanner(new File(FILE_INPUT));
			System.out.println("File " + FILE_INPUT + " opened.");
			int matrixLength = fileReader.nextInt();
			matrix = new int[matrixLength][matrixLength];

			for (int i = 0; i < matrixLength; ++i) {
				for (int j = 0; j < matrixLength; ++j) {
					if (fileReader.hasNextInt()) {
						matrix[i][j] = fileReader.nextInt();
					}
				}
			}
			int sum = 0;
			for (int i = 0; i < matrix.length - 1; i++) {
				for (int j = 0; j < matrix[i].length - 1; j++) {
					sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
			}

		} catch (FileNotFoundException fnf) {
			System.out.println("File " + FILE_INPUT + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + FILE_INPUT + " not found.");
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.\n");
		}

		try {
			fileOutput = new PrintStream(FILE_OUTPUT);
			fileOutput.println(maxSum);
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		} finally {
			if (null != fileOutput) {
				fileOutput.close();
			}
		}
	}
}