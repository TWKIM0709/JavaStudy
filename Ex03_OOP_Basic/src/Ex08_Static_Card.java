import kr.or.kosa.Card;

public class Ex08_Static_Card {

	public static void main(String[] args) {
		// 53���� ������ٰ� ����
		// heap �޸𸮿� �ø��ڴ�
		/*Card c1 = new Card();
		c1.makeCard(1, "heart");
		c1.cardDisplay();
		
		Card c2 = new Card();
		c2.makeCard(2, "heart");
		c2.cardDisplay();
		
		Card c3 = new Card();
		c3.makeCard(3, "heart");
		c3.cardDisplay();
		*/
		
		// ���赵�� �������� �ʰ� 
		// ������ ī�� ũ�⸦ �ٲٸ� ��� ī�尡 �ٲ��
		Card c1 = new Card();
		c1.makeCard(1, "heart");
		c1.cardh = 40;
		c1.cardw = 10;
		
		Card c2 = new Card();
		c2.makeCard(2, "heart");
		c2.cardDisplay();
		
		Card c3 = new Card();
		c3.makeCard(3, "heart");
		c3.cardDisplay();
		c1.cardDisplay();
	}

}
