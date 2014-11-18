package org.oruji.main;

import org.oruji.numberplus.NumberPlus;
import org.oruji.numberplus.NumberPlus.sepStatus;

public class Main {
	public static void main(String[] args) {
		// System.out.println(new NumberPlus("۲۳۴,۳,۴۳۲.۲۳۴۲").toEnglishSep(
		// sepStatus.COMMA, sepStatus.SLASH));
		//
		// System.out.println(new NumberPlus("۲۳۴,۳,۴۳۲.۲۳۴۲").toEnglishSep());

		// System.out.println(new NumberPlus("۲۳۴۳۴۳۲۲۳.۴۲۳۴").toEnglishSep(
		// sepStatus.SLASH, sepStatus.DOT));

		System.out.println(new NumberPlus("۲۳۴۳۴۳.۴۲۳3۴").toLong());
	}
}
