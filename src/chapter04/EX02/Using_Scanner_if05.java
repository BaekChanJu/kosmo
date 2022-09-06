package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
			//나이가 8세 미만이면 :취학전 아동 입장료는 1000원 입니다
		//나이가 14세 미만이면 : 초등학생입니다 입장료는 2000원 입니다
		//나이가 20세 미만이면 : 중고등학생입니다 입장료는 3000원 입니다
		//나이가 20세 이상이면 : 성인입니다 입장료는 4000원입니다
		//스캐너로 나이를 인풋 받아서 출력
		Scanner sc= new Scanner(System.in);
		
		System.out.println("나이가 어떻게 되시나요?");
		
		int age = sc.nextInt();
		int prise = 0;
		
		
	
		if(age<8) {
			System.out.println("취학전 아동입니다");
			prise = 1000;
		}else if(age<14) {
			System.out.println("초등학생입니다");
			prise = 2000;
		}else if(age<20) {
			System.out.println("중고등학생입니다");
			prise = 3000;
		}else {
			System.out.println("성인입니다");
			prise = 4000;
		}
		System.out.println("입장료는" + prise + "원 입니다");
	
		sc.close();
	}

}
