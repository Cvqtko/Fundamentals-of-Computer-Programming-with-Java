
public class NodeBFS {
	private int row;
	private int col;
	private String path;

	public NodeBFS(int row, int col, String direction) {
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

	public String getPath() {
		return path;
	}

}
