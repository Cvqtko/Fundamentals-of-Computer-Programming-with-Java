package exercise_20;

import java.util.ArrayList;

public class Teacher {
	private String name;
	private ArrayList<Discipline> disciplines;

	public Teacher(String name) {
		this.name = name;
		this.disciplines = new ArrayList<>();
	}

	public void addDiscipline(Discipline discipline) {
		this.disciplines.add(discipline);
	}

	public void removeDiscipline(Discipline discipline) {
		this.disciplines.remove(discipline);
	}

	public String getTeacherInfo() {
		String info = "Teacher [name=" + name + ", ";
		for (Discipline discipline : disciplines) {
			info = info.concat(discipline.getDisciplineInfo());
		}
		info = info.concat("]");
		return info;
	}

}
