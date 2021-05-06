package exercise_20;

import java.util.ArrayList;

public class Discipline {
	private String name;
	private int numberOfLections;
	private int numberOfExercises;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLections() {
		return numberOfLections;
	}

	public void setNumberOfLections(int numberOfLections) {
		this.numberOfLections = numberOfLections;
	}

	public int getNumberOfExercises() {
		return numberOfExercises;
	}

	public void setNumberOfExercises(int numberOfExercises) {
		this.numberOfExercises = numberOfExercises;
	}

	public Discipline(String name, int numberOfLections, int numberOfExercises) {
		this.name = name;
		this.numberOfLections = numberOfLections;
		this.numberOfExercises = numberOfExercises;
	}

	public String getDisciplineInfo() {
		return "Discipline [name=" + name + ", numberOfLections=" + numberOfLections + ", numberOfExercises="
				+ numberOfExercises + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Discipline other = (Discipline) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
