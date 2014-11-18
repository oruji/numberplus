package org.oruji.main;

import org.oruji.numberplus.NumberPlus;
import org.oruji.numberplus.NumberPlus.sepStat;

public class Main {
	public static void main(String[] args) {
		System.out.println(new NumberPlus("۸۷۹۷.۸,۳۴").getEnglishSep(
				sepStat.SLASH, sepStat.DOT));
	}
}
