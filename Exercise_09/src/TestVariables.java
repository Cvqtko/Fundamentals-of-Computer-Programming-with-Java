import java.util.Arrays;

public class TestVariables {

	public static void main(String[] args) {
		int numberArg = 3;
		int arr[] = { 1, 2, 3 };
		String word = "initial String";
		changeInitialValue(numberArg, arr, word); // Copying the value 3 of the // argument numberArg to the
		// parameter numberParam
		System.out.println("\nin the main() method\nnumberParam is: " + numberArg + "\narray is: "
				+ Arrays.toString(arr) + "\nword is: " + word);
	}

	public static void changeInitialValue(int numberParam, int[] arr, String word) {
		// Modifying the primitive-type parameter
		numberParam = 5;
		arr[0] = 4;
		word = "changed in method";
		System.out.println("in changeInitialValue() method, after the modification\nnumberParam is: " + numberParam
				+ "\narray is: " + Arrays.toString(arr) + "\nword is: " + word);
	}

}
