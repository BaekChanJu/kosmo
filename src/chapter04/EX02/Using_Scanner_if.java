package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		//스캐너로 정수값을 인풋받아서 /평균은 더블로 계산후/이프문 만들기
		// 문제 : Scanner로 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋받습니다
		// if 문을 사용해서 평균이 90점이 넘으면 "A"학점
		//80이상 B , 70점이상 C, 60점이상 D 학점 아니면 나머지는 F학점
		
		System.out.println("각 과목 점수를 입력해주세요");
		Scanner sc = new Scanner(System.in); 
		
		int aa, bb, cc, dd, ee; //초기값설정 해주고
		
		
		 aa = sc.nextInt(); //넥스트 인트만들어주고
		 bb = sc.nextInt();
		 cc = sc.nextInt();
		 dd = sc.nextInt();
		 ee = sc.nextInt();
		
		System.out.println("국어" + aa + "영어" + bb + "수학" + cc + "과학" 
				+dd+"음악"+ee);
		
		double ac = (aa + bb + cc + dd + ee) /5.0;
		System.out.println("평균값은" + ac);
		
		if(ac>90.0) {
			System.out.println("a학점입니다");
		}else if(ac>80.0){
			System.out.println("b학점입니다");
		}else if(ac>70.0) {
			System.out.println("c학점입니다");
		}else if(ac>60.0) {
			System.out.println("d학점입니다");
		}else {
			System.out.println("f 입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
