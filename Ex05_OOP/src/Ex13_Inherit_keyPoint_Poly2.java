class Product3{
	int price;
	int bonuspoint;
	Product3(){	}
	Product3(int price){
		this.price = price;
		bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv3 extends Product3{
	KtTv3(){
		super(500);
	}
	KtTv3(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio3 extends Product3{
	Audio3(){
		super(100);
	}
	Audio3(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook3 extends Product3{
	NoteBook3(){
		super(150);
	}
	NoteBook3(int price){
		super(price);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}


//구매자
class Buyer3{
	int money;
	int point;
	
	Product3[] cart;
	int index;
	Buyer3(){
		this(1000,0);
	}
	Buyer3(int money,int point){
		this.money = money;
		this.point = point;
		index = 0;
		cart = new Product3[10];
	}
	void buy(Product3 product) {
		if(this.money < product.price) {
			System.out.println("고객님 잔액이 부족합니다! " + this.money);
			return;
		}
		if(index>9) {
			System.out.println("카트가 가득 찼습니다.");
			return;
		}
		
		cart[index++] = product;
		this.money -= product.price;
		this.point += product.bonuspoint;
		System.out.printf("구매한 제품은 %s...남은 잔액 : %d...현재 포인트 : %d\n",product,money,point);
	}
	void summery() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist="";
		
		for(int i = 0; i<index; i++) {
			totalprice += cart[i].price;
			totalbonuspoint += cart[i].bonuspoint;
			productlist += cart[i] + " ";
		}
		
		System.out.println("***********************************");
		System.out.println("  구매한 물건 총액 : " + totalprice);
		System.out.println("  누적 보너스 총액 : " + totalbonuspoint);
		System.out.println("  구매한 물건 목록 : " + productlist);
		System.out.println("***********************************");
	}
	
}
public class Ex13_Inherit_keyPoint_Poly2 {

	public static void main(String[] args) {
		KtTv3 tv = new KtTv3();
		Audio3 audio = new Audio3();
		NoteBook3 notebook = new NoteBook3();
		Buyer3 buyer = new Buyer3(5000,0);
		
		buyer.buy(tv);
		buyer.buy(tv);
		buyer.buy(audio);
		buyer.buy(tv);
		buyer.buy(audio);
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.buy(notebook);
		buyer.buy(tv);
		buyer.summery();
	}

}
