package exercise_14;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public class Call {
	private Date startOfCall;
	private long duration;
	static SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm:ss");

	public Call() {
		this.startOfCall = new Date();
	}

	public Date getStartOfCall() {
		return startOfCall;
	}

	public long getDuration() {
		return duration;
	}

	public void endCall(Call call) {
		Date date = new Date();
		this.duration = (this.startOfCall.getTime() - date.getTime()) / 1000;
	}

}
