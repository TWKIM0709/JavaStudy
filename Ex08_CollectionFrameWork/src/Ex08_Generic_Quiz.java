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
		//1. Array 사용 > tv, audio, notebook 을 담을 수 있는 cart 배열을 생성하고 제품을 담아라
		Product[] cart1 = {new KtTv(), new Audio(), new NoteBook()};
		
		//2. ArrayList<Generic>을 사용해 [1]과 같은 역할 만들기
		List<Product> cart2 = new ArrayList<Product>();
		cart2.add(new KtTv());
		cart2.add(new Audio());
		cart2.add(new NoteBook());
		
		//3. Emp 클래스
		// ArrayList<Generic>을 사용해 사원 3명 만들기
		List<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp(1111, "홍길동", "IT"));
		emp.add(new Emp(2222, "김유신", "영업"));
		emp.add(new Emp(3333, "유관순", "인사"));
		//3.1 사원의 정보(사번, 이름, 직종)를 toString 없이 출력 (개선된 for문)
		for(Emp e : emp)
			System.out.printf("사번 : %d | 이름 : %s | 직종 : %s\n",e.getEmpno(),e.getName(),e.getJob());
		
		System.out.println();
		//3.2 위와 동일... 일반 for문 사용
		for(int i = 0; i<emp.size(); i++)
			System.out.printf("사번 : %d | 이름 : %s | 직종 : %s\n",emp.get(i).getEmpno(),emp.get(i).getName(),emp.get(i).getJob());
		
		List<CopyEmp> clist = new ArrayList<CopyEmp>();
		clist.add(new CopyEmp(100, "kim", 1000));
		clist.add(new CopyEmp(200, "lee", 3000));
		clist.add(new CopyEmp(300, "park", 5000));
		
		//1. 200번 사원의 급여를 6000달러로 수정 >> 일반 for
		for(int i = 0; i<clist.size();i++) {
			if(clist.get(i).getEmpno() == 200) clist.get(i).setSal(6000);
		}
			
		//2. 300번 사원의 이름을 박씨에서 궁금해씨 로 수정 >> 결과 출력 개선 for
		for(CopyEmp e : clist) {
			if(e.getEmpno() == 300) {
				e.setName("궁금해씨");
				System.out.println(e);
			}
		}
	}
}
