import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class Exercise_01 {
	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>(7,
				new Tree<Integer>(19, new Tree<Integer>(1), new Tree<Integer>(12), new Tree<Integer>(31)),
				new Tree<Integer>(21),
				new Tree<Integer>(14, new Tree<Integer>(23), new Tree<Integer>(6), new Tree<Integer>(7)));

		Tree.TreeNode<Integer> child = tree.getRoot();
		ArrayList<Tree.TreeNode<Integer>> list = new ArrayList<>();

		int counter = 0;
		while (list.isEmpty()) {
			list.add(child);
		}
	}

}