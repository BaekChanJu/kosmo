package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		//이중 for 문을 사용해서 구구단 출력 1단부터 9단까지
		for(int i =1; i<10; i++) {
			System.out.println(i + "단을 출력합니다");
			for(int j =1; j<10; j++) {
				System.out.print(i + "x" + j + "=" + i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		
		//1단 ~ 19단까지 3의 배수단만 출력 !
		
		
		for(int i=1; i<20; i++)  {
			for(int j=1; j<20; j++) {
				if(i%3 == 0) {
					System.out.print(i + "x" + j + "=" + i*j);
					System.out.println(i*j);
				}
				System.out.println();
			}
		   
		}
		
		//스캐너에서 입력받은 단만 출력 (1~9단)
		//츨력할 단을 입력하세요!
		
		System.out.println("출력할 단을 입력하세요!");
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for(int j =1; j<10; j++) {
				System.out.println(i + "x" + j + "=" +i*j);
			}
		sc.close();
		}

	}

