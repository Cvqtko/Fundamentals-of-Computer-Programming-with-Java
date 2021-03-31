
public class Exercise_13 {
	public static void main(String[] args) {
		int n = 29;
		boolean isPrime = true;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime? "Даденото число е просто" : "Даденото число не е просто");
	}
}
