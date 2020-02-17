// 3. Превърнете шестнайсетичните числа 2A3E, FA, FFFF, 5A0E9 в двоична и десетична бройна система.
public class Exercise_03 {
	public static void main(String[] args) {
		String hex1 = "2A3E";
		String hex2 = "FA";
		String hex3 = "FFFF";
		String hex4 = "5A0E9";

		System.out.println(hex1 + " to binary --> " + Integer.toBinaryString(Integer.parseInt(hex1, 16))); 
		System.out.println(hex2 + " to binary --> " + Integer.toBinaryString(Integer.parseInt(hex2, 16))); 
		System.out.println(hex3 + " to binary --> " + Integer.toBinaryString(Integer.parseInt(hex3, 16))); 
		System.out.println(hex4 + " to binary --> " + Integer.toBinaryString(Integer.parseInt(hex4, 16))); 
		System.out.println();
		System.out.println(hex1 + " to decimal --> " + Integer.parseInt(hex1, 16));
		System.out.println(hex2 + " to decimal --> " + Integer.parseInt(hex2, 16));
		System.out.println(hex3 + " to decimal --> " + Integer.parseInt(hex3, 16));
		System.out.println(hex4 + " to decimal --> " + Integer.parseInt(hex4, 16));
	}
}
