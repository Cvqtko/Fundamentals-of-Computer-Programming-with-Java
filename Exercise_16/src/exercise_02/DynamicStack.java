package exercise_02;

/* 2. Създайте клас DynamicStack представляващ динамична реализация на стек. Добавете методи за необходимите операции.*/
import java.util.EmptyStackException;

public class DynamicStack<T> {
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

	public DynamicStack() {
		this.head = null;
		this.tail = null;
		this.size = 0;

	}

	public void push(T element) {
		Node node = new Node(element);
		if (head == null) {
			this.head = node;
			this.tail = head;
		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
		}
		size++;
	}

	public T pop() {
		Node node = this.tail;
		if (this.tail == null) {
			throw new EmptyStackException();
		} else {
			this.tail = tail.previous;
		}
		size--;
		return node.element;
	}

	public T peak() {
		Node node = this.tail;
		if (this.tail == null) {
			throw new EmptyStackException();
		}
		return node.element;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public int search(T element) {
		Node current = null;
		int counter = 0;
		if (this.tail.element.equals(element)) {
			return 0;
		} else
			current = this.tail;
		for (int i = size - 1; i > 0; i--) {
			current = current.previous;
			counter++;
			if (current.element.equals(element)) {
				return counter;
			}
		}
		return -1;
	}
}
