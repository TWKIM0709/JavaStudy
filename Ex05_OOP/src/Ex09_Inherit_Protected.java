import kr.or.kosa.Bird;

class Bi extends Bird{
	//�Ϲ� ��.. �� �� �ִ�.
	@Override
	public void moveFast() {
		super.moveFast();			//  �ٲ� �ʿ� ����. �״�� ���ڴ�. ( super )
	}
}

class Ostrich extends Bird{
	//Ư¡ : ���ε� ���� ���ϰ� �޸���.
	void run() {
		System.out.println("�޸���.");
	}
	@Override
	public void moveFast() {
		run();
	}
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi b = new Bi();
//		b.moveFast() >> protected >> ����� ���ؼ� ��� �� ��
		// moveFast()>> ��Ӱ��迡�� �����Ǹ� ���� ������ ����� �� ����.
		b.moveFast();	//��ӹ��� moveFast�� super�� �״�� ����ߴ�. Fly �� �� �ִ� ��
		
		Ostrich o = new Ostrich();
		o.moveFast(); 	//��ӹ��� moveFast�� run���� ������	�ߴ�.
	}
}



