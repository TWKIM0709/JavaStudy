package kr.or.kosa;
/*
	�䱸����
	1. å�� [å�̸�]�� [��������]�� ������ �ִ�.
	2. å�� ���ǵǷ��� '�ݵ�� å�̸��� å�� ���������� ������ �־��'�Ѵ�.
	3. å�� [�̸�]�� [��������]�� 'Ư�� ����� ���ؼ���' �� �� �ְ�, ���ǵ� ���Ŀ��� '����'�� �� ����. private, setter ����
	4. å [�̸�]�� [��������]�� '���� Ȯ��'�� �� �ִ�.
*/
public class Book {
	private String name;
	private int price;
	
	// ������
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// �̸��� �������� ��� �Լ�
	public void bookInfo() {
		System.out.printf("�̸� : %s, ���� : %d��\n",name,price);
	}
	
	// ���� Ȯ���ϴ� ���
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
