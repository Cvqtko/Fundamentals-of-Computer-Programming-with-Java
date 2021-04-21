/* 1. Напишете програма, която извежда на стандартния изход броя на дните, часовете и минутите, които са изтекли от 
1 януари 1970 година до момента на изпълнението на програмата. За реализацията използвайте класа System.*/
public class Exercise_01 {
	public static void main(String[] args) {

		long timeSince1970 = System.currentTimeMillis();
		long sec = timeSince1970 / 1000;
		long days = sec / (24 * 3600);
		long hours = (sec % (24 * 3600)) / 3600;
		long minutes = ((sec % (24 * 3600)) % 3600) / 60;
		System.out.println(
				"Time passed since 1 January 1970:\n" + days + " days " + hours + " hours " + minutes + " minutes");

	}
}
