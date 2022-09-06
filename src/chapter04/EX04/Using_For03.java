package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		
		
		//정수 (음수, 양수) 을 스캐너로 5개 인풋받아서 
		//양수만 더한 값 과 평균값을 출력하세요
		//찬주풀이
		
		//System.out.println("숫자를 입력하세요");
		//Scanner sc = new Scanner(System.in);
		
		//int sum = 0;
		//int num;
		
		//for(int i=0; i<5; i++ ) {
			//num=sc.nextInt();
			//if(num >0) {
				//sum += num;
			//}			
		//}
		
		//double avg = sum/5;
		
		//System.out.println("양수의 합은" + sum +  "입고 평균값은" + avg + "입니다" );
		
		//선생님 풀이
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int sum1 = 0;
		int count = 0;
		
		for(int i=0; i<5; i++ ) {
			int num =sc.nextInt();
			sum1 += num;
			if(num>0) {
				sum += num;
				count++;
			}
		}
		
		System.out.println("양수의 합 :" +  sum + "양수의 평균 : " + sum/(double)count);
		System.out.println("모든수의 합은 : " + sum1 + "모든수의 평균" +sum1/(double)count);

	}

}
