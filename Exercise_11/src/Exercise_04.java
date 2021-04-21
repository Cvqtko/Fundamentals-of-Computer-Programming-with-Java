import com.exercise_04.Cat;
import com.exercise_04.Sequence;

/* 4. Напишете програма, която създава 10 обекта от тип Cat, дава им имена от вида CatN,
където N e уникален пореден номер на обекта, и накрая извиква метода sayMiau() на всеки от тях.
За реализацията използвайте вече дефинирания пакет chapter10.*/
public class Exercise_04 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Cat cat = new Cat();
			cat.setName("Cat" + Sequence.nextValue());
			cat.sayMiau();
		}
	}
}
