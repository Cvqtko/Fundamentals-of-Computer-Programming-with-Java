package exercise_13;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/* 13. Създайте клас Call, който съдържа информация за разговор, осъщес-твен през мобилен телефон.
Той трябва да съдържа информация за датата, времето на започване и продължителността на разговора.*/
public class Call {
	private Date startOfCall;
	private Duration duration;
	static SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm:ss");

	public Call() {
		this.startOfCall = new Date();
	}

}
