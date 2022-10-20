package kr.or.tajo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Utils {
	//���Խ�, ��¥ǥ��, ���� ���, Scanner �� static����
	public static final String BASICPATH = "C:\\Tajo\\"; //���� �⺻ ���
	public static final String USERPATH = BASICPATH + "user.txt"; //������� ���
	public static final String PRODUCTPATH = BASICPATH + "product.txt"; //����� ���
	public static final String LOGPATH = BASICPATH + "log.txt"; //������� ���
	public static final String SYSTEMINFORPATH = BASICPATH + "systeminfo.txt"; //�ý������� ���
	
	public static Calendar cal = Calendar.getInstance(); //Ķ����
	
	public static Scanner scanner = new Scanner(System.in); // ��ĳ��
	
	public static SimpleDateFormat dateformat = new SimpleDateFormat("yy.MM.dd-HH:mm"); //��¥ ǥ�� ����
//	public static String logDate = dateformat.format(cal.getTime()); //���� ��¥ String
	public static final String REGIXID = "^[a-z]+[a-z0-9]{5,19}$";//���̵� ����:����ȣ
	public static final String REGIXPASSWARD = "^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$`~!@$!%*#^?&\\\\(\\\\)\\-_=+]).{8,16}$";//��й�ȣ ����:����ȣ
	
	//�Ϲ��� �������:����ȣ
	public static String monthFormat_DateString(Calendar date) {
		
		String str = "";
		if((date.get(Calendar.MONTH)+1) < 10) {
			str = ("0" + (date.get(Calendar.MONTH)+1)) ;
		}else {
			str = String.valueOf(date.get(Calendar.MONTH)+1);
		}
		return date.get(Calendar.YEAR) + "-" + 
				str + "-" + 
				date.get(Calendar.DATE);
	}//monthFormat_DateString end:����ȣ
	
}