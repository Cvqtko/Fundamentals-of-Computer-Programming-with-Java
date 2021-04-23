package exercise_04;
/* 4. Добавете метод в класа Student, който извежда пълна информация за студента.*/
public class Student {

	private String firstName;
	private String middleName;
	private String lastName;
	private int yearAtUnivercity;
	private Speciality speciality;
	private Univercity univercity;
	private String email;
	private String telNumber;

	static int numberOfStudentsCreated = 0;

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
		numberOfStudentsCreated++;

	}

	public String getStudentInfo() {
		return "Student [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", yearAtUnivercity=" + yearAtUnivercity + ", speciality=" + speciality + ", univercity=" + univercity
				+ ", email=" + email + ", telNumber=" + telNumber + "]";
	}

}

enum Univercity {
	UNIVERCITY_OF_SOFIA, TECHNICAL_UNIVERCITY_SOFIA
}

enum Speciality {
	COMPUTER_AND_SOFTWARE_ENGINEERING, MECHANICS, ELECTRONIX
}
