package exercise_11;

public class Battery {
	private String model;
	private float idleTime;
	private float talkHours;

	public Battery(String model, float idleTime, float talkHours) {
		this.model = model;
		this.idleTime = idleTime;
		this.talkHours = talkHours;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(float idleTime) {
		this.idleTime = idleTime;
	}

	public float getTalkHours() {
		return talkHours;
	}

	public void setTalkHours(float talkHours) {
		this.talkHours = talkHours;
	}

	@Override
	public String toString() {
		return "Battery [model=" + model + ", idleTime=" + idleTime + ", talkHours=" + talkHours + "]";
	}
}
