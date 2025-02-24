package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	// 속성 (필드 == 멤버변수)
	private Scanner sc = new Scanner(System.in);

	// 회원가입한 사람의 정보를 저장해둘 참조변수..
	// Member 5칸짜리 객체 배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인 한 회원 의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;

	public MemberService() {// 기본생성자

		// memberArr 배열 0 , 1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 20, "강원");

	}

	// 기능
	public void displayMenu() {
		// 메뉴 선택용 변수
		int menuNum = 0;

		// 무조건 한번은 반복
		do {
			System.out.println("====회원 정보 관리 프로그램 v2 ==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원검색(지역)");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴입력: ");
			menuNum = sc.nextInt();
			// 입력 버퍼 에 남은 개핵 문자 제거
			sc.nextLine();

			switch (menuNum) {
			case 1:
				System.out.println(signUp());
				break;
			case 2:
				System.out.println(login());
				break;
			case 3:
				System.out.println(selectMember());
				break;
			case 4:
				int result = updateMember();
				if(result == -1) {System.out.println("로그인후 이용바랍니다.");
				
				}else if (result == 0) {
					System.out.print("회원정보 수정실패(비밀번호가 맞지 않습니다)");
					
				}else {
					System.out.print("회원정보가 변경되었습니다.");
				}
					
				break;
			case 5:
				searchRegion();
				break;
			case 0:
				System.out.println("프로그램종료");
				break;
			default:
				System.out.println("잘못 입력하셧습니다. 다시 입력해주세요");

			}

		} while (menuNum != 0);

	}

	// memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {

		// memberArr 배열을 0인덱스부터 끝까지 접근해서
		// 참조하는 값이 null 인 경우의 인덱스를 반환
		for (int i = 0; i < memberArr.length; i++) {

			if (memberArr[i] == null) {
				return i;
				// 현재 메서드 종료하고 호출한곳으로 i값을 가지고 돌아감
			}
		}
		// for 문을 수행했지만 return 이 되지 않은 경우 해당위치 코드 수행된다!
		// for문에서 return 되지 않았다 == 배열에 빈칸이 없다.
		return -1;
	}

	// 회원 가입용 메서드
	public String signUp() {

		System.out.println("\n=====회원 가입 ==========");

		// memberArr 배열에 빈자리가 있는지 확인
		// 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// -> 빈공 간의 인덱스 번호를 얻어오기 ? ? ?
		int index = emptyIndex(); // memberArr배ㅔ열에서비어있는 인덱스 반환받음
		// 없다면 -1 반환

		if (index == -1) {
			// 비어있는 공간없음 - > 회원가입 불가
			return "회원 가입 불가능합니다.(인원수초과)";
		}

		// 회원 가입 가능일때
		System.out.print("아이디: ");
		String memberId = sc.next();

		System.out.print("비밀번호: ");
		String memberPw = sc.next();

		System.out.print("비밀번호 확인: ");
		String memberPw2 = sc.next();

		System.out.print("이름: ");
		String memberName = sc.next();

		System.out.print("나이: ");
		int memberAge = sc.nextInt();

		System.out.print("지역: ");
		String region = sc.next();

		// 비밀번호 , 비밀번호 확인이 일치 하면 회원 가입 진행
		// 일치하지 않으면 회우너가입 실패

		if (memberPw.equals(memberPw2)) {// 일치하는 경우

			// 새로운 Member 객체 생성해서 할당된 주소를
			// memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);

			return "회원가입성공!!";

		} else {// 불일치 경우
			return "회원가입 실패 !! (비밀번호불일치) ";
		}

	}

	// 로그인 메서드
	public String login() {

		// 3) 로그인 성공/실ㅂ패 여부에 따라 결과값 반환

		// -> 로그인 실패 : 아이디 또는 비밀번호가 일치하지 않습니다.
		System.out.println("\n=======로그인========");

		// 1 아이디, 비밀번호 입력받기
		System.out.print("아이디를 입력해주세요 : ");
		String memberId = sc.next();

		System.out.print("비밀번호를 입력해주세요 : ");
		String memberPw = sc.next();

		// 2) memberarr 배열 내 요소를 순서대로 접근하여

		for (int i = 0; i < memberArr.length; i++) {

			if (memberArr[i] != null) { // 2-1 현재 접근한 요소가 null이 아닌지 확인
				// 2-2 회원정보가 있을경우
				// -> 회원정보의 아이디, 비밀번호가 입력받은 아이디 , 비밀번호가 같은지비교
				// 2-3 같다면 로그인 회원정보 객체를 참조할 변수 loginMember에
				// 현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사

				if (memberId.equals(memberArr[i].getMemberId()) && memberPw.equals(memberArr[i].getMemberPw())) {
					loginMember = memberArr[i];
					break;// 더이상 같은 아이디, 비밀번호 없기때문에 효율을 위해 for문종료
				}
			}
		}
		// ->로그인 성공 / 실패 여부에 따라 결과 값반환!
		// - 로그인 성공 : 홍길동님 환영합니다!
		// 로그인 실패 : 아이디 또는 비밀번호가 일치하지 않습니다.
		if (loginMember == null) {
			return "아이디 또는 비밀번호가 일치하지 않습니다.";

		} else {
			return loginMember.getMemberName() + " 님환영합니다. ";
		}

	}

	// 회원검색 (지역) 메서드
	public void searchRegion() {
		System.out.println("\n=========회원검색 (지역)=========");
		System.out.print("검색할 지역을 입력하시요 : ");
		String inputRegion = sc.next();

		boolean flag = true; // 검색결과 신호용 변수
		// 1. memberArr 배열의 모든 요소 순차 접근

		// 2. memberArr[i] 요소가 null 인경우 반복종룍

		// 4. 입력한 지역과 일치하는 회원이 없다면
		// 일치하는 검색결과가 없습니다! 출력
		for (int i = 0; i < memberArr.length; i++) {

			if (memberArr[i] == null) {
				break;
			}

			// 3 . memberArr[i]가 null이 아니라면
			// memberArr[i] 요소에 저장된 지역 (region) 이
			// 입력받은 지역 (inputregion) 같을경우
			// memberArr[i] 요소에 저장된 객체의
			// 회원의 아이디, 이름을 출력
			if (memberArr[i].getRegion().equals(inputRegion)) {

				System.out.printf("아이디 : %s, 이름 :%s\n ", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false;
			}

		}
		if (flag) {
			System.out.println("일치하는 검색결과가 없습니다.");
		}
	}

	// 회원정보 조회메서드명 : selectMember()
	// 반환형 : String

	// ====회원 정보 조회=====
	// 로그인 후 이용바람

	// ====회원 정보 조회=====
	// 이름 " 홍길동
	// 아이디 : user01
	// 나이 : 30
	// 지역: 서울

	public String selectMember() {
		System.out.println("====회원 정보 조회=====");

		if (loginMember == null) {
			return " 로그인 후 이용바람";

		} else {

			System.out.printf("이름 : %s\n아이디 : %s\n나이: %d\n" + "지역: %s", loginMember.getMemberName(),
					loginMember.getMemberId(), loginMember.getMemberAge(), loginMember.getRegion());

			return "";
		}

	}

	// ====회원 정보수정 ===== :

	// 로그인 후 이용바람

	// ======회원 정보수정=====
	// 수정할 이름 입력:

	// updateMember()
	// 반환형: int
	// 로그인이 되어있지 않으면 -1 반환
	// 비밀번호가 다른경우 0반환
	// 비밀번호가 같을경우(수정이이루어짐)

	// public void ex() {
//		System.out.println(Arrays.toString(memberArr));
//	}

	public int updateMember() {
		System.out.println("=========회원 정보 수정 ============");
		
		if (loginMember == null) {
			return -1;

		}
		System.out.print("수정할 이름입력: ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이입력: ");
		int inputAge = sc.nextInt();
		
		System.out.print("수정할 지역입력: ");
		String inputRegion = sc.next();
		
		System.out.print("비밀번호 입력: ");
		String inputPw = sc.next();
		
		if (inputPw.equals(loginMember.getMemberPw()) ) {// 로그인한 회원과 입력받은 비밀번호가 같은지 확인여부
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setRegion(inputRegion);
			return 1;
		}else {
			return 0;
		}
		

	}

}
