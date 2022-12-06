package vscore;

import java.util.*;

public class ScoreImpliment implements Score {
	private Vector<ScoreVO> list = new Vector<>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("\n 자료 추가........\n");
		String hak;

		System.out.print(" 학번 입력 : ");
		hak = sc.next();

		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("이미 등록된 학번 입니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());

		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학 : ");
		vo.setMatt(sc.nextInt());
		list.add(vo);

		System.out.println("자료 추가가 완료 되었습니다.");

	}

	@Override
	public void update() {
		System.out.println("\n 자료 수정.......");
		System.out.print("수정할  학번");
		String hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 학번이 없습니다. \n");
			return;
		}

		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());

		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학 : ");
		vo.setMatt(sc.nextInt());
		System.out.println("자료가 수정되었습니다. ");
	}

	@Override
	public void delete() {

		System.out.println("\n 자료 삭제");
		String hak;
		System.out.print("삭제할 학번 입력 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo == null) {
			System.out.println(" 중복된 자료가 없습니다.");
		}
		list.remove(vo);
		System.out.println("자료가 삭제되었습니다.");
	}

	@Override
	public void listAll() {
		System.out.println("\n전체 목록 출력");
		Iterator<ScoreVO> it = list.iterator();

		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
	}

	@Override
	public void searchHak() {
		System.out.println("\n 학번으로 검색...........");
		String hak;
		System.out.println("검색할 학번 : ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo != null) {
			 System.out.println(vo); // toString 메소드를 호출한 것과 같다.
		}
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("\n 이름으로 검색...........");
		String name;
		System.out.println("검색할 이름 : ");
		name = sc.next();

		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) {
				System.out.println(vo);
			}
		}
		System.out.println();
	}

	// Vector안에 정보를 읽어오는 기능 readScore(String hak)
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for (ScoreVO temp : list) {
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}
}
