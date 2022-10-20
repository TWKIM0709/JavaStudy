package kr.or.kosa.utils;

import java.util.Calendar;

//���赵
//��¥�� �����ϴ� �Լ��� ���� ���ȴ� >> static
// static + �Լ�overloading

public class Edu_Date {
	public static String dateString(Calendar date) {
		return date.get(Calendar.YEAR) + "��"
				+ (date.get(Calendar.MONTH)+1) + "��"
				+ date.get(Calendar.DATE) + "��";
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
