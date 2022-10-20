package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNo;	//계좌번호
	private String name;		//소유자명
	private long balance;		//잔고
	private List<Transaction> transactions;	//거래내역
	
	//생성자
	public Account(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}
	
	//입금
	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new Transaction("입금",amount,balance));
	}
	
	//출금
	public void withdraw(long amount) {
		if(amount > balance) {
			System.out.println("출금 가능한 금액을 초과하였습니다. 현재 잔액 : " + balance);
			return;
		}
		this.balance -= amount;
		transactions.add(new Transaction("출금",amount,balance));
	}
	//잔고 확인
	public long getBalance() {
		return this.balance;
	}
	//거래내역을 본다
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
