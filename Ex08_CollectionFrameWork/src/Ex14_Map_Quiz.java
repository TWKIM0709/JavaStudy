import java.util.HashMap;
import java.util.Scanner;

public class Ex14_Map_Quiz {

	public static void main(String[] args) {
		/*
		 * Map ����ؼ� �����ϴ� ����������
		 * ������ȣ, �����ȣ, ȸ������(ID, PW)
		 * 
		 * HashMap���� ȸ�������� �����ϴ� ����Ʈ
		 * 
		 */
		
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "Tiger");
		loginmap.put("lee", "kim1004");

		/*
		 * �츮 �ý����� ȸ�������� ȸ���� id,pw ������ ������ �ִ�.
		 * �α��ν� id, pw�� Ȯ���ؼ� ȸ���̶�� ����Ʈ�� ���� �����ϵ���
		 * 
		 * id (O) pw (O) >> �α��� ����, while Ż��
		 * id (O) pw (X) >> ���Է�
		 * id (X) pw (x) >> ���Է�
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("ID :");
			//ID�� ������ �����ϰ� �ҹ��ڷ� ��ȯ (String �Լ� ���)
			String id = scan.nextLine().replace(" ", "").toLowerCase();
			//��й�ȣ�� �������Ÿ� 
			System.out.print("PW :");
			String pw = scan.nextLine().replace(" ", "");
			
			if(loginmap.containsKey(id)) {
				if(loginmap.get(id).equals(pw)) {
					System.out.println("ȸ���� �氡�氡");
					break;
				}
				System.out.println("ID, PW Ȯ�����ּ���");
				continue;
			}
			
			System.out.println("id ���Է��ϼ���");
		}
	}
}
