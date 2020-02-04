import java.util.Scanner;
/* 3. Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър. Мениджърът има име, фамилия и телефонен номер.
Напишете програма, която чете информацията за компанията и нейния мениджър и я отпечатва след това на конзолата.*/
public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете име на фирмата ");
		String companyName = input.nextLine();
		System.out.println("Въведете адрес на фирмата ");
		String companyАddress = input.nextLine();
		System.out.println("Въведете телефонен номер на фирмата ");
		String companyPhoneNumber = input.nextLine();
		System.out.println("Въведете факс номер на фирмата ");
		String companyFaxNumber = input.nextLine();
		System.out.println("Въведете уеб сайт на фирмата ");
		String companyWebsite = input.nextLine();
		System.out.println("Въведете мениджър на фирмата ");
		String companyManager = input.nextLine();
		System.out.println("Въведете телефонен номер на мениджъра ");
		String companyManagerPhone = input.nextLine();
		input.close();

		System.out.printf("Фирма %s с адрес - %s. Телефон за връзка - %s, факс - %s, уеб сайт - %s.\n", companyName,
				companyАddress, companyPhoneNumber, companyFaxNumber, companyWebsite);
		System.out.printf("Мениджър %s с телефонен номер %s ", companyManager, companyManagerPhone);
	}
}
