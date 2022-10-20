package kr.or.kosa.utils;

import java.util.Calendar;

//설계도
//날짜를 적용하는 함수는 많이 사용된다 >> static
// static + 함수overloading

public class Edu_Date {
	public static String dateString(Calendar date) {
		return date.get(Calendar.YEAR) + "년"
				+ (date.get(Calendar.MONTH)+1) + "월"
				+ date.get(Calendar.DATE) + "일";
	}
	public static String dateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR) + opr
				+ (date.get(Calendar.MONTH)+1) + opr
				+ date.get(Calendar.DATE);
	}
	public static String monthFormat_DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "-"
				+ (((date.get(Calendar.MONTH)+1)<10) ? "0" : "") +
				+ (date.get(Calendar.MONTH)+1) + "-"
				+ date.get(Calendar.DATE);
	}
}
