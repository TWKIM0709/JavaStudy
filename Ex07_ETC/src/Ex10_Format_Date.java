import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/kosait/336 Format
//https://cafe.naver.com/kosait/201 날짜의 차 구하기

public class Ex10_Format_Date {

	public static void main(String[] args) {
		////////////////////////////Date, Calendar////////////////////////////////
		Date currdate = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println("date : " + currdate);
		//Thu Sep 15 09:19:13 KST 2022
		System.out.println("cal : " + cal);
		//java.util.GregorianCalendar[time=1663201153620,areFieldsSet=true,areAllFieldsSet=true...
		
		System.out.println("Calendar getTime() 함수 : " + cal.getTime());
		//Thu Sep 15 09:21:09 KST 2022
		
		/////////////////////////////Format///////////////////////////////////
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		String datestr = dateformat.format(cal.getTime());
		System.out.println(datestr);
		
		//사이트에서 어떤 정보를 입력
		//문자열 >> 날짜 형식으로 변경하고 싶음
		//"202209150925"
		String StringDate = "202209150925";
		Date stringdate = null;
		try {
			stringdate = dateformat.parse(StringDate);
			//parse를 만든 설계자가 (문제 발생 고민..) throws로 예외처리 하도록 설계
			
			long datelong = stringdate.getTime();
			System.out.println(datelong);//1663201500000 시간으로??
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			System.out.println(stringdate);
		}
		
	}

}
