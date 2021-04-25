package exercise_05;

/* 5. Реализирайте сортиране на числа в динамичен свързан списък, без да използвате допълнителен масив.*/
public class DynamicList {
	private class Node {
		Double element;
		Node next;

		Node(Double element, Node prevNode) {
			this.element = element;
			prevNode.next = this;
		}

		Node(Double element) {
			this.element = element;
			next = null;
		}
	}

	private Node head;
	private Node tail;
	private int count;

	public DynamicList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	/**
	 * Add element at the end of the list
	 * 
	 * @param item
	 *            - the element you want to add
	 */
	public void add(Double item) {
		if (head == null) {
			// We have empty list
			head = new Node(item);
			tail = head;
		} else {
			// We have non-empty list
			Node newNode = new Node(item, tail);
			tail = newNode;
		}
		count++;
	}

	public Object remove(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		// Find the element at the specified index
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentIndex < index) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		// Remove the element
		count--;
		if (count == 0) {
			head = null;
			tail = null;
		} else if (prevNode == null) {
			head = currentNode.next;
		} else {
			prevNode.next = currentNode.next;
		}
		return currentNode.element;
	}

	public int remove(Double item) {
		// Find the element containing searched item
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			if ((currentNode.element != null && currentNode.element.equals(item))
					|| (currentNode.element == null) && (item == null)) {
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode != null) {
			// Element is found in the list. Remove it
			count--;
			if (count == 0) {
				head = null;
				tail = null;
			} else if (prevNode == null) {
				head = currentNode.next;
			} else {
				prevNode.next = currentNode.next;
			}
			return currentIndex;
		} else {
			// Element is not found in the list
			return -1;
		}

	}

	public int indexOf(Double item) {
		int index = 0;
		Node current = head;
		while (current != null) {
			if ((current.element != null && current.element.equals(item))
					|| (current.element == null) && (item == null)) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	/**
	 * Check if the specified element exist in the list
	 * 
	 * @param item
	 *            - the item you are searching for
	 * @return true if the element exist or false otherwise
	 */
	public boolean contains(Double item) {
		int index = indexOf(item);
		boolean found = (index != -1);
		return found;
	}

	public Object elementAt(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		Node currentNode = this.head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.element;
	}

	/**
	 * @return the actual list length
	 */
	public int getLength() {
		return count;
	}

	public void sort() {
		boolean swapped = false;
		Node current = this.head;
		for (int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (current.element > current.next.element) {
					Double element = current.element;
					current.element = current.next.element;
					current.next.element = element;
					swapped = true;
				}
				current = current.next;

			}
			if (!swapped) {
				break;
			}
			current = this.head;

		}
	}

	public StringBuilder getString() {
		StringBuilder toStr = new StringBuilder("");
		Node current = this.head;
		for (int i = 0; i < count; i++) {
			toStr.append(current.element + " ");
			current = current.next;
		}
		return toStr;
	}
}
