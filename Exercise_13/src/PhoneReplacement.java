

public class PhoneReplacement {
	public static void main(String[] args) {
		String doc = "Smith's number: 0892880022 \n" + "Franky can be found at 0853445566 \n"
				+ "so as Steven - 0811654321";
		String replacedDoc = doc.replaceAll("(08)[0-9]{8}", "$1********");
		System.out.println(replacedDoc);
	}

}
