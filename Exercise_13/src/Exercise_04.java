/* 4. ����� � �������� ���, �������� �� ������� "���������" ����, ��������� ��� �������. ����� � � �����, �������� ���� ����. 
�� �� ������ ��������, ����� �������� ����������� ���� � ������ ��� ���������. ������:
Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.
��� �� ����������� ����: "Java,JVM,Microsoft".
��������:
********* announced its next generation **** compiler today. It uses advanced parser and special optimizer for the ********* ***.*/
public class Exercise_04 {
	public static void main(String[] args) {
		String text = "Microsoft announced its next generation Java compiler today."
				+ " It uses advanced parser and special optimizer for the Microsoft JVM.";
		String forbiddenWords = "Java,JVM,Microsoft";
		String[] forbiddenArr = forbiddenWords.split("[,]");

		for (int i = 0; i < forbiddenArr.length; i++) {
			text = text.replaceAll(forbiddenArr[i], createStringOfAsterix(forbiddenArr[i]));
		}
		System.out.println(text);
	}

	public static String createStringOfAsterix(String str) {
		StringBuilder asterix = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			asterix.append("*");
		}
		return asterix.toString();

	}
}
