package kr.or.kosa;

//�θ�� ���
//������ �������, �߻�ȭ�� ���� >> �� �� �ִ�. ������. 
public class Bird {
	//������
	public void fly() {
		System.out.println("Flying");
	}
	//protected 
	//�����ڰ� ���... ���� �ʴ� Ÿ���� ����� �ϸ� ��� ����?
	//	>> Bird�� ����ϴ� ����� moveFast() �ڿ��� ���ؼ� �����Ǹ� ������ ���ڴ�.
	protected void moveFast() {
		fly();
	}
}
