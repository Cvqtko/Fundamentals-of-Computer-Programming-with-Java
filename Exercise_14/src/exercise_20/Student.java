package exercise_20;

public class Student {
	private String name;
	private int uniqueNumber;

	public Student(String name, int uniqueNumber) {
		this.name = name;
		this.uniqueNumber = uniqueNumber;
	}

	public String getStudentInfo() {
		return "Student [name=" + name + ", uniqueNumber=" + uniqueNumber + "]";
	}

}
