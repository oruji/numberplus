package org.oruji.numberplus;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class NumberPlus {
	private static final int convertNumber = 1728;

	private char[] value;

	public enum sepStat {
		COMMA, DOT, SLASH
	}

	private enum langStat {
		PERSIAN, ENGLISH
	}

	@SuppressWarnings("unused")
	private NumberPlus() {
	}

	public NumberPlus(String value) {
		value = value.trim();
		value = value.replaceAll(",", "");
		this.value = value.toCharArray();
	}

	public NumberPlus(Integer value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public NumberPlus(Long value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public NumberPlus(Float value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public NumberPlus(Double value) {
		this.value = String.valueOf(value).toCharArray();
	}

	public String getEnglish() {
		return getEnglish(this.value);
	}

	private String getEnglish(char[] charArr) {
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 1776 && charArr[i] <= 1785) {
				charArr[i] = (char) (charArr[i] - convertNumber);
			}
		}

		return new String(charArr);
	}

	public String getEnglishSep() {
		String value = getEnglish(this.value);
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator(',');

		DecimalFormat formatter = new DecimalFormat("", otherSymbols);

		String str = formatter.format(Double.parseDouble(value));

		return str;
	}

	public String getEnglishSep(sepStat decimalSep, sepStat groupSep) {
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
				.parseDouble(getEnglish(this.value)));

		return getEnglish(str.toCharArray());
	}

	public String getPersian() {
		return getPersian(this.value);
	}

	private String getPersian(char[] charArr) {
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 48 && charArr[i] <= 57) {
				charArr[i] = (char) (charArr[i] + convertNumber);
			}
		}

		return new String(charArr);
	}

	public String getPersianSep() {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);

		otherSymbols.setDecimalSeparator('.');
		otherSymbols.setGroupingSeparator(',');

		DecimalFormat formatter = new DecimalFormat("", otherSymbols);

		String str = formatter.format(Double
				.parseDouble(getEnglish(this.value)));

		return getPersian(str.toCharArray());
	}

	public String getPersianSep(sepStat decimalSep, sepStat groupSep) {
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
				.parseDouble(getEnglish(this.value)));

		return getPersian(str.toCharArray());
	}

	public Integer getInteger() {
		return Double.valueOf(getEnglish(this.value)).intValue();
	}

	public Long getLong() {
		return Double.valueOf(getEnglish(this.value)).longValue();
	}

	public Double getDouble() {
		return Double.valueOf(getEnglish(this.value));
	}

	public Float getFloat() {
		return Float.valueOf(getEnglish(this.value));
	}
}