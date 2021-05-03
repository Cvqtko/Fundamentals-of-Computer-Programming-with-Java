import java.util.Scanner;
/* 9. Напишете програма, която преобразува дадено число в интервала
[0..999] в текст, съответстващ на българското произношение. Примери:
- 0  "Нула"
- 273  "Двеста седемдесет и три"
- 400  "Четиристотин"
- 501  "Петстотин и едно"
- 711  "Седемстотин и единадесет"*/
public class Exercise_09 {
	public static void main(String[] args) {
		System.out.println("Въведи число от 0 - 999:");
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		int n1 = 0;

		if (n < 0 || n > 999)
			System.out.print("error");

		int count = 0;
		while (count < 3) {
			count++;

			if (n % 100 != 0 && count == 1)
				n1 = n - n % 100;
			if (n % 100 == 0 && count == 1) {
				n1 = n;
				count = 3;
			}
			if (n > 9 && n1 >= 1 && n1 < 10 && count == 3)
				System.out.print("и ");
			if (n1 == 0)
				n1 = 1001;

			switch (n1) {
			case 0:
				System.out.print("Нула ");
				break;
			case 1:
				System.out.print("едно ");
				break;
			case 2:
				System.out.print("две ");
				break;
			case 3:
				System.out.print("три ");
				break;
			case 4:
				System.out.print("четири ");
				break;
			case 5:
				System.out.print("пет ");
				break;
			case 6:
				System.out.print("шест ");
				break;
			case 7:
				System.out.print("седем ");
				break;
			case 8:
				System.out.print("осем ");
				break;
			case 9:
				System.out.print("девет ");
				break;
			case 10:
				System.out.print("десет ");
				break;
			case 11:
				System.out.print("единадесет ");
				break;
			case 12:
				System.out.print("дванадесет ");
				break;
			case 13:
				System.out.print("тринадесет ");
				break;
			case 14:
				System.out.print("четиринадесет ");
				break;
			case 15:
				System.out.print("петнадесет ");
				break;
			case 16:
				System.out.print("шестнадесет ");
				break;
			case 17:
				System.out.print("седемнадесет ");
				break;
			case 18:
				System.out.print("осемнадесет ");
				break;
			case 19:
				System.out.print("деветнадесет ");
				break;
			case 20:
				System.out.print("двадесет ");
				break;
			case 30:
				System.out.print("тридесет ");
				break;
			case 40:
				System.out.print("четиридесет ");
				break;
			case 50:
				System.out.print("петдесет ");
				break;
			case 60:
				System.out.print("шестдесет ");
				break;
			case 70:
				System.out.print("седемдесет ");
				break;
			case 80:
				System.out.print("осемдесет ");
				break;
			case 90:
				System.out.print("деветдесет ");
				break;
			case 100:
				System.out.print("Сто ");
				break;
			case 200:
				System.out.print("Двеста ");
				break;
			case 300:
				System.out.print("Триста ");
				break;
			case 400:
				System.out.print("Четиристотин ");
				break;
			case 500:
				System.out.print("Петстотин ");
				break;
			case 600:
				System.out.print("Шестотин ");
				break;
			case 700:
				System.out.print("Седемстотин ");
				break;
			case 800:
				System.out.print("Осемстотин ");
				break;
			case 900:
				System.out.print("Деветстотин ");
				break;
			default:
				System.out.print("");
				break;
			}

			if (count == 1)
				n1 = n % 100 - n % 10;
			if (count == 2)
				n1 = n % 10;
		}
	}
}
