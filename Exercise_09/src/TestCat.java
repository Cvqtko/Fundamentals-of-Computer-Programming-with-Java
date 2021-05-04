
class TestCat {
	public int numberParam = 3;
	public int[] arr;
	public String word;

	public TestCat() {
		this.numberParam = 3;
		int[] initialArr = { 1, 2, 3 };
		this.arr = initialArr;
		this.word = "initial String Cat";

	}

	public TestCat(int numberParam, int[] arr, String word) {
		this.numberParam = numberParam;
		this.arr = arr;
		this.word = word;
	}

}