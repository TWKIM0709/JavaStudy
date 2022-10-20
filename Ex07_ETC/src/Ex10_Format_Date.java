import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/kosait/336 Format
//https://cafe.naver.com/kosait/201 ��¥�� �� ���ϱ�

public class Ex10_Format_Date {

	public static void main(String[] args) {
		////////////////////////////Date, Calendar////////////////////////////////
		Date currdate = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println("date : " + currdate);
		//Thu Sep 15 09:19:13 KST 2022
		System.out.println("cal : " + cal);
		//java.util.GregorianCalendar[time=1663201153620,areFieldsSet=true,areAllFieldsSet=true...
		
		System.out.println("Calendar getTime() �Լ� : " + cal.getTime());
		//Thu Sep 15 09:21:09 KST 2022
		
		/////////////////////////////Format///////////////////////////////////
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		String datestr = dateformat.format(cal.getTime());
		System.out.println(datestr);
		
		//����Ʈ���� � ������ �Է�
		//���ڿ� >> ��¥ �������� �����ϰ� ����
		//"202209150925"
		String StringDate = "202209150925";
		Date stringdate = null;
		try {
			stringdate = dateformat.parse(StringDate);
			//parse�� ���� �����ڰ� (���� �߻� ���..) throws�� ����ó�� �ϵ��� ����
			
			long datelong = stringdate.getTime();
			System.out.println(datelong);//1663201500000 �ð�����??
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			System.out.println(stringdate);
		}
		
	}

}
