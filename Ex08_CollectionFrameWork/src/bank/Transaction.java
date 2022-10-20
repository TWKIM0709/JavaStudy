package bank;

import java.util.Calendar;

public class Transaction {
	private String transactionDate;	//거래일
	private String transactionTime;	//거래시간
	private String kind;			//구분(입-출금)
	private long amount;			//거래금액
	private long balance;			//잔고
	
	//생성자
	public Transaction(String kind, long amount, long balance) {//가 나다라
		//
		super();
		Calendar cal = Calendar.getInstance(); 
		this.transactionDate = cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONDAY)+1) + "월" + cal.get(Calendar.DAY_OF_MONTH) + "일";
		this.transactionTime = cal.get(Calendar.HOUR) + "시" + cal.get(Calendar.MINUTE) + "분";
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "[거래금액 : " + amount + ", 잔액 : " + balance + "/" + transactionDate + transactionTime + "]";
	}
}
