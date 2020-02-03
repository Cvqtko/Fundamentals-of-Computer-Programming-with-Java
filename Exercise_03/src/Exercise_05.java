// 5. Напишете програма, която за подадени дължина и височина на правоъгълник, изкарват на конзолата неговият периметър и лице.
public class Exercise_05 {
	public static void main(String[] args) {
		double rectangleSideA = 5;
		double rectangleSideB = 10;
		
		double rectanglePerimeter = (rectangleSideA + rectangleSideB)*2;
		double rectangleArea = rectangleSideA*rectangleSideB;
		
		System.out.println("Rectangle perimeter = " + rectanglePerimeter);
		System.out.println("Rectangle area = " + rectangleArea);
	}
}
