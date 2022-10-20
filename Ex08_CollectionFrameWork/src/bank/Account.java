package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNo;	//���¹�ȣ
	private String name;		//�����ڸ�
	private long balance;		//�ܰ�
	private List<Transaction> transactions;	//�ŷ�����
	
	//������
	public Account(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}
	
	//�Ա�
	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new Transaction("�Ա�",amount,balance));
	}
	
	//���
	public void withdraw(long amount) {
		if(amount > balance) {
			System.out.println("��� ������ �ݾ��� �ʰ��Ͽ����ϴ�. ���� �ܾ� : " + balance);
			return;
		}
		this.balance -= amount;
		transactions.add(new Transaction("���",amount,balance));
	}
	//�ܰ� Ȯ��
	public long getBalance() {
		return this.balance;
	}
	//�ŷ������� ����
	public List<Transaction> getTransaction(){
		return transactions;
	}
	
	/////////////////////////////
	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", transactions="
				+ transactions + "]";
	}
	
}
