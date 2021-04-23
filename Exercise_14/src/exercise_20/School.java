package exercise_20;

import java.util.ArrayList;

/* 20. Дадено ни е училище. В училището имаме класове и ученици. Всеки клас има множество от преподаватели.
Всеки преподавател има мно-жество от дисциплини, по които преподава. Учениците имат име и уникален номер в класа.
Класовете имат уникален текстов иден-тификатор. Дисциплините имат име, брой уроци и брой упражнения.
Задачата е да се моделира училище с Java класове. Трябва да декларирате класове заедно с техните полета, 
свойства, методи и конструктори. Дефинирайте и тестов клас, който демонстрира, че останалите класове работят коректно.*/
public class School {
	private String name;
	private ArrayList<SchoolClass> schoolClasses;
	private ArrayList<Student> students;

	public School(String name) {
		this.name = name;
		schoolClasses = new ArrayList<>();
		students = new ArrayList<>();
	}

	public void addSchoolClass(SchoolClass schoolClass) {
		this.schoolClasses.add(schoolClass);
	}

	public void removeSchoolClass(SchoolClass schoolClass) {
		this.schoolClasses.remove(schoolClass);
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}

	public String getSchoolInfo() {
		String info = "School name= " + this.name + " \n";
		info = info.concat("\tClasses\n");
		for (SchoolClass schoolClass : schoolClasses) {
			info = info.concat(schoolClass.getClassInfo() + "\n");
		}

		info = info.concat("\tStudents\n");
		for (Student student : students) {
			info = info.concat(student.getStudentInfo() + "\n");
		}
		return info;
	}

}
