package numberplus;

public final class NumberPlus {
	private static final int convertNumber = 1728;

	private final char[] value;

	private NumberPlus() {
		this.value = new char[0];
	}

	public NumberPlus(String value) {
		this.value = value.toCharArray();
	}

	public NumberPlus(Double value) {
		this.value = value.toString().toCharArray();
	}

	public String toEnglish() {
		char[] charArr = this.value;

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 1776 && charArr[i] <= 1785) {
				charArr[i] = (char) (charArr[i] - convertNumber);
			}
		}

		return new String(charArr);
	}

	public String toPersian() {
		char[] charArr = this.value;

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 48 && charArr[i] <= 57) {
				charArr[i] = (char) (charArr[i] + convertNumber);
			}
		}

		return new String(charArr);
	}
}