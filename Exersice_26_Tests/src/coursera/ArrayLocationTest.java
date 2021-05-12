package coursera;

public class ArrayLocationTest {
	public static void main(String[] args) {
		double[] coordinates = { 5.0, 0.0 };
		ArrayLocation location = new ArrayLocation(coordinates);
		coordinates[0] = 32.9;
		coordinates[1] = -117.2;

		System.out.println(location.coordinates[0]);
	}
}
