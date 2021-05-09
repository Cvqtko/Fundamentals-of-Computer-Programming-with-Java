package exercise_01;

import exercise_01.Tree.TreeNode;

public class Exercise_01 {
	private static int occurencesCount = 0;

	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>(7,
				new Tree<Integer>(19, new Tree<Integer>(1), new Tree<Integer>(14), new Tree<Integer>(31)),
				new Tree<Integer>(19), new Tree<Integer>(14, new Tree<Integer>(23), new Tree<Integer>(19)));


		int searchedNumber = 14;
		getOccurrences(tree.getRoot(), searchedNumber);

		System.out.printf("The number %d occures %d times in the tree", searchedNumber, occurencesCount);
	}

	private static void getOccurrences(TreeNode<Integer> root, int searchedNumber) {

		if (root == null) {
			return;
		}
		if (root.getValue() == searchedNumber) {
			occurencesCount++;
		}
		TreeNode<Integer> child = null;
		for (int i = 0; i < root.getChildrenCount(); i++) {
			child = root.getChild(i);
			getOccurrences(child, searchedNumber);
		}

	}

}
