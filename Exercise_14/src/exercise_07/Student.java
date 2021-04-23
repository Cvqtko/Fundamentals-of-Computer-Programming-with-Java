package exercise_07;

/* 7. Добавете статичен метод в класа StudentTest, който създава няколко обекта от тип Student
и ги съхранява в статични полета. Създайте статично свойство на класа, което да ги достъпва.
Напишете тестова програма, която да извежда информацията за тях в конзолата.*/
public class Student {

	private String firstName;
	private String middleName;
	private String lastName;
	private int yearAtUnivercity;
	private Speciality speciality;
	private Univercity univercity;
	private String email;
	private String telNumber;
	private static int numberOfStudentsCreated = 0;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearAtUnivercity() {
		return yearAtUnivercity;
	}

	public void setYearAtUnivercity(int yearAtUnivercity) {
		this.yearAtUnivercity = yearAtUnivercity;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public Univercity getUnivercity() {
		return univercity;
	}

	public void setUnivercity(Univercity univercity) {
		this.univercity = univercity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public static int getNumberOfStudentsCreated() {
		return numberOfStudentsCreated;
	}

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
