import kr.or.kosa.MyStack;

public class Ex07_MyStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		
		stack.push(5);
		stack.push("asd");
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
