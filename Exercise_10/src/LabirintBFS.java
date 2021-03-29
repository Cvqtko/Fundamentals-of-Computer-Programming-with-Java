import java.util.LinkedList;
import java.util.Queue;

public class LabirintBFS {
	public static void main(String[] args) {

		queue.add(new NodeBFS(0, 0, "S"));
		if (queue.isEmpty()) {
			System.out.println("No path found!");
		}
		while (!queue.isEmpty()) {
			findPath(queue.poll());
		}

	}
	private static char[][] lab =  {
			{ ' ', ' ', ' ', '*', ' ', ' ', ' ' }, 
			{ '*', '*', ' ', '*', ' ', '*', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, 
			{ ' ', '*', '*', '*', '*', '*', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', 'å' }, };
	private static Queue<NodeBFS> queue = new LinkedList<NodeBFS>();

	private static void findPath(NodeBFS node) {
		int col = node.getCol();
		int row = node.getRow();
		if ((col < 0) || (row < 0) || (col >= lab[0].length) || (row >= lab.length)) {
			// We are out of the labyrinth
			return;
		}
		// Append the direction to the path

		// Check if we have found the exit
		if (lab[row][col] == 'å') {
			System.out.println("Path found!");
			System.out.println(node.getPath().toString());
			printMatrix();
			queue = new LinkedList<NodeBFS>();
		} else if (lab[row][col] == ' ') {
			// The current cell is free. Mark it as visited
			lab[row][col] = 's';
			// Invoke recursion the explore all possible directions
			queue.add(new NodeBFS(row, col - 1, node.getPath() + 'L')); // left
			queue.add(new NodeBFS(row - 1, col, node.getPath() + 'U')); // up
			queue.add(new NodeBFS(row, col + 1, node.getPath() + 'R')); // right
			queue.add(new NodeBFS(row + 1, col, node.getPath() + 'D')); // down

		}

	}

	private static void printMatrix() {
		for (int i = 0; i < lab.length; i++) {
			for (int j = 0; j < lab[0].length; j++) {
				System.out.print(lab[i][j] + " ");
			}
			System.out.println();
		}
	}
}
