class Product2{
	int price;
	int bonuspoint;
	Product2(int price){
		this.price = price;
		bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	KtTv2(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	Audio2(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	NoteBook2(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}


//구매자
class Buyer2{
	int money;
	int point;
	Buyer2(){
		this(0);
	}
	Buyer2(int money){
		this.money = money;
		this.point = point;
	}
	//구매행위
	//money - 제품가격 && point += 가격/10
	//구매자는 매장에 있는 모든 전자제품을 구매할 수 있다.
	//모든 제품을 Product상속 >> 부모타입의 참조변수는 자식객체의 주소값을 받을 수 있다.
	void buy(Product3 product,Cart cart) {
		if(this.money < product.price) {
			System.out.println("고객님 잔액이 부족합니다! " + this.money);
			return;
		}
		this.money -= product.price;
		this.point += product.bonuspoint;
		System.out.println("구매한 제품은 "+ product);
		cart.Buy(product);
	}
	void summery(Cart cart) {
		int sum = 0;
		for(int i = 0; i<cart.count; i++) {
			sum+= cart.product[i].price;
			System.out.printf("%s %d원\n",cart.product[i],cart.product[i].price);
		}
		System.out.println("제품의 금액은 총 " + sum);
	}
	
}


class Cart{
	Product3 []product;
	int count;
	Cart(){
		this.product = new Product3[10];
		this.count = 0;
	}
	void Buy(Product3 product) {
		this.product[count++] = product;
	}
}



public class Ex13_Inherit_keyPoint_Poly {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Buyer2 buyer = new Buyer2(5000);
		
		buyer.buy(new KtTv3(), cart);
		buyer.buy(new KtTv3(), cart);
		buyer.buy(new KtTv3(), cart);
		buyer.buy(new KtTv3(), cart);
		
		buyer.summery(cart);
	}

}
