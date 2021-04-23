package exercise_02;

/* 2. Декларирайте няколко конструктора за класа Student, които имат различни списъци с параметри 
(за цялостната информация за даден студент или част от нея). Данните, за които няма входна информация
да се инициализират съответно с null или 0.*/
public class Student {
	private String firstName;
	private String middleName;
	private String lastName;
	private int yearAtUnivercity;
	private Speciality speciality;
	private Univercity univercity;
	private String email;
	private String telNumber;

	public Student(String firstName, String middleName, String lastName, int yearAtUnivercity, Speciality speciality,
			Univercity univercity) {
		this(firstName, middleName, lastName, yearAtUnivercity, speciality, univercity, "", "");

	}

	public Student(String firstName, String middleName, String lastName, int yearAtUnivercity, Speciality speciality,
			Univercity univercity, String email, String telNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.yearAtUnivercity = yearAtUnivercity;
		this.speciality = speciality;
		this.email = email;
		this.telNumber = telNumber;
		this.univercity = univercity;
	}

}

enum Univercity {
	UNIVERCITY_OF_SOFIA, TECHNICAL_UNIVERCITY_SOFIA
}

enum Speciality {
	COMPUTER_AND_SOFTWARE_ENGINEERING, MECHANICS, ELECTRONIX
}
