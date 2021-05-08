package exercise_05;

public class Test {
	public static void main(String[] args) {
		DynamicList list = new DynamicList();
		list.add((double) 5);
		list.add((double) 4);
		list.add((double) 1);
		list.add((double) 2);
		list.add((double) 3);
		list.add((double) 8);
		list.add((double) 1);

		list.sort();
		System.out.println(list.getString());
	}
}
