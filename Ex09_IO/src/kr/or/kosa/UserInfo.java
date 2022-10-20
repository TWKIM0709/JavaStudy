package kr.or.kosa;

import java.io.Serializable;

/*
	객체 통신
	객체(Car, Tv, Tank 등) 네트워크, 파일간에(txt파일에 객체를 write .. 객체 read) , 프로세스간에 통신
	
	<< 직렬화 >>
	객체를 분해해서 줄을 세워 보내는 일련의 과정
	
	<< 역직렬화 >>
	객체를 다시 조립하는 과정
	
	실습) File
	객체를 write (파일에) 직렬화를 사욯해서
	객체를 read (파일에) 역직렬화를 사용해서
	
	문제 : 모든 자원을 직렬화 할 수는 없다.
	>> 조건
	   Serializable 인터페이스 상속
	   
*/		
public class UserInfo implements Serializable{ //직렬화 가능
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






