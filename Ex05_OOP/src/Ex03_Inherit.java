/*
	�ΰ��� ���赵
*/

class Tv{
	boolean power;
	int ch;
	
	void power() {	//����		// �ΰ��� ����� �ϳ��� �Լ��� ó��
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class Vcr{	// �����÷��̾�
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("����ϱ�");
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	void rew() {
		
	}
	void ff() {
		
	}
}

// Tv  ���赵
// Vcr ���赵

// TvVcr ��ǰ ����� ����
// ������ ��� >> �ڿ��� �̸��� ������ �ϳ��� ��� �Ұ�
// 1. ���ο� ��ü�� ����
class TvVcr{
	Tv t;
	Vcr v;
	public TvVcr() {
		this.t = new Tv();
		this.v = new Vcr();
	}
}

//2. �ϳ��� ���, �ϳ��� ����
//	 [���α���� ������ �ִ� && ������ ����] Class�� ��� 
class TvVcr2 extends Tv{
	Vcr vcr;
	public TvVcr2(){
		this.vcr = new Vcr();
	}
}

public class Ex03_Inherit {

	public static void main(String[] args) {
		TvVcr tvvcr = new TvVcr();
		tvvcr.t.power();
		tvvcr.v.power();
		System.out.println(tvvcr.t.power);
		System.out.println(tvvcr.v.power);
		
		///////////////////////////////////////////////
		
		TvVcr2 tv2 = new TvVcr2();
		tv2.power();
		System.out.println("TV���� : " + tv2.power);
		tv2.chUp();
		
		tv2.vcr.power();
		System.out.println("���� ���� : " + tv2.vcr.power);
		tv2.vcr.play();
	}

}
