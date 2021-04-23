package exercise_09;

/* 9. ������������ ������� ������������ �� ����� �� ����������� ������� �� ����������� ������, 
����� ���� �������� ������� � ��������� (�� ���������� ���������� �� ����� ������� ��� ���� �� ���). 
������� �� ��������, ����� �� �� �������� ������ �� �� ������������� ��������� ��� ��������� � null ��� 0.*/
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
