package exercise_01;

/* 1. Реализирайте структурата двойно свързан динамичен списък – списък, 
чиито елементи имат указател, както към следващия така и към пред-хождащия го елемент.
Реализирайте операциите добавяне, премахване и търсене на елемент, добавяне на елемент на определено място 
(индекс), извличане на елемент по индекс и метод, който връща масив с елементите на списъка.*/
public class DynamicList<T> {
	public class Node {
		T element;
		Node previous;
		Node next;

		Node(T element, Node previous, Node next) {
			this.element = element;
			previous.next = this;
			next.previous = this;
		}

		Node(T element) {
			this.element = element;
			this.next = null;
			this.previous = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public DynamicList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void add(T item) {
		Node temp = new Node(item);
		if (head == null) {
			head = temp;
			tail = head;
		} else {
			tail.next = temp;
			temp.previous = tail;
			tail = temp;
		}
		size++;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Invalid index - " + index);
		} else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current.element;
		}
	}

	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		} else if (index == 0) {
			head = head.next;
			head.previous = null;
			size--;
		} else if (index == size - 1) {
			tail = tail.previous;
			tail.next = null;
			size--;
		} else {
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			Node previous = current.previous;
			Node next = current.next;
			previous.next = current.next;
			next.previous = current.previous;
			size--;
		}
	}

	public int indexOf(Object item) {
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

	public T getElement(int index) {
		Node current = head;
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Invalid index - " + index);
		} else {
			for (int i = 0; i < index; i++) {
				current = head.next;
			}
		}
		return current.element;
	}

	public boolean contains(Object item) {
		int index = indexOf(item);
		boolean found = (index != -1);
		return found;
	}

	public Object[] toArray() {
		Object[] array = new Object[this.size];
		Node current = head;
		for (int i = 0; i < size; i++) {
			array[i] = current;
			current = current.next;
		}
		return array;
	}
}
