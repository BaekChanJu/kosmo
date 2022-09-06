package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//탁구, 야구, 축구, 농구, 씨름
		//각 운동 종목의 구성원 수를 합한것과 평균
		
		String s;
		
		String arr[];
		int a; //인원 저장공간
		int sum = 0; //더한값 초기값
		int count =0; //평균구할때 쓸거임
		
		
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으셈");
			s=sc.nextLine();
			arr = s.split(" ");
			if(s.equals("그만")) {
				break;
			}
			for(int i=0; i<arr.length; i++) {
				if(i%2 != 0) {
					a =Integer.parseInt(arr[i]);
					sum+=a;
					count++;
				}
			}
			
			
			System.out.println("구성원의 합 : " + sum);
			System.out.println("구성원의 평균 : "  + sum/(double)count);
			
		}while(true);
		System.out.println("프로그램을 종료합니다");

	}

}
