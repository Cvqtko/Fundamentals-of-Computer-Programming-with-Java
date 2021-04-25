package exercise_03;

/* 3. Реализирайте структурата дек. Това е специфична структура, позволя-ваща елементи да бъдат
добавяни и премахвани от двата й края. Нека освен това, елемент поставен от едната страна да
може да бъде премахнат само от същата. Реализирайте операции за премахване добавяне и изчистване на дека.
При невалидна операция подавайте подходящо изключение.*/
public class DynamicDeque<T> {
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

	public DynamicDeque() {
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

	public void addFirst(T item) {
		Node temp = new Node(item);
		if (head == null) {
			head = temp;
			tail = head;
		} else {
			head.previous = temp;
			temp.next = head;
			head = temp;
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

	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
}
