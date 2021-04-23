package exercise_07;

public class StudentTest {
	static Student student1;
	static Student student2;

	public StudentTest() {
		createStudent();
	}

	public static Student getStudent1() {
		return student1;
	}

	public static void setStudent1(Student student1) {
		StudentTest.student1 = student1;
	}

	public static Student getStudent2() {
		return student2;
	}

	public static void setStudent2(Student student2) {
		StudentTest.student2 = student2;
	}

	public static void createStudent() {
		student1 = new Student("Georgi", "Kirilov", "Kirilov", 5, Speciality.COMPUTER_AND_SOFTWARE_ENGINEERING,
				Univercity.UNIVERCITY_OF_SOFIA);
		student2 = new Student("Blagoi", "Iordanov", "Georgiev", 5, Speciality.ELECTRONIX,
				Univercity.TECHNICAL_UNIVERCITY_SOFIA, "blago@gmail.com", "0899 99 99 99");
	}

	public static void main(String[] args) {
		 StudentTest st = new StudentTest();
		 System.out.println(st.getStudent1().getStudentInfo());
		 System.out.println(st.getStudent2().getStudentInfo());

	}

}
