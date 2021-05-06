package exercise_17;

import exercise_11.Battery;
import exercise_11.Display;

public class GSMCallHistoryTest {
	public static void main(String[] args) throws InterruptedException {
		GSM nokia = new GSM("NokiaLumia900", "Nokia", 950, "Cvqtko", new Battery("BL-6F", 200, 120),
				new Display((float) 2.8, 16_000_000));

		nokia.makeACall();
		Thread.sleep(2000);
		nokia.endCall();

		nokia.makeACall();
		Thread.sleep(2000);
		nokia.endCall();

		nokia.makeACall();
		Thread.sleep(3000);
		nokia.endCall();

		nokia.getCallList();
		System.out.println("The total cost of your calls is - " + nokia.calculateCallSumInEuro(5) + "ˆ");
	}
}
