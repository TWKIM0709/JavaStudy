package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> alist;
	private int totalAccount;
	
	//생성자
	public Bank() {
		this.alist = new ArrayList<Account>();
		this.totalAccount = 0;
	}
	
	//계좌 생성
	public void addAccount(String accountNo, String name) {
		alist.add(new Account(accountNo, name));
		totalAccount++;
	}
	
	//계좌를 찾는다 ( 계좌번호로 )
	public Account getAccount(String accountNo) {
		Account account = null;
		for(Account e : alist)
			if(accountNo.equals(e.getAccountNo())) account = e;
		return account;
	}
	//계좌를 찾는다 ( 소유자 명으로 )
	public List<Account> findAccounts(String name) {
		List<Account> aclist = null;
		for(Account e : alist) {
			if(name.equals(e.getName())) aclist.add(e);
		}
		return aclist;
	}
	//계좌 목록 리턴
	public List<Account> getAccounts() {
		return alist;
	}
	//은행의 총 계좌수 리턴
	public int getTotalAccount() {
		return this.totalAccount;
	}
}
