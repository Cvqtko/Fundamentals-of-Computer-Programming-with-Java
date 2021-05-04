import java.util.Arrays;

public class TestCatVariables {

	public static void main(String[] args) {
		
		TestCat cat = new TestCat();
		
		System.out.println("initial values of cat are\nnumberParam is: " + cat.numberParam
				+ "\narray is: " + Arrays.toString(cat.arr) + "\nword is: " + cat.word);
		
		changeInitialValue(cat); 
		
		System.out.println("\nin the main() method after changeInitialValue() method\nnnumberParam is: " + cat.numberParam + "\narray is: " + Arrays.toString(cat.arr)
				+ "\nword is: " + cat.word);
	}

	public static void changeInitialValue(TestCat cat) {
		// Modifying the primitive-type parameter
		cat.numberParam = 5;
		cat.arr[0] = 4;
		cat.word = "changed initial String";
		System.out.println("\nin changeInitialValue() method, after the modification\nnumberParam is: "
				+ cat.numberParam + "\narray is: " + Arrays.toString(cat.arr) + "\nword is: " + cat.word);
	}

}
