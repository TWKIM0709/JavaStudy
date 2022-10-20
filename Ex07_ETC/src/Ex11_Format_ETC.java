import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Ex11_Format_ETC {

	public static void main(String[] args) {
		double money = 123456.5678;
		
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println(df.format(money));
		
		DecimalFormat df2 = new DecimalFormat("0");
		System.out.println(df2.format(money));
		
		DecimalFormat df3 = new DecimalFormat("0.0000");
		System.out.println(df3.format(money));
		
		DecimalFormat df4 = new DecimalFormat("#.##");
		System.out.println(df4.format(money));
		
//		userId : rain483
//		userName : �θ���
//		userTel : 010-1234-1234
		
		String userId = "rain483";
		String userName = "�θ���";
		String userTel = "010-1234-1234";
		
		String message = "ȸ�� Id :{0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ��ȣ : {2}";
		Object[] arguments = {userId, userName, userTel};
		String result = MessageFormat.format(message, arguments);
		System.out.println(result);
	}

}










