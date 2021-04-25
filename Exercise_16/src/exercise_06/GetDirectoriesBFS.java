package exercise_06;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/* 6. Използвайки опашка реализирайте пълно обхождане на всички дирек-тории на твърдия ви диск 
и ги отпечатвайте на конзолата. Реализирайте алгоритъма "обхождане в ширина" – Breadth-First-Search (BFS) –
може да намерите стотици статии за него в Интернет.*/
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