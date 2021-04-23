package exercise_20;

import java.util.ArrayList;

/* 20. ������ �� � �������. � ��������� ����� ������� � �������. ����� ���� ��� ��������� �� �������������.
����� ������������ ��� ���-������ �� ����������, �� ����� ���������. ��������� ���� ��� � �������� ����� � �����.
��������� ���� �������� ������� ����-���������. ������������ ���� ���, ���� ����� � ���� ����������.
�������� � �� �� �������� ������� � Java �������. ������ �� ����������� ������� ������ � ������� ������, 
��������, ������ � ������������. ����������� � ������ ����, ����� �����������, �� ���������� ������� ������� ��������.*/
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
