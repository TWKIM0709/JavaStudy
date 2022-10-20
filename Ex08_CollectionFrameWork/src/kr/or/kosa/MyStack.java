package kr.or.kosa;

//자바 API가 제공하는 Stack을 직접 구현해보자
//1. stack 저장공간 Array , 타입은 Object
//2. 위치 정보 : 저장되는 값이 있는
//3. 기능 : push , pop , boolean empty , boolean full


public class MyStack {
	private int top;
	private Object[] stackarr;
	private final int maxsize;
	
	public MyStack(){
		this(10);
	}
	public MyStack(int maxsize){
		this.stackarr = new Object[maxsize];
		this.maxsize = maxsize;
		this.top =-1;
	}
	
	public void push(Object obj) {
		boolean value = false;
		if(!isFull()) {
			stackarr[++top] = obj;
			value = true;
		}
		else {
			System.out.println("stack is full");
		}
	}
	
	public Object pop() {
		Object obj = null;
		if(!isEmpty()) {
			obj = stackarr[top--];
		}
		else {
			System.out.println("stack is empty");
		}
		return obj;
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxsize-1);
	}
}
