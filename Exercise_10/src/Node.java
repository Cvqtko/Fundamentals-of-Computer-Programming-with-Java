
public class Node {
	private int row;
	private int col;
	private StringBuilder path;

	public Node(int row, int col, StringBuilder direction) {
		this.row = row;
		this.col = col;
		this.path = direction;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public StringBuilder getPath() {
		return path;
	}

}
