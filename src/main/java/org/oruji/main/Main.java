package org.oruji.main;

import org.oruji.numberplus.NumberPlus;
import org.oruji.numberplus.NumberPlus.sepStat;

public class Main {
	public static void main(String[] args) {
		System.out.println(new NumberPlus("۲۳۴۲۳,.45232").getPersianSep(
				sepStat.DOT, sepStat.SLASH));

	}
}
