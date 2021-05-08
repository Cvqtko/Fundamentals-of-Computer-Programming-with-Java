package exercise_04;



import java.util.Arrays;

public class StaticQueue<T> {
	private T[] arr;
	private int count;
	private static final int INITIAL_CAPACITY = 2;

	public StaticQueue() {
		arr = (T[]) new Object[INITIAL_CAPACITY];
		count = 0;
	}

	public int getLength() {
		return count;
	}

	public void add(T item) {
		T[] extendedArr = arr;
		if (count + 1 == arr.length) {
			extendedArr = (T[]) new Object[arr.length * 2];
			System.arraycopy(arr, 0, extendedArr, 0, arr.length - 1);
			extendedArr[arr.length - 1] = item;
			arr = (T[]) extendedArr;
		} else {
			arr[count] = item;
		}
		count++;

	}

	public void addFirst(T item) {
		T[] extendedArr = arr;
		if (count + 1 == arr.length) {
			extendedArr = (T[]) new Object[arr.length * 2];
			System.arraycopy(arr, 0, extendedArr, 1, arr.length - 1);
			extendedArr[0] = item;
			arr = (T[]) extendedArr;
		} else {
			System.arraycopy(arr, 0, extendedArr, 1, arr.length - 1);
			extendedArr[0] = item;
			arr = (T[]) extendedArr;
		}

		count++;

	}

	public boolean contains(Object item) {
		int index = indexOf(item);
		boolean found = (index != -1);
		return found;
	}

	public int indexOf(Object item) {
		if (item == null) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null)
					return i;
			}
		} else {
			for (int i = 0; i < arr.length; i++)
				if (item.equals(arr[i]))
					return i;
		}
		return -1;
	}

	public void clear() {
		arr = (T[]) new Object[0];
		count = 0;
	}

	// Retrieves, but does not remove, the first element of this deque.
	public T getFirst() {
		return arr[0];
	}

	// Retrieves, but does not remove, the last element of this deque.
	public T getLast() {

		return arr[count - 1];
	}

	// Retrieves and removes the first element of this deque, or returns null if
	// this deque is empty.
	public T pollFirst() {
		T element;
		if (count == 0) {
			return null;
		} else {
			T[] extendedArr = (T[]) new Object[arr.length];
			System.arraycopy(arr, 1, extendedArr, 0, arr.length - 2);
			element = arr[0];
			extendedArr[count - 1] = null;
			arr = extendedArr;
			count--;
			return element;
		}
	}

	// Retrieves and removes the last element of this deque, or returns null if this
	// deque is empty.
	public T pollLast() {
		T element;
		if (count == 0) {
			return null;
		} else {
			element = arr[count - 1];
			arr[count - 1] = null;
			count--;
			return element;
		}
	}

	@Override
	public String toString() {
		return "StaticQueue [arr=" + Arrays.toString(arr) + "]";
	}

}
