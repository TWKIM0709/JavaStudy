package kr.or.tajo;

import java.util.Map;

public class UserManagement {
	Map<String, User> userList;

	public UserManagement(Map userList) {
		this.userList = userList;
	}

	// 회원가입 함수:조혜진
	public boolean userSignUp() {
		// 파라미터 받아서 조건확인(중복)확인하고 return
		String idregix = Utils.REGIXID;// 아이디 정규식
		String pwregix = Utils.REGIXPASSWARD;// 비밀번호 정규식
		String id = "";
		String pw = "";
		String name = "";
		boolean result = true;

		while (result) {
			System.out.println("아이디를 입력해주세요 : ");
			id = Utils.scanner.nextLine();

			if (!(userList.containsKey(id))) {// 아이디 중복 체크
				if (!id.matches(idregix)) {// 아이디 정규식 체크
					System.out.println("올바른 형식으로 입력해주세요.");
					continue;
				}

			} else {
				System.out.println("이미가입된 아이디 입니다.");
				continue;
			}
			System.out.println("비밀번호를 입력해주세요.");
			pw = Utils.scanner.nextLine();

			if (!pw.matches(pwregix)) {// 비밀번호 정규식 체크
				System.out.println("올바른 형식으로 입력해주세요.");
				continue;
			}
			System.out.println("비밀번호 재입력");
			String pw2 = Utils.scanner.nextLine();

			if (!pw2.equals(pw)) {// 비밀번호 재확인 체크
				System.out.println("비밀번호가 그 전과 같지 않습니다.");
				continue;
			}
			System.out.println("이름을 입력해주세요 :");
			name = Utils.scanner.nextLine();
			break;

		}

		if (result) {
			userList.put(id, new User(id, pw, name, false));
			System.out.println("회원가입을 축하드립니다.");

		} else {
			System.out.println("회원가입에 실패했습니다.");
		}

		return result;
	}// userSignUp end

	// 로그인 함수:조혜진
	public String userSingIn() {
		// 파라미터 받아서 비교하고 결과 return
		boolean result = true;
		int cnt = 0;
		String id = "";

		while (result) {
			System.out.println("아이디를 입력해주세요 : ");
			id = Utils.scanner.nextLine();
			if (!(userList.containsKey(id))) {
				System.out.println("아이디가 일치하지 않습니다.");
				cnt++;
				continue;
			}

			System.out.println("비밀번호를 입력해 주세요 : ");
			String pw = Utils.scanner.nextLine();
			if (!(userList.get(id).getPassword().equals(pw))) {
				System.out.println("비밀번호를 잘못 입력하셨습니다.");
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

	// 회원정보업데이트: 조혜진
	public Map userUpdate(Map<String, User> userList, String userId) {
		String pwregix = Utils.REGIXPASSWARD;
		while (true) {
			System.out.println("비밀번호를 입력하세요 :");
			String pw1 = Utils.scanner.nextLine();
			if(pw1.equals(userList.get(userId).getPassword())) {
			if ((userList.containsKey(userId))) {
				System.out.println(userList.get(userId).toString());
				System.out.println("수정을 원하시는 것을 선택해주세요 ");
				System.out.println("1.비밀번호, 2.이름, 3.종료");
				String menu = Utils.scanner.nextLine().toLowerCase();

				switch (menu) {
				case "1":
					System.out.println("변경하실 비밀번호를 입력해주세요");
					String pw = Utils.scanner.nextLine();

					if (!pw.matches(pwregix)) {// 비밀번호 정규식 체크
						System.out.println("올바른 형식으로 입력해주세요.");
						continue;
					}
					System.out.println("비밀번호 재입력");
					String pw2 = Utils.scanner.nextLine();

					if (!pw2.equals(pw)) {// 비밀번호 재확인 체크
						System.out.println("비밀번호가 그 전과 같지 않습니다.");
						continue;

					} else {
						userList.get(userId).setPassword(pw2);
						System.out.println("변경이 완료 되었습니다.");
					}
					break;

				case "2":
					System.out.println("변경하실 이름을 입력헤주세요 : ");
					String name = Utils.scanner.nextLine();
					userList.get(userId).setName(name);
					break;
				case "3":
					System.out.println("종료되었습니다.");
					break;
				default:
					System.out.println("올바른 값을 입력해주세요.");
					break;
				}

			} else {
				System.out.println("올바른 아아디를 입력해주세요");
				continue;
			}
			}else {
				System.out.println("비밀번호를 다시 입력해수세요");
				continue;
			}
			return userList;
		}
	}// userUpdate end

	// 회원탈퇴 : 조혜진
	public Map userDelete(Map<String, User> userList, String userId) {
		String input = null;
		System.out.println("비밀번호를 입력해주세요 :");
		String pw= Utils.scanner.nextLine();
		if(pw.equals(userList.get(userId).getPassword())) {
			if ((userList.containsKey(userId))) {
				System.out.println(userList.get(userId).toString());
				while (true) {
					System.out.println("계정을 삭제하시겠습니까? (Y/N)");
					input = Utils.scanner.nextLine().toLowerCase();
	
					if (!input.equals("y") && !input.equals("n")) {
						// y나 n이 아닌 다른 값 입력
						System.out.println("올바른 값을 입력해주세요.");
						continue;
					}
					break;
				}
				if (input.equals("y")) {
					userList.remove(userId);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("삭제 취소되었습니다.");
				}
			} else {
				System.out.println("없는 아이디 입니다.");
			}
		}else {
			System.out.println("올바른 비밀번호를 입력하세요.");
		}
		return userList;
	}// userDelete end

}