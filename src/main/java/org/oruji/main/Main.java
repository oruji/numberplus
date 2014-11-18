package org.oruji.main;

import org.oruji.numberplus.NumberPlus;

public class Main {
	public static void main(String[] args) {
		// System.out.println(new NumberPlus("۲۳۴,۳,۴۳۲.۲۳۴۲").toEnglishSep(
		// sepStatus.COMMA, sepStatus.SLASH));
		//
		// System.out.println(new NumberPlus("۲۳۴,۳,۴۳۲.۲۳۴۲").toEnglishSep());

		// System.out.println(new NumberPlus("۲۳۴۳۴۳۲۲۳.۴۲۳۴").toEnglishSep(
		// sepStatus.SLASH, sepStatus.DOT));

		System.out.println(new NumberPlus(new Long(2342)).getPersianSep());
	}
}
