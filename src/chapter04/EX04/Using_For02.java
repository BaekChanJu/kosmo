package chapter04.EX04;

import java.util.Scanner;

public class Using_For02 {

	public static void main(String[] args) {
		//for 문을 사용해서 스캐너로 5개의 값을 인풋받아 출력
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		for(int i = 0; i<5; i++) {
			s = sc.next();
			System.out.println(s); // s는 스캐너로 인풋을 5번 받는다 0일떄부터 4일떄까지 /총5번출력가능
		}
		
		//for문 내에서 변수 선언시  for문 안에서만 사용이 가능하다 !
		// - 클래스에서 재사용이 가능 i는 저 for문 내에서만 사용가능하지 나오면 안된다
		//하지만 밖에서 i를 재선언해서 재사용 할 수 있다 ! 전역 지역변수 개념
		
		int a; //for문 밖에서 선언되있는 전역반수 for밖에서도 내에서도 모두 사용이 가능
		a=0;
		
		for(int i=0; i<3; i++) { //0 1 2
			//요 i는 for문 내에서만 사용가능한 지역변수
			System.out.println(i);
			System.out.println(a);
		}
		System.out.println(a); //a는 전역변수로 선언했기에 안에서도 밖에서도 사용할 수 있다
	}

}
