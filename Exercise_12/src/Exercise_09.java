import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise_09 {
	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\Asus\\Desktop\\test.dat";
		String fileLocationCopy = "C:\\Users\\Asus\\Desktop\\test1.dat";
		copyFile(fileLocationCopy, readBinaryFile(fileLocation));
	}

	public static void copyFile(String fileLocation, byte[] data) {
		File file = new File(fileLocation);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			fis.read(data, 0, data.length);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + file + "'");
		} catch (IOException e) {
			System.out.println("Error wriitng file '" + file + "'");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("Unable to close file stream '" + file + "'");
			}
		}

	}

	public static byte[] readBinaryFile(String fileLocation) {
		// The name of the file to open.

		File file = new File(fileLocation);
		byte[] buffer = new byte[(int) file.length()];
		try {
			// Use this for reading the data.

			FileInputStream inputStream = new FileInputStream(file);

			int total = 0;
			int nRead = 0;
			while ((nRead = inputStream.read(buffer)) != -1) {

				total += nRead;
			}
			inputStream.close();
			System.out.println("Read " + total + " bytes");
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + file + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + file + "'");

		}
		return buffer;
	}
}
