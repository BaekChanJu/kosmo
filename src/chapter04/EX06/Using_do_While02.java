package chapter04.EX06;

import java.util.Scanner;

public class Using_do_While02 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);

		
		boolean run = true;
		int nu = 0; // 스캐너로 인풋받는 변수
		
		
		do {
			System.out.println("================================");
			System.out.println("1. 문자열 출력 | 2. 정수출력 | 3. 종료");
			System.out.println("================================");
			System.out.println("원하는 번호를 입력하세요");
			nu = sc.nextInt();
			
			if(nu == 1) {
				System.out.println("1.문자열");
			}else if(nu == 2){
				System.out.println("2.정수출력");
			}else {
				System.out.println("3.종료"); //이거선택하면 무한루프 탈출
				break;
			}
			
		}while(run); // 무한루프 / 계속 물어봄
		System.out.println("프로그램을 종료 합니다.");
	}

}
