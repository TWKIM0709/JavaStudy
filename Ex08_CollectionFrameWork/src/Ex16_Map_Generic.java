import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
	
*/

class QuizInfo{
	String question;
	String answer;
	boolean result;
	public QuizInfo(String question, String answer, boolean result) {
		super();
		this.question = question;
		this.answer = answer;
		this.result = result;
	}
	@Override
	public String toString() {
		return "QuizInfo [����=" + question + ", ����=" + answer + ", ���=" + result + "]";
	}
}

public class Ex16_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<String, String>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");
		
		for(int i = 0; i<quiz.size(); i++) {
			Set set = quiz.keySet();
			Object[] obj = set.toArray();	//Key�� ������ �迭�� �ٲپ ó��
//			System.out.println(obj[i]);
			System.out.println("���� : " + obj[i]);
//			System.out.println("���� : " + quiz.keySet().toArray()[i]); // �� ������ε� ��
			
//			String answer = new Scanner(System.in).nextLine();
//			if(answer.equals(quiz.get(obj[i]))) System.out.println("����");
		}
	}

}



