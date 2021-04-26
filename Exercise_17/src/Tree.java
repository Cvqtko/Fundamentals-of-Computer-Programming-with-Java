import java.util.ArrayList;

public class Tree<T> {

	public static class TreeNode<T> {

		private T value;
		private boolean hasParent;
		private ArrayList<TreeNode<T>> children;

		public TreeNode(T value) {
			if (value == null) {
				throw new IllegalArgumentException("Cannot insert null value!");
			}
			this.value = value;
			this.children = new ArrayList<>();
		}

		public T getValue() {
			return this.value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public void addChildren(TreeNode<T> child) {
			if (child == null) {
				throw new IllegalArgumentException("Cannot insert null value!");
			}
			if (child.hasParent) {
				throw new IllegalArgumentException("The node already has a parent");
			}
			child.hasParent = true;
			this.children.add(child);
		}

		public TreeNode<T> getChild(int index) {
			return this.children.get(index);
		}

		public int getChildrenCount() {
			return this.children.size();
		}

	}

	private TreeNode<T> root;

	public Tree(T value) {
		if (value == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		this.root = new TreeNode<T>(value);
	}

	public Tree(T value, Tree<T>... children) {
		this(value);
		for (Tree<T> child : children) {
			this.root.addChildren(child.root);
		}
	}

	public TreeNode<T> getRoot() {
		return this.root;
	}

	/**
	 * @return the child nodes of the tree.
	 */
	public ArrayList<TreeNode<T>> getChildNodes() {
		if (this.root != null) {
			return this.root.children;
		}
		return new ArrayList<TreeNode<T>>();
	}

	/**
	 * Traverses and prints tree in Depth First Search (DFS) manner.
	 * 
	 * @param root
	 *            - the root of the tree to be traversed.
	 * @param spaces
	 *            - the spaces used for representation of the parent-child relation.
	 */
	private void printDFS(TreeNode<T> root, String spaces) {
		if (this.root == null) {
			return;
		}
		System.out.println(spaces + root.getValue());
		TreeNode<T> child = null;
		for (int i = 0; i < root.getChildrenCount(); i++) {
			child = root.getChild(i);
			printDFS(child, spaces + " ");
		}
	}

	public void printDFS() {
		this.printDFS(this.root, new String());
	}
}
