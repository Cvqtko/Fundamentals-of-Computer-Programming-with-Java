package exercise_04;

public class Test {

	public static void main(String[] args) {
		StaticQueue<Integer> queue = new StaticQueue<>();
		queue.addFirst(3);
		queue.addFirst(4);
		queue.add(1);
		queue.add(2);
		queue.addFirst(5);
		queue.add(8);

		System.out.println(queue.toString());

		System.out.println(queue.pollFirst());
		System.out.println(queue.toString());

		System.out.println(queue.pollLast());
		System.out.println(queue.toString());
	}

}
