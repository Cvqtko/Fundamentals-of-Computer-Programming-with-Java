package exercise_20;

public class TestSchool {
	public static void main(String[] args) {
		School school = new School("Kiril and Metodi");
		school.addStudent(new Student("Georgi Petrov", 1));
		school.addStudent(new Student("Ivan Petkov", 2));
		school.addStudent(new Student("Blagoi Ivanov", 3));

		Discipline math = new Discipline("Math", 30, 30);
		Discipline geography = new Discipline("Geography", 30, 30);
		Discipline physics = new Discipline("Physics", 30, 30);

		Teacher t1 = new Teacher("Dobra");
		Teacher t2 = new Teacher("Monika");
		Teacher t3 = new Teacher("Elena");

		t1.addDiscipline(physics);
		t2.addDiscipline(geography);
		t3.addDiscipline(math);

		SchoolClass classA = new SchoolClass(t1, 1234);
		SchoolClass classB = new SchoolClass(t2, 2345);
		SchoolClass classC = new SchoolClass(t3, 3456);

		school.addSchoolClass(classA);
		school.addSchoolClass(classB);
		school.addSchoolClass(classC);

		System.out.println(school.getSchoolInfo());
	}
}
