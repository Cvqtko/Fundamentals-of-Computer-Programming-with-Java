package print_tree;

import print_tree.Tree.TreeNode;

public class Example {
	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>(7,
				new Tree<Integer>(19, new Tree<Integer>(1), new Tree<Integer>(12), new Tree<Integer>(31)),
				new Tree<Integer>(21), new Tree<Integer>(14, new Tree<Integer>(23), new Tree<Integer>(6)));
		// Traverse and print the tree using Depth-First-Search

		printDFS(tree.getRoot(), new String());
	}

	private static void printDFS(TreeNode<Integer> root, String spaces) {
		if (root == null) {
			return;
		}
		System.out.println(spaces + root.getValue());
		TreeNode<Integer> child = null;
		for (int i = 0; i < root.getChildrenCount(); i++) {
			child = root.getChild(i);
			printDFS(child, spaces + " ");
		}

	}

}
