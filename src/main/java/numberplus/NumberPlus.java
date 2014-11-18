package numberplus;

public class NumberPlus {
	private static final int convertNumber = 1728;

	public static void main(String[] args) {
		System.out.println(toEnglish("3۳۲۲۳sdf234"));
	}

	public static String toEnglish(String number) {
		char[] charArr = number.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 1776 && charArr[i] <= 1785) {
				charArr[i] = (char) (charArr[i] - convertNumber);
			}
		}

		return new String(charArr);
	}
}
