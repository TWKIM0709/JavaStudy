
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				//�¼� �ʱ�ȭ
				seat[i][j] = "__";
			}
		}
		
		//����
		seat[2][1] = "ȫ�浿";
		seat[0][0] = "������";
		
		//���� �¼� ��Ȳ �����ֱ�
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j].equals("__") ? "�¼�" : "����");
			}
			System.out.println();
		}
		
		// ���Ÿ� �Ϸ��� �� �� ... �� �¼��� ���� �������� ... ���Ű� �Ǿ��ִ���
		int row, col; row = 1; col = 0;
		if(seat[row][col].equals("__")) {
			System.out.println("���� ������ �¼��Դϴ�");
		}else {
			System.out.println("�̹� ����� �¼��Դϴ�");
		}
		
		//��ȭ ��... ��� �¼� �ʱ�ȭ
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				//�¼� �ʱ�ȭ
				seat[i][j] = "__";
			}
		}
	}

}
