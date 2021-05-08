import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Exercise_05 {
	public static final String FILE_WORDS_TO_SEARCH = "C:\\Users\\Asus\\Desktop\\words.txt";
	public static final String FILE_INPUT = "C:\\Users\\Asus\\Desktop\\text.txt";
	public static final String FILE_OUTPUT = "C:\\Users\\Asus\\Desktop\\result.txt";

	public static void main(String[] args) {

		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable = getSearchedWords(FILE_WORDS_TO_SEARCH);
		hashtable = countSearchedWords(FILE_INPUT, hashtable);
		PrintStream fileOutput = null;
		Set<String> keys = hashtable.keySet();
		ArrayList<Map.Entry<?, Integer>> list = sortValue(hashtable);
		writeToFile(list);
	}

	public static void writeToFile(ArrayList<Map.Entry<?, Integer>> list) {
		PrintStream fileOutput = null;
		try {
			fileOutput = new PrintStream(FILE_OUTPUT);
			for (int i = 0; i < list.size(); i++) {
				fileOutput.println(list.get(i));
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		} finally {
			if (null != fileOutput) {
				fileOutput.close();
			}
		}

	}

	public static ArrayList<Map.Entry<?, Integer>> sortValue(Hashtable<?, Integer> t) {

		// Transfer as List and sort it
		ArrayList<Map.Entry<?, Integer>> sortedList = new ArrayList(t.entrySet());
		Collections.sort(sortedList, new Comparator<Map.Entry<?, Integer>>() {

			public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		return sortedList;
	}

	public static Hashtable<String, Integer> countSearchedWords(String fileName, Hashtable<String, Integer> hashtable) {
		Scanner fileReader = null;
		String word;
		String[] words;
		try {
			fileReader = new Scanner(new File(fileName));
			System.out.println("File " + fileName + " opened.");
			while (fileReader.hasNextLine()) {
				word = fileReader.nextLine();
				words = word.split("[ ]");
				for (int i = 0; i < words.length; i++) {
					if (hashtable.containsKey(words[i])) {
						hashtable.put(words[i], hashtable.get(words[i]) + 1);
					}
				}
			}

		} catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + fileName + " not found.");
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.\n");
		}
		return hashtable;
	}

	public static Hashtable<String, Integer> getSearchedWords(String fileName) {
		Scanner fileReader = null;
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		String word;
		try {
			fileReader = new Scanner(new File(fileName));
			System.out.println("File " + fileName + " opened.");
			while (fileReader.hasNextLine()) {
				word = fileReader.nextLine();
				hashtable.put(word, 0);
			}

		} catch (FileNotFoundException fnf) {
			System.out.println("File " + fileName + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + fileName + " not found.");
		} finally {
			// Close the scanner in the finally block
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.\n");
		}
		return hashtable;
	}
}
