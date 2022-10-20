package kr.or.kosa;
/**
 * 우리는 카드를 만들어 판매하는 회사 입니다.
 * 고객의 요청에 따라 카드 53장을 제작하게 되었습니다. (new Card... 53번)
 * 
 * [요구사항]
 * 카드는 카드의 [번호]를 가지고 있고 [모양]을 가지고 있다.
 * 카드는 크기를 가지고 있다. 크기는 [높이]와 [너비]를 가지고 있다.
 * 카드의 크기는 h=50 , w=20
 * 
 * 제작되는 [카드들의] 높이와 너비는 [동일]합니다
 * 
 * ---------------------------------
 * 
 * 제작해서 고객에게 전달함
 * 
 * 갑자기 고객이 ... 카드가 너무 크다 ... 
 * 
 * 다시 만들어주세요 ...
 * 
 * 설계도를 변경하지 않고 53장 카드의 높이와 너비를 변경할 수 있도록 설계도를 만드세요
 * 
 * @author KOSA
 *
 */
public class Card {
	private int cardNumber;
	private String cardKind;
	public static int cardh = 50;
	public static int cardw = 20;
	
	public void makeCard(int number, String kind) {
		cardNumber = number;
		cardKind = kind;
	}
	
	public void cardDisplay() {
		System.out.printf("번호 %d, 모양 %s, h:%d, w:%d\n",cardNumber,cardKind,cardh,cardw);
	}
}
