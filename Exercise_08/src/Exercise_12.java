// 12. Да се напише програма, която преобразува арабските числа в римски.
public class Exercise_12 {
	public static void main(String[] args) {
		int number = 500;
		System.out.println(arabicToRomanNumbers(number));
	}

	public static String arabicToRomanNumbers(int number) {
		if(number>3999) {
			System.out.println("The number has to in the interval [1...3999]");
			return "-1";
		}
		String romanNumber = "";
		int thousands = number / 1000, hundreds = (number / 100) % 10, tens = (number / 10) % 10, ones = number % 10;
        switch (thousands)
        {
            case 1: romanNumber += "M"; break;
            case 2: romanNumber += "MM"; break;
            case 3: romanNumber += "MMM"; break;                
        }

        switch (hundreds)
        {
            case 1: romanNumber += "C"; break;
            case 2: romanNumber += "CC"; break;
            case 3: romanNumber += "CCC"; break;
            case 4: romanNumber += "CD"; break;
            case 5: romanNumber += "D"; break;
            case 6: romanNumber += "DC"; break;
            case 7: romanNumber += "DCC"; break;
            case 8: romanNumber += "DCCC"; break;
            case 9: romanNumber += "CM"; break;
        }

        switch (tens)
        {
            case 1: romanNumber += "X"; break;
            case 2: romanNumber += "XX"; break;
            case 3: romanNumber += "XXX"; break;
            case 4: romanNumber += "XL"; break;
            case 5: romanNumber += "L"; break;
            case 6: romanNumber += "LX"; break;
            case 7: romanNumber += "LXX"; break;
            case 8: romanNumber += "LXXX"; break;
            case 9: romanNumber += "XC"; break;
        }

        switch (ones)
        {
            case 1: romanNumber += "I"; break;
            case 2: romanNumber += "II"; break;
            case 3: romanNumber += "III"; break;
            case 4: romanNumber += "IV"; break;
            case 5: romanNumber += "V"; break;
            case 6: romanNumber += "VI"; break;
            case 7: romanNumber += "VII"; break;
            case 8: romanNumber += "VIII"; break;
            case 9: romanNumber += "IX"; break;
        }
        return romanNumber;
	}
}
