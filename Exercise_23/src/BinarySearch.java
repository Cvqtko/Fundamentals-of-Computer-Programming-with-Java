
public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 0, 1, 1, 2, 5, 8, 9, 10, 12, 14, 15, 18, 19 };
		System.out.println(binarySearch(array, 19));
	}

	public static int binarySearch(int[] array,int searchedElement) {
		int start = 0;
		int end = array.length-1;
		
		while(start<=end) {
			int middle = (start+end)/2;
			if(array[middle] == searchedElement) {
				return middle;
			}else if(array[middle]<searchedElement){
				start = middle+1;
			}else {
				end = middle-1;
			}
		}
		return -1;
	}
}
