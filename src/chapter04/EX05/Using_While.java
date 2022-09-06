package chapter04.EX05;

import java.util.Scanner;

public class Using_While {

	public static void main(String[] args) {
		//스캐너를 이용해서 -1이 될때 까지 정수값을 넣어서 평균계산
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 평균낼때는 몇개 입력되는 지 알아야하니까 카운트 하나설정
		int sum = 0; //입력받은 정수를 모두 더한 값;
		System.out.println("정수를 입력하세요 마지막에 -1로 종료하세요");
		int n = sc.nextInt(); //콘솔에서 정수값을 입력받아 n 변수에 할당해주는것임
		
		
		//반복횟수를 알 수 없는 경우 : while
		while(n != -1) { //입력받은 정수값이 -1이 아니면(트루가되면) while 문을실행
			sum +=n; //sum = sum + n;
			count++; //실헹항때마나 정수값 카운트
			n = sc.nextInt(); // -1이 정수값으로 인풋이 되면 루프를 빠져나오다
			//이걸해줘야지 왜냐면 몇개입력될지도 모르고 지금 나가는 구문도 없으니
			//-1입력하면 빠져나가게 만들어 놓은거다 while 문 자체도 -1을 넣으면 false
		}
		if(count == 0) { //제일처음에 정수값을 -1을 넣은경우겠지? 카운트가 0이니까 한번도안돈거
			System.out.println("입력된 정수가 없습니다.");
		}else { //정수값을 하나이상 넣은경우겠지
			System.out.println("입력된 정수는 : " + count + "개 입니다.");
			System.out.println("입력된 정수의 합은 : " + sum + "입니다");
			System.out.println("평균값은 : " + (double)sum / count + "입니다.");
		}

	}

}
