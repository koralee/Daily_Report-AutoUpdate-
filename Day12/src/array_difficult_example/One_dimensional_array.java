package array_difficult_example;

import java.io.*;
import java.nio.Buffer;

public class One_dimensional_array {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (args.length == 0) {
			System.out.println("USage : java Exam01 subject1 subject2 ....");
			System.exit(0);
		} // args.length == 과목수(과목명)

		System.out.print("이름 입력 : ");
		String name = br.readLine();

		String[] subject = new String[args.length];
		// args.length = 과목명을 subject로 옮긴다.
		for (int i = 0; i < args.length; i++) {
			subject[i] = args[i];
			// subject.length = 과목수
			// System.out.print(subject[i]+"\t");
		}
		System.out.println();
		int jumsu[] = new int[subject.length + 1]; // 과목명 다음의 배열의 공간에 총합 점수를 넣을 공간을 할당.

		for (int i = 0; i < jumsu.length - 1; i++) {  //jumsu.length - 1  = 3   
			System.out.print(subject[i] + " 점수 : ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length - 1] += jumsu[i]; // sum[3]에 sum[i] 값을 누적  이건 총합
		}
		
		// System.out.println(sum[sum.length-1]);
		float avg = jumsu[jumsu.length - 1] / (float) subject.length; // sum[3] / 과목수 (평균 공식)
		// System.out.println(sum[sum.length - 1]);
		avg = (int) ((avg + 0.005) * 100) / 100.0f; // 정밀한 평균 구하는 공식
		// System.out.printf("%.2f",avg); //same
		// System.out.println(avg);
		
		char grade = '\0';  // 학점 null로 초기화
		switch ((int) (avg / 10)) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'B';
			break;
		case 8:
			grade = 'C';
			break;
		case 7:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println();
		
		//성적 출력
		System.out.println("*************** 성적표 ***************");
		System.out.print("이름\t");
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
			}
		System.out.println(" 총점 \t 평균\t 학점");
		System.out.print(name+"\t");
		
		for(int i=0;i<subject.length+1;i++) {
			System.out.print(" "+jumsu[i]+"\t");
			}
		System.out.println(" "+avg+"\t"+grade);
		System.out.println("************************************");
		}
	}

