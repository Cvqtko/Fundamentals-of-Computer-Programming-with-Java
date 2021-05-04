import com.charpter10.Cat;
import com.charpter10.Sequence;

public class Exercise_04 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Cat cat = new Cat();
			cat.setName("Cat" + Sequence.nextValue());
			cat.sayMiau();
		}
	}
}
