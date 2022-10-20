package kr.or.kosa;

import java.io.Serializable;

/*
	��ü ���
	��ü(Car, Tv, Tank ��) ��Ʈ��ũ, ���ϰ���(txt���Ͽ� ��ü�� write .. ��ü read) , ���μ������� ���
	
	<< ����ȭ >>
	��ü�� �����ؼ� ���� ���� ������ �Ϸ��� ����
	
	<< ������ȭ >>
	��ü�� �ٽ� �����ϴ� ����
	
	�ǽ�) File
	��ü�� write (���Ͽ�) ����ȭ�� ��G�ؼ�
	��ü�� read (���Ͽ�) ������ȭ�� ����ؼ�
	
	���� : ��� �ڿ��� ����ȭ �� ���� ����.
	>> ����
	   Serializable �������̽� ���
	   
*/		
public class UserInfo implements Serializable{ //����ȭ ����
	private String name;
	private String pwd;
	private int age;
	
	public UserInfo() {
		
	}
	public UserInfo(String name, String pwd, int age) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public String getPwd() {
		return pwd;
	}
	public int getAge() {
		return age;
	}
}






