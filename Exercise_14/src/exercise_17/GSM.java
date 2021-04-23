package exercise_17;

/* 17. Създайте клас GSMCallHistoryTest, с който да се тества функционал-ността на класа GSM, 
от задача 12, като обект от тип GSM. След това, към него добавете няколко обаждания (Call). 
Изведете информация за всяко едно от обажданията. Ако допуснем, че цената за минута разговор е 0.37, 
пресметнете и отпечатайте общата цена на разговорите. Премахнете най-дългият разговор от архива с обаждания 
и пресметнете общата цена за всички разговори отново. Най-накрая изтрийте архива с обаждания.*/
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import exercise_11.Battery;
import exercise_11.Display;

public class GSM {
	private String model;
	private String maker;
	private int price;
	private String owner;
	private Battery batery;
	private Display display;
	Call call = null;
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

	public void addCall(Call call) {
		if (call.getStartOfCall() != null && call.getDuration() != 0) {
			callHistory.add(call);
		}
	}

	public double calculateCallSumInEuro(double costPerMinute) {
		double totalCallDuration = 0;
		for (Call call : this.callHistory) {
			totalCallDuration += call.getDuration();
		}
		return totalCallDuration / 60 * costPerMinute;
	}

	public void makeACall() {
		if (this.call == null) {
			this.call = new Call();
		} else {
			System.out.println("You are already in a call. Please end it and then start another call.");
		}
	}

	public void endCall() {
		Date date = new Date();
		this.call.duration = (date.getTime() - this.call.startOfCall.getTime()) / 1000;
		addCall(this.call);
		this.call = null;
	}

	public void getCallList() {
		for (Call call : callHistory) {
			System.out.println(call.getCallInfo());
		}
	}

	public void deleteCall(Call call) {
		callHistory.remove(call);
	}

	public void deleteAllCall() {
		callHistory.clear();
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

	class Call {
		private Date startOfCall;
		private long duration;

		private Call() {
			this.startOfCall = new Date();
		}

		public Date getStartOfCall() {
			return startOfCall;
		}

		public long getDuration() {
			return duration;
		}

		public String getCallInfo() {
			return "Call [startOfCall=" + startOfCall + ", duration=" + duration + "]";
		}

	}

}
