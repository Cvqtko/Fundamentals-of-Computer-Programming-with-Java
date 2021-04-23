package exercise_01;
/* 1. Дефинирайте клас Student, който съдържа следната информация за студентите:
	трите имена, курс, специалност, университет, електронна поща и телефонен номер.*/
public class Student {
	private String firstName;
	private String middleName;
	private String lastName;
	private int yearAtUnivercity;
	private Speciality speciality;
	private Univercity univercity;
	private String email;
	private String telNumber;
}

enum Univercity {
	UNIVERCITY_OF_SOFIA, TECHNICAL_UNIVERCITY_SOFIA
}

enum Speciality {
	COMPUTER_AND_SOFTWARE_ENGINEERING, MECHANICS, ELECTRONIX
}