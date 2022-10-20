package kr.or.kosa;

//�ڹ� API�� �����ϴ� Stack�� ���� �����غ���
//1. stack ������� Array , Ÿ���� Object
//2. ��ġ ���� : ����Ǵ� ���� �ִ�
//3. ��� : push , pop , boolean empty , boolean full


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
