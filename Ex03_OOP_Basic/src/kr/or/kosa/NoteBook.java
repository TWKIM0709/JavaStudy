package kr.or.kosa;

public class NoteBook {
	
	public String color;
	// ��ü ���� ��� >> [ĸ��ȭ] , [����ȭ] �� �ָ��� >> [����]������ ���� [����]�ϰų� ���� ���� �����ϴ� ����
	// public int year; >> public �̶� ���� ���� ���� >> private�� ���ƹ���
	// private �����ϴ� �� >> ���������� ��� >> �������� ���ؼ� >> getter setter
	// ������ >> �����ڰ� [��]�� ���ؼ� [����]�ϰڴ� ..
	// ĸ��ȭ ��� >> ǥ��ȭ >> getYear ... , setYear ... >> getter setter
	private int year;

	// read ����
	public int getYear() { // ���������� year member filed ���� return �ϴ� �Լ�
		return year;
	}

	// write ����
	public void setYear(int year) { // �����Ҵ��� ���� >> ���� ���ϴ´�� '����'�� �� �ִ�
		if (year < 0)
			this.year = 1999;
		else
			this.year = year;
	}
	
	// ��Ʈ���� ���콺�� ������ �ִ�
	// ���콺 >> ��, ��ư, �𵨸� >> �ɰ� �� �ִ�.
	//		>> ��ǰ���� ... (����, Ÿ�̾�, ���콺 ��)
	// ���콺 ���赵 (class)
	
	// ��Ʈ���ϰ� ���콺�� ������ ��ǰ
	// public Mouse mouse = new Mouse();	//Mouse ��� Ÿ���� Ŭ���� >> �������� mouse >> �ּҰ��� ������
	
	// ��Ʈ���� '�ʿ信 ����' ���콺�� ���� �� �ִ�
	// ������ : ������ ��ü�� �ּҸ� ������
	public void handle(Mouse mouse) {
		mouse.x = 100;
		mouse.y = 200;
	}

}
