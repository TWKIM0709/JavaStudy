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


//������
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
	//��������
	//money - ��ǰ���� && point += ����/10
	//�����ڴ� ���忡 �ִ� ��� ������ǰ�� ������ �� �ִ�.
	//��� ��ǰ�� Product��� >> �θ�Ÿ���� ���������� �ڽİ�ü�� �ּҰ��� ���� �� �ִ�.
	void buy(Product3 product,Cart cart) {
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ�! " + this.money);
			return;
		}
		this.money -= product.price;
		this.point += product.bonuspoint;
		System.out.println("������ ��ǰ�� "+ product);
		cart.Buy(product);
	}
	void summery(Cart cart) {
		int sum = 0;
		for(int i = 0; i<cart.count; i++) {
			sum+= cart.product[i].price;
			System.out.printf("%s %d��\n",cart.product[i],cart.product[i].price);
		}
		System.out.println("��ǰ�� �ݾ��� �� " + sum);
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
