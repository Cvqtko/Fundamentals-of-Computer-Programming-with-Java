import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
/* 9. Реализирайте BFS алгоритъма за търсене на най-кратък път в лабиринт.*/
public class Exercise_09 {
	private static char[][] labirint = { 
			{ ' ', ' ', ' ', '*', ' ', ' ', ' ' },
			{ '*', '*', ' ', '*', ' ', '*', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ ' ', '*', '*', '*', '*', '*', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', 'е' }, };
	private static List<Node> nextToVisti = new LinkedList<>();
	private static HashSet<String> visited = new HashSet<>();

	public static void main(String[] args) {
		findPathBFS(0, 0, new StringBuilder("S"));
	}

	private static void findPathBFS(int row, int col, StringBuilder direction) {

		nextToVisti.add(new Node(row, col, direction));

		while (!nextToVisti.isEmpty()) {
			Node node = nextToVisti.remove(0);

			if (visited.contains(node.getRow() + " " + node.getCol())) {
				continue;
			}

			StringBuilder currentPath = node.getPath();
			int currentRow = node.getRow();
			int currentCow = node.getCol();

			if ((currentRow < 0) || (currentCow < 0) || (currentCow >= labirint[0].length)
					|| (currentRow >= labirint.length)) {
				continue;
			}

			if (labirint[currentRow][currentCow] == 'е') {
				System.out.print("Found path to the exit: " + currentPath);
			}

			visited.add(currentRow + " " + currentCow);
			if(labirint[currentRow][currentCow] == ' ') {
				nextToVisti.add(new Node(currentRow, currentCow - 1, new StringBuilder(currentPath + "L"))); // left
				nextToVisti.add(new Node(currentRow - 1, currentCow, new StringBuilder(currentPath + "U"))); // up
				nextToVisti.add(new Node(currentRow, currentCow + 1, new StringBuilder(currentPath + "R"))); // right
				nextToVisti.add(new Node(currentRow + 1, currentCow, new StringBuilder(currentPath + "D"))); // down
			}
		}
	}

}