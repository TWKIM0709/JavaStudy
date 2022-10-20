import java.util.Queue;
import java.util.Stack;



public class Ex06_Stack_Queue {

	public static void main(String[] args) {
		// Java API �� �����ϴ� Ŭ����
		// Collection >> Java API�� ����
		
		//Stack �ڷᱸ���� ������ Ŭ������ ���� ����
		Stack stack = new Stack();	//LIFO (Last In First Out)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//System.out.println(stack.pop()); //java.util.EmptyStackException >> ������ ����ִ� ... ����
	}
}
