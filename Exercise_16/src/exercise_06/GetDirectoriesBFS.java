package exercise_06;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class GetDirectoriesBFS {
	public static Queue<File> queue = new LinkedList<File>();

	public static void main(String[] args) {
		String directory = "D:\\CV-ta";

		queue.add(new File(directory));
		while (!queue.isEmpty()) {
			File file = queue.poll();
			System.out.println(file.getPath());
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; files != null && i < files.length; i++) {
					queue.add(files[i]);
				}
			}
		}
	}

}