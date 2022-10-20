import java.util.Queue;
import java.util.Stack;



public class Ex06_Stack_Queue {

	public static void main(String[] args) {
		// Java API 가 제공하는 클래스
		// Collection >> Java API가 제공
		
		//Stack 자료구조를 가지는 클래스를 제공 받음
		Stack stack = new Stack();	//LIFO (Last In First Out)
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//System.out.println(stack.pop()); //java.util.EmptyStackException >> 스택이 비어있다 ... 예외
	}
}
