package exercise_09;

/* 9. Декларирайте няколко конструктора за всеки от създадените класове от предходната задача, 
които имат различни списъци с параметри (за цялостната информация за даден студент или част от нея). 
Данните за полетата, които не са известни трябва да се инициализират съответно със стойности с null или 0.*/
public class MobilePhone {
	private String model;
	private String maker;
	private int price;
	private String owner;
	private Battery batery;
	private Display display;

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

}
