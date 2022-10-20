package bank;

import java.util.Calendar;

public class Transaction {
	private String transactionDate;	//�ŷ���
	private String transactionTime;	//�ŷ��ð�
	private String kind;			//����(��-���)
	private long amount;			//�ŷ��ݾ�
	private long balance;			//�ܰ�
	
	//������
	public Transaction(String kind, long amount, long balance) {//�� ���ٶ�
		//
		super();
		Calendar cal = Calendar.getInstance(); 
		this.transactionDate = cal.get(Calendar.YEAR) + "��" + (cal.get(Calendar.MONDAY)+1) + "��" + cal.get(Calendar.DAY_OF_MONTH) + "��";
		this.transactionTime = cal.get(Calendar.HOUR) + "��" + cal.get(Calendar.MINUTE) + "��";
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "[�ŷ��ݾ� : " + amount + ", �ܾ� : " + balance + "/" + transactionDate + transactionTime + "]";
	}
}
