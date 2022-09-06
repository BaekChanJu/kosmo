package chapter04.EX05;

import java.util.Scanner;

public class Using_While02 {

	public static void main(String[] args) {
		//"그만" 할때까지 정수 값을 넣어서 합계와 평균균구하기
		
		//넥스트라인과 스플리터 사용 / 공백으로 정수값을 한번에 다받아라
		//String s = sc.nectLinr(); 인풋받아라
		// " " 기준으로 잘라서 배열에저장하고
		//문자형을 정수로 바꿔라
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		String arr[];
		
		int a; // 숫자를 저장할공
		int sum = 0; //합을 담을공간
		int count = 0;//평군낼때
		
		do {
			System.out.println("그만 할때까지 합과 평균규할꺼임");
			s= sc.nextLine();
			if(s.equals("그만")) {
				break;
		    }
			arr = s.split(" ");
			for(int i = 0; i<arr.length; i++) {
				a=Integer.parseInt(arr[i]);
				sum =+a;
				count++;
			}
			System.out.println("정수의 합 : " + sum);
			System.out.println("정수의 평균 : " + sum/(double)count);
		}while(true);
		System.out.println("시스템 종료");
	}
}
		
