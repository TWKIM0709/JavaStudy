/*
	시나리오(요구사항)
	저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다.
	A라는 전자제품 매장이 오픈되면
	
	[클라이언트 요구사항]
	가전제품은 제품의 가격, 제품의 포인트 정보를 모든 제품이 가지고 있다.
	각각의 가전제품은 제품별 고유한 이름정보를 가지고 있다.
	>>
	각각의 전자제품은 이름을 가지고 있다. ex) TV, Audio, Computer ...
	각각의 전자제품은 다른 가격정보를 가지고 있다.ex) Tv:5000, Audio : 3000
	제품의 포인트는 가격의 10%적용한다.
	
	시뮬레이션 시나리오
	구매자 : 제품을 구매하기 위한 금액정보, 포인트 정보를 가지고 있다. ex) 10만원 , 0 포인트
	구매자는 제품을 구매할 수 있다. 구매행위를 하게 되면 가지고 있는 돈은 감소하고 포인트는 증가한다.
	구매자는 초기 금액을 가질 수 있다.
	
	1. 매장에서 3개 제품만 구매 ... 997제품 구매 기능 없음
	>> PC방 >> 국내 전산망 >> 개발서버전송 >> 997구매 함수 추가해야 되는 상황 발생..
	
	>>변화에 대응하는 코드 ( 다형성 있는 코드 )가 아니라서 힘들어짐
	
	>>즐거운 휴가를 보내기 위한 방법 제시
	
	
	
*/

class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	Product product;
	KtTv(){
		super(500);
		product = new Product(123);
	}
	KtTv(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}
	Audio(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	NoteBook(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}


//구매자
class Buyer{
	int money;
	int point;
	Buyer(){
		this(0);
	}
	Buyer(int money){
		this.money = money;
		this.point = point;
	}
	//구매행위
	//money - 제품가격 && point += 가격/10
	//구매자는 매장에 있는 모든 전자제품을 구매할 수 있다.
	//모든 제품을 Product상속 >> 부모타입의 참조변수는 자식객체의 주소값을 받을 수 있다.
	void buy(Product product) {
		if(this.money < product.price) {
			System.out.println("고객님 잔액이 부족합니다! " + this.money);
			return;
		}
		this.money -= product.price;
		this.point += product.bonuspoint;
		System.out.println("구매한 제품은 "+ product);
	}
}


public class Ex12_Inherit_keyPoint_Poly {

	public static void main(String[] args) {
		KtTv kt = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer(5000);
		
		buyer.buy(kt);
		buyer.buy(kt);
		buyer.buy(kt);
		buyer.buy(notebook);
		System.out.println(buyer.money);
		System.out.println(buyer.point);
		
	}

}