package exercise_14;

/* 14. Добавете свойство архив с обажданията – callHistory, което да пази списък от осъществените разговори.*/
import java.util.ArrayList;

import exercise_11.Battery;
import exercise_11.Display;

public class GSM {
	private String model;
	private String maker;
	private int price;
	private String owner;
	private Battery batery;
	private Display display;
	private static GSM nokiaN95 = new GSM("NokiaN95", "Nokia", 950, "Cvqtko", new Battery("BL-6F", 200, 120),
			new Display((float) 2.8, 16_000_000));
	static ArrayList<Call> callHistory = new ArrayList<Call>();

	public GSM(String model, String maker, int price, Display display) {
		this(model, maker, price, "", null, display);

	}

	public GSM(String model, String maker, int price, String owner, Battery batery, Display display) {
		this.model = model;
		this.maker = maker;
		this.price = price;
		this.owner = owner;
		this.batery = batery;
		this.display = display;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Battery getBatery() {
		return batery;
	}

	public void setBatery(Battery batery) {
		this.batery = batery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public String getMobilePhoneInfo() {
		return "MobilePhone [model=" + model + ", maker=" + maker + ", price=" + price + ", owner=" + owner + ", "
				+ batery.toString() + ", " + display.toString() + "]";
	}
}
