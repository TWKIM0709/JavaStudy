package kr.or.kosa.common;

public class Car {
	int i;				//�����Ϸ��� �ڵ����� default ��� ( ���� package )
	// default package �� Ex01_Main���� i�� ��� �Ұ� ( default �� ���� ���� ���� ) 
	public int window;	// ���� package �ٸ� package ��� ���� �� ��� ����
	private int door;	// ĸ��ȭ ... ���� �Ұ� ... ���������� �����ؾ� ��
						// getter , setter >> Ư���� ������ �Լ�
	
	public int getDoor() { 			// ������ �ڿ� write
		return door;
	}
	public void setDoor(int door) {	// ������ �ڿ� read
		this.door = door;
	}
}
