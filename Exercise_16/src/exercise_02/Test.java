package exercise_02;

public class Test {

	public static void main(String[] args) {
		DynamicStack<Integer> stack = new DynamicStack<>();

		stack.push(40);
		stack.push(50);
		stack.push(60);

		System.out.println(stack.pop());
		System.out.println(stack.peak());
		System.out.println(stack.pop());
	}
}
