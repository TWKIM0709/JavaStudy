import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.CopyEmp;
import kr.or.kosa.Emp;

class Product {
	int price;
	int bonuspoint;

	Product(int price) {
		this.price = price;
		bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product {
	Product product;

	KtTv() {
		super(500);
		product = new Product(123);
	}

	KtTv(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product {
	Audio() {
		super(100);
	}

	Audio(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		super(150);
	}

	NoteBook(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "NoteBook";
	}
}

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Array ��� > tv, audio, notebook �� ���� �� �ִ� cart �迭�� �����ϰ� ��ǰ�� ��ƶ�
		Product[] cart1 = {new KtTv(), new Audio(), new NoteBook()};
		
		//2. ArrayList<Generic>�� ����� [1]�� ���� ���� �����
		List<Product> cart2 = new ArrayList<Product>();
		cart2.add(new KtTv());
		cart2.add(new Audio());
		cart2.add(new NoteBook());
		
		//3. Emp Ŭ����
		// ArrayList<Generic>�� ����� ��� 3�� �����
		List<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp(1111, "ȫ�浿", "IT"));
		emp.add(new Emp(2222, "������", "����"));
		emp.add(new Emp(3333, "������", "�λ�"));
		//3.1 ����� ����(���, �̸�, ����)�� toString ���� ��� (������ for��)
		for(Emp e : emp)
			System.out.printf("��� : %d | �̸� : %s | ���� : %s\n",e.getEmpno(),e.getName(),e.getJob());
		
		System.out.println();
		//3.2 ���� ����... �Ϲ� for�� ���
		for(int i = 0; i<emp.size(); i++)
			System.out.printf("��� : %d | �̸� : %s | ���� : %s\n",emp.get(i).getEmpno(),emp.get(i).getName(),emp.get(i).getJob());
		
		List<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100, "kim", 1000));
		clist.add(new CopyEmp(200, "lee", 3000));
		clist.add(new CopyEmp(300, "park", 5000));
		
		//1. 200�� ����� �޿��� 6000�޷��� ���� >> �Ϲ� for
		for(int i = 0; i<clist.size();i++) {
			if(clist.get(i).getEmpno() == 200) clist.get(i).setSal(6000);
		}
			
		//2. 300�� ����� �̸��� �ھ����� �ñ��ؾ� �� ���� >> ��� ��� ���� for
		for(CopyEmp e : clist) {
			if(e.getEmpno() == 300) {
				e.setName("�ñ��ؾ�");
				System.out.println(e);
			}
		}
	}
}
