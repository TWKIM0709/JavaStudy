package kr.or.tajo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TajoSystem {
	//������ ���, ó��Ŭ���� ��
	//��ĳ�ʴ� Utils Ŭ������ static���� �ִ�.
	private Map<String, User> userList; //�������
	private Map<String, Product> productList; //�����
	private List<Log> logList; //�뿩�������
	private FileIO file; //���� ����� ����
	private String userId; //�α��ε� ���� ID
	ProductProcess process;
	
	//������
	public TajoSystem() {
		this.userList = new HashMap<String, User>();
		this.productList = new HashMap<String, Product>();
		this.logList = new ArrayList<Log>();
		process = new ProductProcess(productList);
		file = new FileIO();
	}
	
	//run �Լ�:����ȣ
	public void run() {
		File filelute = new File(Utils.BASICPATH);
		if (filelute.mkdir()) {//������ ���� ��� ���� ����
			try {
				filelute.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			file.userListSave(null);
			file.productListSave(null);
			file.logListSave(null);
			file.systemInfoListSave(null);
		}else {//���ϵ� ���� �ҷ�����
			file.userListLoad();
			file.productListLoad();
			file.logListLoad();
			file.systemInfoListLoad();
		}
		//���۸޴�:����ȣ
		int key = 0;
		boolean auto = true;
		while (auto) {
			switch (key) {//UserManagement �α���, ȸ������ ��� ���
			case 1:
				break;
			case 2:
				break;
			case 3:
				System.exit(0);
				break;
			}
			if(!userList.isEmpty()) {
				break;
			}
		}
		if(userList.get(userId).isGrade()) {
			//�������� ���:����ȣ
			int menu = 0;
			while ((menu = TajoPrint.adminMenu()) != 0) {
				switch (menu) {
				case 1://1. �ý��� ��ȸ
					TajoPrint.searchMenu();
					break;
				case 2://2. ������
					TajoPrint.ManagementProductMenu();
					break;
				}
			}
		}else {
			//������ ���:����ȣ
			int menu = 0;
			while ((menu = TajoPrint.userMenu()) != 0) {
				switch (menu) {
				case 1://1. �뿩�ϱ�
					TajoPrint.productListPrint(productList,1);
					break;
				case 2://2. �ݳ��ϱ�
					TajoPrint.productListPrint(userList.get(userId)); //������ �뿩���� ��� ��� ���
					System.out.print("����ȣ�� �Է����ּ��� > ");
					String inputNum = Utils.scanner.nextLine(); //����ȣ �Է¹���
					
					//�ݳ��Լ�
					Log log = process.returnProduct(userList.get(userId), productList.get(inputNum));
					
					if(log != null) {
						//�α� ��� �߰�
						//���Ͽ� ���
					}
					
					break;
				case 3://3. ����
					System.exit(0);
					break;
				}
			}
		}
			
			
			
	}//run end:����ȣ
	public static void main(String[] args) {
		new TajoSystem().run();
	}
}
