
// �θ�
class Pbase{
	int p = 100;
}
// ��ӹ��� �ֵ�
class Cbase extends Pbase{
	int c = 200;
}

class Dbase extends Pbase{
	int d = 300;
}

class Test{
	void print(Pbase p) {
		System.out.println("��������");
	}
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		Dbase dbase = new Dbase();
		System.out.println(cbase.toString());
		
		//�θ�Ÿ�� Pbase Ÿ���� p�� Cbase, Dbase ��� ���� �� �ִ�.
		
		Pbase p = cbase;
		p = dbase;
		
		Cbase c = (Cbase)p;	//�θ� �ڽĿ��� �ּҸ� �ַ��� Down ĳ��������ߵȴ�.
	}

}
