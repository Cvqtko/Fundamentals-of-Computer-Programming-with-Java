package exercise_06;

public class StudentTest {
	public static void main(String[] args) {
		Student georgi = new Student("Georgi", "Kirilov", "Kirilov", 5, Speciality.COMPUTER_AND_SOFTWARE_ENGINEERING,
				Univercity.UNIVERCITY_OF_SOFIA);
		Student blagoi = new Student("Blagoi", "Iordanov", "Georgiev", 5, Speciality.ELECTRONIX,
				Univercity.TECHNICAL_UNIVERCITY_SOFIA, "blago@gmail.com", "0899 99 99 99");

		System.out.println(georgi.getStudentInfo());
		System.out.println(blagoi.getStudentInfo());

		blagoi.setEmail("blagoi@yahoo.com");
		System.out.println(blagoi.getStudentInfo());

		System.out.println(Student.getNumberOfStudentsCreated());
	}
}
