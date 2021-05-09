import java.io.File;

public class DirectoryTraverserDFS {
	private static void traverseDir(File dir, String spaces) {
		// If the current element is a directory,
		// we get all it subdirectories and files
		if (dir.isDirectory()) {
			System.out.println(spaces + dir.getAbsolutePath());
			String[] children = dir.list();
			// For each child go and visit its subtree
			for (String child : children) {
				traverseDir(new File(dir, child), spaces + " ");
			}
		}
	}

	public static void traverseDir(String directoryPath) {
		traverseDir(new File(directoryPath), new String());
	}

	public static void main(String[] args) {
		traverseDir("D:\\");
	}
}
