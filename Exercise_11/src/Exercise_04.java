import com.exercise_04.Cat;
import com.exercise_04.Sequence;

/* 4. �������� ��������, ����� ������� 10 ������ �� ��� Cat, ���� �� ����� �� ���� CatN,
������ N e �������� ������� ����� �� ������, � ������ ������� ������ sayMiau() �� ����� �� ���.
�� ������������ ����������� ���� ����������� ����� chapter10.*/
public class Exercise_04 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Cat cat = new Cat();
			cat.setName("Cat" + Sequence.nextValue());
			cat.sayMiau();
		}
	}
}
