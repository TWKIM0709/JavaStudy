
/*
	������(��� ���迡�� ����)
	������ : �������� ����(����)�� ���� �� �ִ� �ɷ�
	
	Java : [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ�.
	>> [�ϳ��� ��������] >> �θ�Ÿ��
	>> [�������� Ÿ��]  >> �θ� ��ӹ��� �ڽ�
	
	������ : 	���� >> �θ�� �ڽĿ��� ��� ���� �ش�.
			���α׷� >> �ڽ��� �θ𿡰� ���� ���� �ش�.
	
	��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�
	��.. �θ�� �ڽ��� �ڿ��� ���� �����ϴ�.
	��.. �����ǵ� �ڿ��� ���� �����ϴ�
*/

//�θ� �ڿ����� ( �и�:�������:�Ϲ�ȭ,�߻�ȭ )
class Tv2{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown(){
		this.ch--;
	}
}

//CapTv : Ư��ȭ, ��üȭ, ������ �ڿ� �߰�
class CapTv extends Tv2{
	String text;
	String captionText() {
		return text = "�ڸ�ó����";
	}
}



public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		ct.chDown();
		System.out.println(ct.captionText());
		
		///////////////////////////////////////////
		
		Tv2 tv2 = ct;	
		//��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�
		//��.. �θ�� �ڽ��� �ڿ��� ���� �����ϴ�
		//��.. �����ǵ� �ڿ��� ���� �����ϴ�.
		
		System.out.println(tv2==ct);
		//tv.captionText();	//�ڽ� �ڿ��� ���� �Ұ� (+�����ǵ� �θ� �ڿ��� �Ұ�)
	}

}





