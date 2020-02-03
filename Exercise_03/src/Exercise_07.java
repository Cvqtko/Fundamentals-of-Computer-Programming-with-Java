/* 7. Силата на гравитационното поле на луната е приблизително 17% от това на земята.
Напишете програма, която да изчислява тежестта на човек на луната, по дадената тежест на земята.*/
public class Exercise_07 {
	public static void main(String[] args) {
		
		double humanWeightOnEarth = 95;
		double humanWeightOnMars = humanWeightOnEarth*17/100;
		
		System.out.println("Тежестта на човек на луната е "+ humanWeightOnMars + "кг");
	}
}
