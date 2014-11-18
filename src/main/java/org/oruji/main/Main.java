package org.oruji.main;

import org.oruji.numberplus.NumberPlus;
import org.oruji.numberplus.NumberPlus.sepStatus;

public class Main {
	public static void main(String[] args) {
		System.out.println(new NumberPlus("234,2,234").toPersianSep(
				sepStatus.COMMA, sepStatus.SLASH));

		System.out.println(new NumberPlus("234,2,234").toPersian());
	}
}
