import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете име на фирмата ");
		String companyName = input.nextLine();
		System.out.println("Въведете адрес на фирмата ");
		String companyÀddress = input.nextLine();
		System.out.println("Въведете телефон на фирмата ");
		String companyPhoneNumber = input.nextLine();
		System.out.println("Въведете факс на фирмата ");
		String companyFaxNumber = input.nextLine();
		System.out.println("Въведете уеб сайт на фирмата ");
		String companyWebsite = input.nextLine();
		System.out.println("Въведете мениджър на фирмата ");
		String companyManager = input.nextLine();
		System.out.println("Въведете телефон на фирмата ");
		String companyManagerPhone = input.nextLine();
		input.close();

		System.out.printf("Име на фирмата - %s. Адрес - %s, телефон - %s, факс - %s, уеб сайт - %s.\n", companyName,
				companyÀddress, companyPhoneNumber, companyFaxNumber, companyWebsite);
		System.out.printf("Мениджър  %s ", companyManager);
	}
}
