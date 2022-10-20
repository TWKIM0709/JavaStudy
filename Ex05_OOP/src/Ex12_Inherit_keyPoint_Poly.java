/*
	�ó�����(�䱸����)
	����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�.
	A��� ������ǰ ������ ���µǸ�
	
	[Ŭ���̾�Ʈ �䱸����]
	������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ ������ ��� ��ǰ�� ������ �ִ�.
	������ ������ǰ�� ��ǰ�� ������ �̸������� ������ �ִ�.
	>>
	������ ������ǰ�� �̸��� ������ �ִ�. ex) TV, Audio, Computer ...
	������ ������ǰ�� �ٸ� ���������� ������ �ִ�.ex) Tv:5000, Audio : 3000
	��ǰ�� ����Ʈ�� ������ 10%�����Ѵ�.
	
	�ùķ��̼� �ó�����
	������ : ��ǰ�� �����ϱ� ���� �ݾ�����, ����Ʈ ������ ������ �ִ�. ex) 10���� , 0 ����Ʈ
	�����ڴ� ��ǰ�� ������ �� �ִ�. ���������� �ϰ� �Ǹ� ������ �ִ� ���� �����ϰ� ����Ʈ�� �����Ѵ�.
	�����ڴ� �ʱ� �ݾ��� ���� �� �ִ�.
	
	1. ���忡�� 3�� ��ǰ�� ���� ... 997��ǰ ���� ��� ����
	>> PC�� >> ���� ����� >> ���߼������� >> 997���� �Լ� �߰��ؾ� �Ǵ� ��Ȳ �߻�..
	
	>>��ȭ�� �����ϴ� �ڵ� ( ������ �ִ� �ڵ� )�� �ƴ϶� �������
	
	>>��ſ� �ް��� ������ ���� ��� ����
	
	
	
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


//������
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
	//��������
	//money - ��ǰ���� && point += ����/10
	//�����ڴ� ���忡 �ִ� ��� ������ǰ�� ������ �� �ִ�.
	//��� ��ǰ�� Product��� >> �θ�Ÿ���� ���������� �ڽİ�ü�� �ּҰ��� ���� �� �ִ�.
	void buy(Product product) {
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ�! " + this.money);
			return;
		}
		this.money -= product.price;
		this.point += product.bonuspoint;
		System.out.println("������ ��ǰ�� "+ product);
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