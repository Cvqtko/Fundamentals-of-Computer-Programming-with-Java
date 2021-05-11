package exam;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		while (!line.equals("")) {

			line = removeAllTags(line);
			line = removeNewLinesWithWhiteSpace(line);
			line = trimNewLines(line);
			if (!line.trim().equals("")) {
				System.out.println(line.trim());
			}
			line = scanner.nextLine();
		}

	}

	private static String removeAllTags(String str) {
		String strWithoutTags = str.replaceAll("<[^>]*>", "\n");
		return strWithoutTags;
	}

	private static String removeNewLinesWithWhiteSpace(String str) {
		String result = str;
		while (result.indexOf("\n\n") != -1) {
			result = result.replaceAll("\n\n", "\n");
		}
		result = result.replaceAll("\n\\s+", "\n");
		return result;
	}

	private static String trimNewLines(String str) {
		int start = 0;
		while (start < str.length() && str.charAt(start) == '\n') {
			start++;
		}
		int end = str.length() - 1;
		while (end >= 0 && str.charAt(end) == '\n') {
			end--;
		}
		if (start > end) {
			return "";
		}
		String trimmed = str.substring(start, end + 1);
		return trimmed;
	}
}
