// 8. Íàïèøåòå ïðîãðàìà, êîÿòî ïðîâåðÿâà äàëè äàäåíà òî÷êà Î (x, y) å âúòðå â îêðúæíîñòòà Ê ((0,0), 5).
public class Exercise_08 {
	public static void main(String[] args) {
		double pointX = 4.0;
		double pointY = 13.1;

		System.out.println(Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 5
				? "Точката с координати x="+pointX+" y=" +pointY+ " е в окръжността ((0,0), 5)"
				: "Точката с координати x="+pointX+" y=" +pointY+ " не е в окръжността ((0,0), 5)");

	}
}
