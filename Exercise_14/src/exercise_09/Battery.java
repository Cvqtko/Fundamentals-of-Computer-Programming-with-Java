package exercise_09;

public class Battery {
	private String model;
	private float idleTime;
	private float talkHours;

	public Battery(String model, float idleTime, float talkHours) {
		this.model = model;
		this.idleTime = idleTime;
		this.talkHours = talkHours;
	}

	@Override
	public String toString() {
		return "Battery [model=" + model + ", idleTime=" + idleTime + ", talkHours=" + talkHours + "]";
	}
	
}
