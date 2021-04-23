package exercise_12;

import exercise_11.Battery;
import exercise_11.Display;
import exercise_11.MobilePhone;

/* 12. Напишете клас GSMTest, който тества функционалностите на класа GSM. 
Създайте няколко обекта от дадения клас и ги запазете в масив. Изведете информация за създадените обекти.
Изведете информация за статичното поле nokiaN95.*/
public class GSMTest {
	public static void main(String[] args) {
		MobilePhone[] phoneArray = new MobilePhone[3];
		phoneArray[0] = new MobilePhone("NokiaN95", "Nokia", 950, "Cvqtko", new Battery("BL-6F", 200, 120),
				new Display((float) 2.8, 16_000_000));
		phoneArray[1] = new MobilePhone("NokiaLumia", "Nokia", 950, "Georgi", new Battery("BL-6F", 200, 120),
				new Display((float) 2.8, 16_000_000));
		phoneArray[2] = new MobilePhone("NokiaPrism", "Nokia", 950, "Petya", new Battery("BL-6F", 200, 120),
				new Display((float) 2.8, 16_000_000));

		for (MobilePhone mp : phoneArray) {
			System.out.println(mp.getMobilePhoneInfo());
		}
	}
}
