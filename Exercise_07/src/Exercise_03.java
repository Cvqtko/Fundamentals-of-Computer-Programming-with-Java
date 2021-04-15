
public class Exercise_03 {
	public static void main(String[] args) {
		char[] array1 = { 'a', 'b', 'c', 'd', 'e', 'f' };
		char[] array2 = { 'a', 'b', 'c', 'd', 'f' };
		int lenght = array1.length < array2.length ? array1.length : array2.length;

		for (int i = 0; i < lenght; i++) {
			if (array1[i] < array2[i]) {
				System.out.println("Array 1 is earlyer in the lexical order");
				break;
			} else if (array1[i] > array2[i]) {
				System.out.println("Array 2 is earlyer in the lexical order");
				break;
			} else if (i == lenght - 1) {
				if (array1.length < array2.length) {
					System.out.println("Array 1 is earlyer in the lexical order");
				} else if (array1.length > array2.length) {
					System.out.println("Array 2 is earlyer in the lexical order");
				} else {
					System.out.println("The two arrays are equal in the lexical order");
				}
			}
		}
	}
}
