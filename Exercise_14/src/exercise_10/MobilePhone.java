package exercise_10;

import exercise_09.Battery;
import exercise_09.Display;

/* 10. Към класа за мобилен телефон от предходните две задачи, добавете статично поле nokiaN95, 
което да съхранява информация за мобилен телефон модел Nokia 95. Добавете метод, в същия клас,
който извежда информация за това статично поле.*/
public class MobilePhone {
	private String model;
	private String maker;
	private int price;
	private String owner;
	private Battery batery;
	private Display display;
	private static MobilePhone nokiaN95 = new MobilePhone("NokiaN95", "Nokia", 950, "Cvqtko",
			new Battery("BL-6F", 200, 120), new Display((float) 2.8, 16_000_000));

	public MobilePhone(String model, String maker, int price, Display display) {
		this(model, maker, price, "", null, display);

	}

	public MobilePhone(String model, String maker, int price, String owner, Battery batery, Display display) {
		this.model = model;
		this.maker = maker;
		this.price = price;
		this.owner = owner;
		this.batery = batery;
		this.display = display;
	}

	public String getMobilePhoneInfo() {
		return "MobilePhone [model=" + model + ", maker=" + maker + ", price=" + price + ", owner=" + owner + ", "
				+ batery.toString() + ", " + display.toString() + "]";
	}
}
