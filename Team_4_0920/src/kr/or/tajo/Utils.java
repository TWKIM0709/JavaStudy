package kr.or.tajo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Utils {
	//정규식, 날짜표현, 파일 경로, Scanner 등 static으로
	public static final String BASICPATH = "C:\\Tajo\\"; //파일 기본 경로
	public static final String USERPATH = BASICPATH + "user.txt"; //유저목록 경로
	public static final String PRODUCTPATH = BASICPATH + "product.txt"; //기기목록 경로
	public static final String LOGPATH = BASICPATH + "log.txt"; //내역목록 경로
	public static final String SYSTEMINFORPATH = BASICPATH + "systeminfo.txt"; //시스템정보 경로
	
	public static Calendar cal = Calendar.getInstance(); //캘린더
	
	public static Scanner scanner = new Scanner(System.in); // 스캐너
	
	public static SimpleDateFormat dateformat = new SimpleDateFormat("yy.MM.dd-HH:mm"); //날짜 표시 포멧
//	public static String logDate = dateformat.format(cal.getTime()); //현재 날짜 String
	public static final String REGIXID = "^[a-z]+[a-z0-9]{5,19}$";//아이디 제한:윤태호
	public static final String REGIXPASSWARD = "^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$`~!@$!%*#^?&\\\\(\\\\)\\-_=+]).{8,16}$";//비밀번호 제한:윤태호
	
	//일반적 날자출력:윤태호
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
	}//monthFormat_DateString end:윤태호
	
}
