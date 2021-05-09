package exercise_02;

import exercise_01.Tree;
import exercise_01.Tree.TreeNode;

public class Exercise_02 {

	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>(7,
				new Tree<Integer>(19, new Tree<Integer>(1), new Tree<Integer>(12), new Tree<Integer>(31)),
				new Tree<Integer>(21), new Tree<Integer>(14, new Tree<Integer>(23), new Tree<Integer>(6)));
		// Traverse and print the tree using Depth-First-Search
		int childCount = 4;

//		getRootFromChildCount(tree.getRoot(), childCount);
	}

//	private static int getRootFromChildCount(TreeNode<Integer> root, int childCount) {
//		if (root == null) {
//			return 0;
//		}
//		int count = 0;
//		TreeNode<Integer> child = null;
//		for (int i = 0; i < root.getChildrenCount(); i++) {
//			child = root.getChild(i);
//			count = getRootFromChildCount(child, childCount);
//			return 1;
//		}
//		if(count == childCount) {
//			System.out.println(root.getValue());
//		}
//	}

//	private static void printDFS(TreeNode<Integer> root, String spaces) {
//		if (root == null) {
//			return;
//		}
//		System.out.println(spaces + root.getValue());
//		TreeNode<Integer> child = null;
//		for (int i = 0; i < root.getChildrenCount(); i++) {
//			child = root.getChild(i);
//			printDFS(child, spaces + " ");
//		}
//
//	}

}
