import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {

		String str = "hello";
		String concatstr = str.concat(" world");

		boolean bo = str.contains("e"); // contains	>> �ִ��� ã��
		boolean bo2 = str.contains("ell"); // ������ �͵� ã��. true
		boolean bo3 = str.contains("elo"); // �����ϱ� false

		System.out.println(bo + "," + bo2 + "," + bo3);
		
		String str2 = "a b c d";	// [a] [ ] [b] [ ] [c] [ ] [d] ... ���鵵 ����
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("h"));		// indexOf	��ġ(or ������ġ)
		System.out.println(filename.indexOf("java"));	// ������ -1 return
		
		if(filename.indexOf("wo") != -1) System.out.println("wo �ܾ� �ϳ��� �ִ�.");	// �ٵ� �̰� ���� ���°�
		if(filename.contains("wo")) System.out.println("wo �ܾ� �ϳ��� �ִ�."); 		// �̰� �ִµ� ��
		
		System.out.println(filename.lastIndexOf("a"));	//9���� �濡 ������ a�� �ִ�.
		
		// �ܿ�� ���� String �Լ�
		// length(), indexOf(), substring(), replace(), split()
		
		
		// ========= substring =========
		String result = "superman";
		System.out.println(result.substring(0));	// ����index ~
		System.out.println(result.substring(0,2));	 
//		Parameters:
//			beginIndex - the beginning index, inclusive.	����index�� �����Ѵ�
//			endIndex - the ending index, exclusive.			��index�� �����Ѵ�
//		[����index] ~ [��index]-1�� ����
		
		//Quiz
		String filename2 = "home.jpge";	//����) or �� ���ϸ��� h.png or aaaa.hwp �� ���� �ִ�.
		
		// ���ϸ�� Ȯ���ڸ� �и��ؼ� ����ϼ���
		// 1. ������ .�� ��� �ִ��� ã��
		// 2. ã�� .�� �������� ����ϱ�
		int dot = filename2.lastIndexOf(".");
		System.out.println("���� �̸��� " + filename2.substring(0,dot));
		System.out.println("���� Ȯ���ڴ� " + filename2.substring(dot+1,filename2.length()));
		
		
		// ========= replace =========
		// replace([ã������],[�ٲܹ���]);
		String str3 = "ABCCBADDDDDBCA";
		String result3 = str3.replace("DDDDD", "������ �ݿ���");
		System.out.println(result3);
		
		result3 = str3.replace("A","a");
		System.out.println(result3);
		
		//ETC .. charAt()
		System.out.println(str3.charAt(3));
		System.out.println(str3.charAt(0));
		System.out.println(str3.endsWith("DBCA"));
		System.out.println(str3.endsWith("BDBCA"));
		System.out.println(str3.equalsIgnoreCase("ABCCbADddDDBCA")); // ��ҹ��� ���� ���� ���ض�
		
		// ========= Today Point =========
		String str4 = "���۸�,��Ƽ,�����,������,������";
		String []str4arr = str4.split(",");
		for(String value : str4arr) System.out.println(value);
		

		String str5 = "���۸�.��Ƽ.�����.������.������";
		String []str5arr = str5.split("\\.");
		for(String value : str5arr) System.out.println(value);
		
		// ����ǥ���� ( ���ڵ��� �����ؼ� ��Ģ�� ����� :: �� ��Ģ�� �����͸� ���ؼ� �Ǵ� ) ������ ������ true
		// ����ǥ������ java, javascript, oracle, c# ��� ��� �� ǥ������ ���� �ִ�
		// ex) �ڵ���, ������ȣ, �������ּ�, �̸��� �� >> �Է��� ������ ��ȿ�� ����
		// �����ȣ {\d3}-{\d3} >> 12-456(false), 123*456(false), 111-445(true)
		// ��Ű : https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
	 	
		// ���⼭ ���� >> "." >> ����ǥ�������� ���� >> \. ���� �Է��ؾߵȴ�.
		//									  >> �ڹٿ����� �������� �������� ������ \\. ���� ���
		
		// ������(09.05��) ������ ���� ���� ...
		
		String filename3 = "kosa.hwp";
		String [] filename3arr = filename3.split("\\.");
		for(String s : filename3arr) System.out.println(s);
		
		
		// �̷��Ŵ� split���� �и� ���ϴϱ� 
		String str6 = "a/b,c-d.f";
		//StringTokenizer�� �и���
		StringTokenizer sto = new StringTokenizer(str6,"/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		// �ͼ��� Quiz
		// ���ڿ� ���̻��� ������ �����ϴ� ��� >> replace�� " "������ ""�� ġȯ		
		String str7 = "ȫ         ��      ��";
		//����� ������ ���� >> "ȫ�浿" ����
		String strresult = str7.replace(" ","");
		System.out.println(strresult);
		
		// �յ� ���� �ڸ��°� trim()�̶�� �Լ��� ���� �ִ�.
		String str8 = "        ȫ�浿         ";
		System.out.println(">" + str8 + "<");
		System.out.println(str8.trim());
		
		String str9 = "       ȫ      ��        ��        ";
		System.out.println(">" + str9 + "<");
		System.out.println(str9.replace(" ",""));
		
		// �����̶� replace �ϳ��� �ذ� ������ ����������
		// trim > replace �ΰ� ���� �����Ѱ�
		//*****�������� �Լ��� ���� [method chain] ��� ���
		// method chain��� : str9.trim().replace(" ", "").substring(2) >> �̷������� �����ؼ�
		System.out.println(str9.trim().replace(" ", "").substring(2));
		
		
		//Quiz
		String jumin = "123456-1234567";
		int sum = 0;
		//1. �� �ֹι�ȣ�� �� �ڸ��� ���� ���ϼ���

		// 1�� ���
		String jumin2 =jumin.replace("-","");
		for(int i = 0; i< jumin2.length(); i++) sum+= jumin2.charAt(i)-48;
		System.out.println(sum);
		
		// 2�� ���
		sum = 0;
		for(int i = 0; i<jumin2.length(); i++) sum+= Integer.parseInt(jumin2.substring(i, i+1));
		System.out.println(sum);

		// 3�� ���
		sum = 0;
		for(int i = 0; i<jumin2.length(); i++) sum+= Integer.parseInt(Character.toString(jumin2.charAt(i)));
		System.out.println(sum);
		
		// 3�� Ǯ�
		char[] c = new char[13];
		for(int i = 0; i<jumin2.length(); i++) {
			c[i] = jumin2.charAt(i);
		}
		for(int i = 0; i<jumin2.length(); i++) {
			sum += Integer.parseInt(Character.toString(c[i]));
		}


		// === ���� Quiz ===
	}

}





