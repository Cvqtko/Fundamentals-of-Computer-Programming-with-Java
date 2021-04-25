package exercise_07;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/* 7. Използвайки опашка реализирайте пълно обхождане на всички дирек-тории на твърдия ви диск и 
ги отпечатвайте на конзолата. Реализирайте алгоритъма "обхождане в дълбочина" – Depth-First-Search (DFS) –
може да намерите стотици статии за него в Интернет.*/
public class GetDirectoriesDFS {
	public static Queue<File> queue = new LinkedList<File>();

	public static void main(String[] args) {
		String directory = "D:\\CV-ta";
		getDirectories(new File(directory));
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
	}

	public static void getDirectories(File file) {

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++) {
				getDirectories(files[i]); // Recursive call

			}
		} else { // Base case
			queue.add(file);
		}
	}
}
