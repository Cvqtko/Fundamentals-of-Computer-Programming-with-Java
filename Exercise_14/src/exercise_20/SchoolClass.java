package exercise_20;

import java.util.ArrayList;

public class SchoolClass {
	private ArrayList<Teacher> teachers = new ArrayList<>();
	private int uniqueIdentifier;

	public SchoolClass(Teacher teacher, int uniqueIdentifier) {
		this.teachers.add(teacher);
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public void removeTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public String getClassInfo() {
		String info = "SchoolClass [";
		for (Teacher teacher : teachers) {
			info = info.concat(teacher.getTeacherInfo());
		}
		return info;
	}

}
