
public class Exercise_02 {
	public static void main(String[] args) {
		String binary = "1111010110011110";
		System.out.println(binary + " to int --> " + Integer.parseInt(binary, 2));
		System.out.println(binary + " to hexadecimal --> " + Integer.toString(Integer.parseInt(binary, 2),16));
	}
}
