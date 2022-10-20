package bank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
        // ������ ���¸� ����Ѵ�.
        bank.addAccount("1111", "kim");
        bank.addAccount("2222", "lee");
        bank.addAccount("3333", "park");
        bank.addAccount("4444", "hong");
        bank.addAccount("5555", "hong");
        bank.addAccount("6666", "kim");
        bank.addAccount("7777", "lee");
        
        //������ ���¹�ȣ�� ���¸� ã�� �� �ִ�.
        System.out.println("***���¹�ȣ�� 2222�� ���� ��ȸ***");
        Account getAccount = bank.getAccount("2222");
        System.out.println(getAccount);
        
        //������ ������ �����ڸ����� ���¸� ã�� �� �ִ�.
        System.out.println("\n***�̸��� hong�� ����� ���� ��ȸ***");
        List<Account> findAccount = bank.findAccounts("hong");
        for(Account a : findAccount) {
            System.out.println(a);
        }
        
        //������ ��� ������ ����� �� �� �ִ�.
        System.out.println("\n***��� ���� ��� ��ȸ***");
        List<Account> accounts = bank.getAccounts();
        for(Account a : accounts) {
            System.out.println(a);
        }
        
        //���´� �Ա�, ��� ��ɰ� �ܰ� Ȯ�� ����� �ִ�.
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 5���� �Ա�***");
        Account kim = bank.getAccount("1111");
        kim.deposit(50000);
        System.out.println(kim);
        
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 2���� ���***");
        kim.withdraw(20000);
        System.out.println(kim);
        
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� 5000�� ���***");
        kim.withdraw(5000);
        System.out.println(kim);
        
        System.out.println("\n***���¹�ȣ�� 1111�� ������ �ܰ� Ȯ���ϱ�***");
        System.out.println("kim ���� \'1111\' ���� �ܾ�: " + kim.getBalance());
        
        //���¿��� �ܾ��� ��ȭ�� ���� �� ���� ����� ���� ��ϵȴ�.
        //����� ���� �ŷ�����, �ŷ��ð�, �Ա�/���, �ݾ�, �ܾ����� �����ȴ�.
        System.out.println("\n***���¹�ȣ�� 1111�� ������ �ŷ����� Ȯ���ϱ�***");
        List<Transaction> kimTransaction = kim.getTransaction();
        for(Transaction e : kimTransaction) {
        	System.out.println(e);
        }
//        for(int i = 0; i <= kim.getNum(); i++) {
//            System.out.println(kimTransaction.get(i));
//        }
        
        System.out.println("\n***���¹�ȣ�� 1111�� ���¿� �ܰ� �ʰ��ؼ� ��ݽõ��غ���***");
        kim.withdraw(100000);
	}

}