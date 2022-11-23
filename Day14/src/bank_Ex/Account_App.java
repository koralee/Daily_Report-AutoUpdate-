package bank_Ex;

import java.util.*;

public class Account_App {

	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];

	//메인문
	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 계좌예금 | 4. 계좌출금 | 5. 종료");
			System.out.println("------------------------------------------------------------");

			System.out.print("은행 업무선택 : ");
			int selecNo = sc.nextInt();
			System.out.println();
			if (selecNo == 1) {
				System.out.println("계좌생성");
				createAc();
			} else if (selecNo == 2) {
				System.out.println("계좌목록");
				System.out.println("계좌번호	    	소유주		잔고");
				accountList();
			} else if (selecNo == 3) {
				System.out.println("계좌예금");
				deposit();
			} else if (selecNo == 4) {
				System.out.println("계좌출금");
				withdraw();
			} else if (selecNo == 5) {
				run = false;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		System.out.println("은행업무 종료! 꺼져~!");
	}

	// 계좌생성
	private static void createAc() {

		System.out.print("계좌번호 입력 : ");
		String Ac = sc.next();
		System.out.print("계좌 예금주 입력 : ");
		String owner = sc.next();
		System.out.print("계좌 초기 금액 입력 : ");
		int balance = sc.nextInt();

		Account newAccount = new Account(Ac, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	// 계좌 목록 보기
	private static void accountList() {

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.println(account.getAc() + "		" + account.getOwner() + "		" + account.getBalance());
			}
		}
	}

	// 예금
	private static void deposit() {
		System.out.print("계좌번호 입력 : ");
		String Ac = sc.next();
		System.out.print("입금 금액 입력 : ");
		int money = sc.nextInt();

		Account account = findAccount(Ac);
		if (account == null) { // 계좌가 없을 경우
			System.out.println("결과 : 입금계좌가 없습니다.");
			return;
		}
		System.out.println("결과 : " + money + "원이 입금완료 되었습니다.");
		account.setBalance(account.getBalance() + money);// 잔고에 돈을 누적
		System.out.println("입금 후 잔액 : " + account.getBalance() + "원");
	}

	// 출금
	private static void withdraw() {
		System.out.print("계좌번호 입력 : ");
		String Ac = sc.next();
		System.out.print("출금 금액 입력 : ");
		int money = sc.nextInt();
		Account account = findAccount(Ac);
		if (account == null) { // 계좌가 없을 경우
			System.out.println("결과 : 출금계좌가 없습니다.");
			return;
		}
		System.out.println("결과 : " + money + "원이 출금완료 되었습니다.");
		account.setBalance(account.getBalance() - money);// 잔고에 돈을 누적
		System.out.println("출금 후 잔액 : " + account.getBalance() + "원");
	}

	// Account 배열에서 Ac와 동일한 Account 객체 찾기
	private static Account findAccount(String Ac) { //반환형이 Account 메소드
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dataAc = accountArray[i].getAc();
				if (dataAc.equals(Ac)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	} // End findAccount
}
