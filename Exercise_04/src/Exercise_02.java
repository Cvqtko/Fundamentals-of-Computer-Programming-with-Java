import java.util.Scanner;
// 2. Напишете програма, която чете от конзолата радиуса "r" на кръг и отпечатва неговия периметър и обиколка.
public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете радиуса \"r\" на кръг: ");
		double r = input.nextDouble();
		double pi = Math.PI;
		input.close();
		System.out.printf("Лицето на кръга е %f. Обиколката на кръга е %f.",pi*Math.pow(r, 2), 2*pi*r);
		
	}
}
