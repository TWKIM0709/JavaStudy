import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_Set_TreeSet {

	public static void main(String[] args) {
		//Set : ���� X , �ߺ� X
		
		//TreeSet
		//���� X , �ߺ� X , ���ı�� O
		//�˻��ϰų� .. ������ �ʿ��� �ڷᱸ��
		//ex) �ζ�
		
		//Ư¡
		//1. ���� Ʈ�� ���� (������ ����) : root > leaf
		//2. ������ ����� ���ı�� ����
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("D");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("P");
		System.out.println(hs);
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(;lotto.size()<6;) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		System.out.println(lotto);
	}

}
