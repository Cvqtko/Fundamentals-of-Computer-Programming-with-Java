package exercise_07;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class GetDirectoriesDFS {

	public static void main(String[] args) {
		String directory = "D:\\CV-ta";
		getDirectories(new File(directory));
	}

	public static void getDirectories(File file) {
		// Base case
		if (!file.isDirectory()) {
			System.out.println(file);
		} else {
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++) {
				// Recursive call
				getDirectories(files[i]);
			}
		}

	}
}
