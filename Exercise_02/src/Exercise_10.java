// 10. Декларирайте две променливи от тип int. Задайте им стойности съответно 5 и 10. Разменете стойностите им и ги отпечатайте.
public class Exercise_10 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a = a + b;
	    b = a - b;
	    a = a - b;
	    System.out.println(a);
	    System.out.println(b);
	}
}
