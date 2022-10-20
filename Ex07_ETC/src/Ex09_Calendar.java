import java.util.Calendar;
import java.util.Date;

import kr.or.kosa.utils.Edu_Date;

/*
	Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
	GregorianCalendar
	buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
	�±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
	�� �ν��Ͻ��� ��ȯ�Ѵ�
	GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
	�׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
	�׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
	������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
	class MyApp{
	static void main(){
	Calendar cal = new GregorianCalendar();
	�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
	class MyApp{
	static void main(){
	Calendar cal = new getInstance();
	�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����...... } }
	API : ������ Protected Calendar() 
*/
public class Ex09_Calendar {

	public static void main(String[] args) {
		Date dt = new Date(); //������
		System.out.println(dt.toString());	//Wed Sep 14 16:46:01 KST 2022
		
		Calendar cal = Calendar.getInstance();
		//Calendar �߻�Ŭ����
		System.out.println(cal.toString()); // java.util.GregorianCalendar[time=1663142228853,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=257,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=57,SECOND=8,MILLISECOND=853,ZONE_OFFSET=32400000,DST_OFFSET=0]
		//����� �ʿ��� ������ �����ؼ� �����ض�
		
		System.out.println("�⵵ :"  + cal.get(Calendar.YEAR));
		System.out.println("�� :"  + (cal.get(Calendar.MONTH)+1));	//���� 0~11�� ǥ��
		System.out.println("�� :"  + cal.get(Calendar.DATE));

		System.out.println("�� ���� ��� : "  + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�� ���� ��ĥ :"  + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("�̹����� ��ĥ :"  + cal.get(Calendar.DAY_OF_WEEK));
		
		//�� �� ��
		System.out.println("�� :"  + cal.get(Calendar.HOUR));
		System.out.println("�� :"  + cal.get(Calendar.MINUTE));
		
		System.out.println("�� :"  + cal.get(Calendar.SECOND));
		System.out.println("�������� :"  + cal.get(Calendar.AM_PM));
		
		//ex) �л�����ý��� ��
		//������ ���� : 200page
		//150page���� ��¥������ ���� �ȴ�. �� ������ �ϴܿ� ��� ( 2022��9��14�� )
		//A ģ�� �������� ���� ... cal.get(Calendar.YEAR) + cal.get(Calendar.MONTH) + cal.get(Calendar.DATE)
		//���ڱ� �ؿ� ����... ��¥�� 2022-09-14 ���·�...
		
		//�ѹ��� �����ؼ� 150�������� ��¥ ������ ���� �ɷ���...
		System.out.println(Edu_Date.dateString(Calendar.getInstance()));
		System.out.println(Edu_Date.dateString(Calendar.getInstance(),"-"));
		System.out.println(Edu_Date.dateString(Calendar.getInstance(),"/"));
		System.out.println(Edu_Date.monthFormat_DateString(Calendar.getInstance()));
	}

}
