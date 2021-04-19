
public class Exercise_05 {
	public static void main(String[] args) {
		int[] array = { 1, 3, 3, 2, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3 };
		compareNumber(2,array);
	}

	static void compareNumber(int pos, int[] arr) {
    
        if (pos == 0)
        {
            if (arr[0] < arr[1]) System.out.printf("%d is smaller than it's right.", arr[0]);
            else if (arr[0] > arr[1]) System.out.printf("%d is bigger than it's right.", arr[0]);
            else System.out.printf("%d is equal to it's right.", arr[0]);
        }
        else if (pos == arr.length - 1)
        {
            if (arr[arr.length - 1] < arr[arr.length - 2]) System.out.printf("%d is smaller than it's left.", arr[pos]);
            else if (arr[arr.length - 1] > arr[arr.length - 2]) System.out.printf("%d is bigger than it's left.", arr[pos]);
            else System.out.printf("%d is equal to it's left.", arr[pos]);
        }
        else
        {
            if (arr[pos] < arr[pos - 1])
            {
                if (arr[pos] < arr[pos + 1]) System.out.printf("%d is smaller than it's neighbours.", arr[pos]);
                else if (arr[pos] == arr[pos + 1]) System.out.printf("%d is smaller than it's left and equal to it's right.", arr[pos]);
                else System.out.printf("%d is smaller than it's left and bigger than it's right.", arr[pos]);
            }
            else if (arr[pos] == arr[pos - 1])
            {
                if (arr[pos] < arr[pos + 1]) System.out.printf("%d is euqal to it's left and smaller than it's right.", arr[pos]);
                else if (arr[pos] == arr[pos + 1]) System.out.printf("%d is equal to it's neighbours.", arr[pos]);
                else System.out.printf("%d is equal to it's left and bigger than it's right.", arr[pos]);
            }
            else
            {
                if (arr[pos] < arr[pos + 1]) System.out.printf("%d is bigger than it's left and smaller than it's right.", arr[pos]);
                else if (arr[pos] == arr[pos + 1]) System.out.printf("%d is bigger than it's left and equal to it's right.", arr[pos]);
                else System.out.printf("%d is bigger than it's neighbours.", arr[pos]);
            }
        }
	}
}
