/* 3. Дефинирайте свой собствен пакет chapter10 и поставете в него двата класа Cat и Sequence,
които използвахме в примерите на текущата тема. Направете още един собствен пакет с име chapter10.examples
и в него направете клас, който извиква класовете Cat и Sequence.*/

import com.exercise_04.Cat;
import com.exercise_04.Sequence;

public class Exercise_03 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sayMiau();
		Sequence.nextValue();
	}
}
