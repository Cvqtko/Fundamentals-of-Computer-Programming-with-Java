package exercise_11;

public class Display {
	private float size;
	private int displayColors;

	public Display(float size, int displayColors) {
		this.size = size;
		this.displayColors = displayColors;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public int getDisplayColors() {
		return displayColors;
	}

	public void setDisplayColors(int displayColors) {
		this.displayColors = displayColors;
	}

	@Override
	public String toString() {
		return "Display [size=" + size + ", displayColors=" + displayColors + "]";
	}

}
