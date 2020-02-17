import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Exercise_17a extends Application {

	static boolean[][] visited = new boolean[10][10];
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int newX;
	static int newY;
	static private double sceneWidth = 1000;
	static private double sceneHeight = 500;

	static int[][] matrix = { { 1, 3, 2, 2, 2, 4, 5, 6, 7 }, { 3, 3, 3, 2, 4, 4, 5, 6, 7 },
			{ 4, 3, 1, 2, 3, 3, 3, 3, 3 }, { 4, 3, 1, 3, 3, 1, 5, 6, 7 }, { 4, 3, 3, 3, 1, 1, 5, 6, 7 } };

	static private int n = matrix.length;
	static private int m = matrix[0].length;

	static double gridHeight = sceneHeight / n;
	static double gridWidth = sceneWidth / m;

	MyNode[][] playfield = new MyNode[n][m];

	static Group root = new Group();

	@Override
	public void start(Stage primaryStage) {

		// initialize playfield
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// create node
				MyNode node = new MyNode(Integer.toString(matrix[i][j]), j * gridWidth, i * gridHeight, gridWidth,
						gridHeight, Color.WHITE);

				// add node to group
				root.getChildren().add(node);

			}
		}

		Point point = findPath(matrix);
		System.out.println("Path starting point: [" + point.x + "][" + point.y + "]");
		path(matrix, point.x, point.y, matrix[point.x][point.y]);

		Scene scene = new Scene(root, sceneWidth, sceneHeight);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	public static class MyNode extends StackPane {

		public MyNode(String name, double x, double y, double width, double height, Color color) {

			// create rectangle
			Rectangle rectangle = new Rectangle(width, height);
			rectangle.setStroke(Color.BLACK);
			rectangle.setFill(color);

			// create label
			Label label = new Label(name);
			label.setFont(Font.font("Verdana", 20));

			// set position
			setTranslateX(x);
			setTranslateY(y);

			getChildren().addAll(rectangle, label);

		}

	}

	static Point findPath(int[][] matrix) {
		int current = 0;
		int max = 0;
		Point point = new Point();
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[0].length; cols++) {
				if (visited[rows][cols] == false) {
					current = dfs(matrix, rows, cols, matrix[rows][cols]);
				}
				if (current > max) {
					max = current;
					point.x = rows;
					point.y = cols;
				}
			}
		}
		return point;
	}

	static int dfs(int[][] matrix, int x, int y, int value) {

		if (visited[x][y]) {
			return 0;
		} else {
			visited[x][y] = true;
			int best = 0;
			int bestX = x, bestY = y;
			for (int i = 0; i < 4; i++) {

				int modx = dx[i] + x;
				int mody = dy[i] + y;

				// if we are outside of our matrix
				if (modx == -1 || modx >= matrix.length || mody == -1 || mody >= matrix[0].length) {
					continue;
				}

				// if neighbour value is the same, "DFS" it
				if (matrix[modx][mody] == value) {
					int v = dfs(matrix, modx, mody, value);
					best += v;
				}
				newX = bestX;
				newY = bestY;
			}
			return best + 1;
		}
	}

	static void path(int[][] matrix, int x, int y, int value) {
		MyNode node = new MyNode(Integer.toString(matrix[x][y]), y * gridWidth, x * gridHeight, gridWidth, gridHeight,
				Color.DARKSEAGREEN);
		// add node to group
		root.getChildren().add(node);

		if (!visited[x][y]) {
			return;
		} else {
			visited[x][y] = false;
			for (int i = 0; i < 4; i++) {

				int modx = dx[i] + x;
				int mody = dy[i] + y;

				// if we are outside of our matrix
				if (modx == -1 || modx >= matrix.length || mody == -1 || mody >= matrix[0].length) {
					continue;
				}

				// if neighbour value is the same, "DFS" it
				if (matrix[modx][mody] == value) {
					path(matrix, modx, mody, value);
				}
			}
			return;
		}
	}
}