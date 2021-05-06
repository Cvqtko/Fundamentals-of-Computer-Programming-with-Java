package exercise_09;

public class Display {
	private float size;
	private int displayColors;

	public Display(float size, int displayColors) {
		this.size = size;
		this.displayColors = displayColors;
	}

	@Override
	public String toString() {
		return "Display [size=" + size + ", displayColors=" + displayColors + "]";
	}
}
