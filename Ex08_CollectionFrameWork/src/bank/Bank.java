package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> alist;
	private int totalAccount;
	
	//������
	public Bank() {
		this.alist = new ArrayList<Account>();
		this.totalAccount = 0;
	}
	
	//���� ����
	public void addAccount(String accountNo, String name) {
		alist.add(new Account(accountNo, name));
		totalAccount++;
	}
	
	//���¸� ã�´� ( ���¹�ȣ�� )
	public Account getAccount(String accountNo) {
		Account account = null;
		for(Account e : alist)
			if(accountNo.equals(e.getAccountNo())) account = e;
		return account;
	}
	//���¸� ã�´� ( ������ ������ )
	public List<Account> findAccounts(String name) {
		List<Account> aclist = null;
		for(Account e : alist) {
			if(name.equals(e.getName())) aclist.add(e);
		}
		return aclist;
	}
	//���� ��� ����
	public List<Account> getAccounts() {
		return alist;
	}
	//������ �� ���¼� ����
	public int getTotalAccount() {
		return this.totalAccount;
	}
}
