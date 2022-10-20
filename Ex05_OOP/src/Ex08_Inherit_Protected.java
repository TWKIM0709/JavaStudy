import kr.or.kosa.Pclass;

/*
	��Ӱ��迡�� ... ������ : protected
	
	public
	private
	default
	protected
	
	protected : ��鼺 >> default , public
	>> ����� ���� Ŭ���� �ȿ��� protected >> default�� ����
	>> ��Ӱ��迡���� �ǹ̸� ���´� ( ��Ӱ��迡���� ) >> public
*/

class Dclass{
	public int i;
	private int p;
	int s;	//default
	protected int k;	//����� �ƴϸ� default
}

class Child2 extends Pclass{
	void method() {
		this.k = 100;	// ��Ӱ��� >> �ڽ��� �θ��� protected �ڿ��� public ó�� ���
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.i
		//p.k	>> protected >> �׳� ���� default ������ >> ������
		
		Child2 c = new Child2();
		c.method();
	}

}
