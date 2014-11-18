package org.oruji.numberplus;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class NumberPlus {
	private static final int convertNumber = 1728;

	private char[] value;

	public enum sepStatus {
		COMMA, DOT, SLASH
	}

	@SuppressWarnings("unused")
	private NumberPlus() {
	}

	public NumberPlus(String value) {
		value = value.replaceAll(",", "");
		this.value = value.toCharArray();
	}

	public NumberPlus(Double value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public NumberPlus(Long value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public NumberPlus(Integer value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public NumberPlus(char[] value) {
		this.value = value;
	}

	public String toEnglish() {
		return toEnglish(this.value);
	}

	private String toEnglish(char[] charArr) {
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 1776 && charArr[i] <= 1785) {
				charArr[i] = (char) (charArr[i] - convertNumber);
			}
		}

		return new String(charArr);
	}

	public String toEnglishSep() {
		String value = toEnglish(this.value);
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator(',');

		DecimalFormat formatter = new DecimalFormat("", otherSymbols);

		String str = formatter.format(Double.parseDouble(value));

		return str;
	}

	public String toEnglishSep(sepStatus decimalSep, sepStatus groupSep) {
		String value = toEnglish(this.value);

		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);

		switch (decimalSep) {
		case COMMA:
			otherSymbols.setDecimalSeparator(',');
			break;
		case DOT:
			otherSymbols.setDecimalSeparator('.');
			break;
		case SLASH:
			otherSymbols.setDecimalSeparator('/');
			break;

		default:
			break;
		}

		switch (groupSep) {
		case COMMA:
			otherSymbols.setGroupingSeparator(',');
			break;
		case DOT:
			otherSymbols.setGroupingSeparator('.');
			break;
		case SLASH:
			otherSymbols.setGroupingSeparator('/');
			break;

		default:
			break;
		}

		DecimalFormat formatter = new DecimalFormat("", otherSymbols);
		String str = formatter.format(Double.parseDouble(value));

		return toEnglish(str.toCharArray());
	}

	public String toPersian() {
		return toPersian(this.value);
	}

	private String toPersian(char[] charArr) {
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 48 && charArr[i] <= 57) {
				charArr[i] = (char) (charArr[i] + convertNumber);
			}
		}

		return new String(charArr);
	}

	public String toPersianSep() {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);

		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator(',');

		DecimalFormat formatter = new DecimalFormat("", otherSymbols);

		String str = formatter.format(Double
				.parseDouble(new String(this.value)));

		return toPersian(str.toCharArray());
	}

	public String toPersianSep(sepStatus decimalSep, sepStatus groupSep) {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);

		switch (decimalSep) {
		case COMMA:
			otherSymbols.setDecimalSeparator(',');
			break;
		case DOT:
			otherSymbols.setDecimalSeparator('.');
			break;
		case SLASH:
			otherSymbols.setDecimalSeparator('/');
			break;

		default:
			break;
		}

		switch (groupSep) {
		case COMMA:
			otherSymbols.setGroupingSeparator(',');
			break;
		case DOT:
			otherSymbols.setGroupingSeparator('.');
			break;
		case SLASH:
			otherSymbols.setGroupingSeparator('/');
			break;

		default:
			break;
		}

		DecimalFormat formatter = new DecimalFormat("", otherSymbols);

		String str = formatter.format(Double
				.parseDouble(new String(this.value)));

		return toPersian(str.toCharArray());
	}

	public Double toDouble() {
		return Double.valueOf(toEnglish(this.value));
	}

	public Long toLong() {
		return Double.valueOf(toEnglish(this.value)).longValue();
	}

	public Integer toInteger() {
		return Double.valueOf(toEnglish(this.value)).intValue();
	}
}