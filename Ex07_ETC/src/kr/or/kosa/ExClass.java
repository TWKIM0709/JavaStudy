package kr.or.kosa;

import java.io.IOException;

/*
	���赵�� �ۼ�...
	���赵�� ����ϴ� �����ڿ��� � ��Ȳ�� ���ؼ� �ݵ�� ���ܸ� ó���ϵ��� �����ϰ� �ʹ�...
*/

public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException{
		System.out.println(path);
	}
	public int testInt(int c) throws IOException, NullPointerException {
		return c;
	}
}
