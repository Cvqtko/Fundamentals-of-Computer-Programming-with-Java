package exercise_01;

public class Test {
	public static void main(String[] args) {
		DynamicList<Integer> list = new DynamicList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.get(1));

		list.delete(1);
		
		System.out.println(list.get(1));
	}
}
