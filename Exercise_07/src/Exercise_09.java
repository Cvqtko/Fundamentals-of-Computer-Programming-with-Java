import java.util.Arrays;
import java.util.Scanner;

/* Да се напише програма, която намира последователност от числа в масив, 
които имат сума равна на число, въведено от конзолата (ако има такава).
Пример: {4, 3, 1, 4, 2, 5, 8}, S=11  {4, 2, 5}.*/

public class Exercise_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter searched sum S= ");
		int searchedSum = input.nextInt();
		input.close();
		int sum = 0;
		int[] array = { 4, 3, 1, 4, 2, 5, 8 };
		boolean sumFound = false;
		for (int i = 0; i < array.length - 1; i++) {
			sum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				sum += array[j];
				if (sum == searchedSum) {
					sumFound = true;
					System.out.print(Arrays.toString(array) + ", S = " + searchedSum + " -> {");
					for (int k = i; k <= j; k++) {
						if (k != j)
							System.out.print(array[k] + ", ");
						else
							System.out.print(array[k]);
					}
					System.out.println("}");
					break;
				}

			}
		}
		if (!sumFound) {
			System.out.println("The searched sum was not found.");
		}
	}
}
