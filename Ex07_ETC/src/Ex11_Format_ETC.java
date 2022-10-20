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
//		userName : 부르곰
//		userTel : 010-1234-1234
		
		String userId = "rain483";
		String userName = "부르곰";
		String userTel = "010-1234-1234";
		
		String message = "회원 Id :{0} \n회원 이름 : {1} \n회원 전화번호 : {2}";
		Object[] arguments = {userId, userName, userTel};
		String result = MessageFormat.format(message, arguments);
		System.out.println(result);
	}

}










