import kr.or.kosa.Card;

public class Ex08_Static_Card {

	public static void main(String[] args) {
		// 53장을 만들었다고 가정
		// heap 메모리에 올리겠다
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
		
		// 설계도를 변경하지 않고 
		// 한장의 카드 크기를 바꾸면 모든 카드가 바뀌게
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
