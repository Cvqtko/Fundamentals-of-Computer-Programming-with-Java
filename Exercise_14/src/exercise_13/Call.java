package exercise_13;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/* 13. �������� ���� Call, ����� ������� ���������� �� ��������, ������-���� ���� ������� �������.
��� ������ �� ������� ���������� �� ������, ������� �� ��������� � ����������������� �� ���������.*/
public class Call {
	private Date startOfCall;
	private Duration duration;
	static SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm:ss");

	public Call() {
		this.startOfCall = new Date();
	}

}
