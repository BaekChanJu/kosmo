package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu = 0;
		
		do {
			System.out.println("============================");
			System.out.println("1.19단 | 2.홀수단 | 3.3의배수단 | 4.종료");
			System.out.println("원하는 숫자를 선택하세요");
			nu = sc.nextInt();
			
			if(nu == 1) {
				System.out.println("19단을 출력합니다");
				for(int i=0; i<20; i++) {
					for(int j=0; j<20; j++) {
						System.out.println(i + "x" + j + "=" + i*j);
					}
				}
			}else if(nu == 2) {
				System.out.println("홀수단을 출력합니다");
				for(int i=1; i<10; i+=2) {
					for(int j=1; j<10; j++) {
						if( i%2 == 0) {
							//~
						}
					}
				}
				
			}else if(nu == 3) {
				System.out.println("3의배수단을 출력합니다");
				for(int i=3; i<20; i+=3) {
					for(int j=1; j<10; j++) {
						System.out.println(i + "x" + j + "=" + i*j);
					}
				}
				
			}else if(nu == 4){
				System.out.println("종료");
				break;
				
			}
		}while(run);
		System.out.println("프로그램을 종료 합니다");

	}

}
