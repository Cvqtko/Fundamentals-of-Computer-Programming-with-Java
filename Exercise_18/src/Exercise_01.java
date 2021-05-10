import java.util.HashMap;

public class Exercise_01 {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2, 6, 6, 6 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
