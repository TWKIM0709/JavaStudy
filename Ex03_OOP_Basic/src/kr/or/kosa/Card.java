package kr.or.kosa;
/**
 * �츮�� ī�带 ����� �Ǹ��ϴ� ȸ�� �Դϴ�.
 * ���� ��û�� ���� ī�� 53���� �����ϰ� �Ǿ����ϴ�. (new Card... 53��)
 * 
 * [�䱸����]
 * ī��� ī���� [��ȣ]�� ������ �ְ� [���]�� ������ �ִ�.
 * ī��� ũ�⸦ ������ �ִ�. ũ��� [����]�� [�ʺ�]�� ������ �ִ�.
 * ī���� ũ��� h=50 , w=20
 * 
 * ���۵Ǵ� [ī�����] ���̿� �ʺ�� [����]�մϴ�
 * 
 * ---------------------------------
 * 
 * �����ؼ� ������ ������
 * 
 * ���ڱ� ���� ... ī�尡 �ʹ� ũ�� ... 
 * 
 * �ٽ� ������ּ��� ...
 * 
 * ���赵�� �������� �ʰ� 53�� ī���� ���̿� �ʺ� ������ �� �ֵ��� ���赵�� ���弼��
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
		System.out.printf("��ȣ %d, ��� %s, h:%d, w:%d\n",cardNumber,cardKind,cardh,cardw);
	}
}
