// 3. Напишете израз, който да проверява дали дадено цяло число съдържа 7 за трета цифра (отдясно на ляво).
public class Exercise_03 {
	public static void main(String[] args) {
		int number = 12765;

		System.out.println(number/100 % 10 == 7 ? "Число съдържа 7 за трета цифра" : "Число не съдържа 7 за трета цифра");
	}
}
