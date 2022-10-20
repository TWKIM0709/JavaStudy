package kr.or.tajo;

import java.util.Map;

public class UserManagement {
	Map<String, User> userList;

	public UserManagement(Map userList) {
		this.userList = userList;
	}

	// ȸ������ �Լ�:������
	public boolean userSignUp() {
		// �Ķ���� �޾Ƽ� ����Ȯ��(�ߺ�)Ȯ���ϰ� return
		String idregix = Utils.REGIXID;// ���̵� ���Խ�
		String pwregix = Utils.REGIXPASSWARD;// ��й�ȣ ���Խ�
		String id = "";
		String pw = "";
		String name = "";
		boolean result = true;

		while (result) {
			System.out.println("���̵� �Է����ּ��� : ");
			id = Utils.scanner.nextLine();

			if (!(userList.containsKey(id))) {// ���̵� �ߺ� üũ
				if (!id.matches(idregix)) {// ���̵� ���Խ� üũ
					System.out.println("�ùٸ� �������� �Է����ּ���.");
					continue;
				}

			} else {
				System.out.println("�̹̰��Ե� ���̵� �Դϴ�.");
				continue;
			}
			System.out.println("��й�ȣ�� �Է����ּ���.");
			pw = Utils.scanner.nextLine();

			if (!pw.matches(pwregix)) {// ��й�ȣ ���Խ� üũ
				System.out.println("�ùٸ� �������� �Է����ּ���.");
				continue;
			}
			System.out.println("��й�ȣ ���Է�");
			String pw2 = Utils.scanner.nextLine();

			if (!pw2.equals(pw)) {// ��й�ȣ ��Ȯ�� üũ
				System.out.println("��й�ȣ�� �� ���� ���� �ʽ��ϴ�.");
				continue;
			}
			System.out.println("�̸��� �Է����ּ��� :");
			name = Utils.scanner.nextLine();
			break;

		}

		if (result) {
			userList.put(id, new User(id, pw, name, false));
			System.out.println("ȸ�������� ���ϵ帳�ϴ�.");

		} else {
			System.out.println("ȸ�����Կ� �����߽��ϴ�.");
		}

		return result;
	}// userSignUp end

	// �α��� �Լ�:������
	public String userSingIn() {
		// �Ķ���� �޾Ƽ� ���ϰ� ��� return
		boolean result = true;
		int cnt = 0;
		String id = "";

		while (result) {
			System.out.println("���̵� �Է����ּ��� : ");
			id = Utils.scanner.nextLine();
			if (!(userList.containsKey(id))) {
				System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
				cnt++;
				continue;
			}

			System.out.println("��й�ȣ�� �Է��� �ּ��� : ");
			String pw = Utils.scanner.nextLine();
			if (!(userList.get(id).getPassword().equals(pw))) {
				System.out.println("��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				cnt++;
				continue;
			}
			if (cnt == 3) {
				result = false;
				break;
			}
			break;
		}

		return id;
	}// userSingIn end

	// ȸ������������Ʈ: ������
	public Map userUpdate(Map<String, User> userList, String userId) {
		String pwregix = Utils.REGIXPASSWARD;
		while (true) {
			System.out.println("��й�ȣ�� �Է��ϼ��� :");
			String pw1 = Utils.scanner.nextLine();
			if(pw1.equals(userList.get(userId).getPassword())) {
			if ((userList.containsKey(userId))) {
				System.out.println(userList.get(userId).toString());
				System.out.println("������ ���Ͻô� ���� �������ּ��� ");
				System.out.println("1.��й�ȣ, 2.�̸�, 3.����");
				String menu = Utils.scanner.nextLine().toLowerCase();

				switch (menu) {
				case "1":
					System.out.println("�����Ͻ� ��й�ȣ�� �Է����ּ���");
					String pw = Utils.scanner.nextLine();

					if (!pw.matches(pwregix)) {// ��й�ȣ ���Խ� üũ
						System.out.println("�ùٸ� �������� �Է����ּ���.");
						continue;
					}
					System.out.println("��й�ȣ ���Է�");
					String pw2 = Utils.scanner.nextLine();

					if (!pw2.equals(pw)) {// ��й�ȣ ��Ȯ�� üũ
						System.out.println("��й�ȣ�� �� ���� ���� �ʽ��ϴ�.");
						continue;

					} else {
						userList.get(userId).setPassword(pw2);
						System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
					}
					break;

				case "2":
					System.out.println("�����Ͻ� �̸��� �Է����ּ��� : ");
					String name = Utils.scanner.nextLine();
					userList.get(userId).setName(name);
					break;
				case "3":
					System.out.println("����Ǿ����ϴ�.");
					break;
				default:
					System.out.println("�ùٸ� ���� �Է����ּ���.");
					break;
				}

			} else {
				System.out.println("�ùٸ� �ƾƵ� �Է����ּ���");
				continue;
			}
			}else {
				System.out.println("��й�ȣ�� �ٽ� �Է��ؼ�����");
				continue;
			}
			return userList;
		}
	}// userUpdate end

	// ȸ��Ż�� : ������
	public Map userDelete(Map<String, User> userList, String userId) {
		String input = null;
		System.out.println("��й�ȣ�� �Է����ּ��� :");
		String pw= Utils.scanner.nextLine();
		if(pw.equals(userList.get(userId).getPassword())) {
			if ((userList.containsKey(userId))) {
				System.out.println(userList.get(userId).toString());
				while (true) {
					System.out.println("������ �����Ͻðڽ��ϱ�? (Y/N)");
					input = Utils.scanner.nextLine().toLowerCase();
	
					if (!input.equals("y") && !input.equals("n")) {
						// y�� n�� �ƴ� �ٸ� �� �Է�
						System.out.println("�ùٸ� ���� �Է����ּ���.");
						continue;
					}
					break;
				}
				if (input.equals("y")) {
					userList.remove(userId);
					System.out.println("�����Ǿ����ϴ�.");
				} else {
					System.out.println("���� ��ҵǾ����ϴ�.");
				}
			} else {
				System.out.println("���� ���̵� �Դϴ�.");
			}
		}else {
			System.out.println("�ùٸ� ��й�ȣ�� �Է��ϼ���.");
		}
		return userList;
	}// userDelete end

}