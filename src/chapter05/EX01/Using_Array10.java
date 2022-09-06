package chapter05.EX01;

import java.util.Scanner;

public class Using_Array10 {

	public static void main(String[] args) {
		//국어 80 영어 50 수학 77 과학 88 > 전체라인을 인풋받아 공백기준으로 
				//잘라서 배열에 저장
		
		// tip 국어가 인덱스0 80은1 영어는2 50은3 수학은5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("각 과목과 점수를 공백기준 구분해서 넣으셈");
		String s = sc.nextLine();
		
		System.out.println(s);
		
		//공백을 기준으로 골라서 배열에 저장하기

		String[] arr; //배열 일단 선언만 먼저해줌 자른거임
		
		arr = s.split(" "); // 지금 스캐너로 인풋받은값은 s로 들어갔다
		//스플리트는 자른다는건데 지금 공백 " " 을기준으로 잘자서
		//배열 안에 저장을한다는 의미이다
		
		//arr배열의 전체를 출력
		for( int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//지금 공백기준으로 잘려서 들어가서 국어 80 영어 50 이렇게 쭉들어갔다
				}
		
		//배열의 홀수방의 값을 가지고 와서 (위에서 홀수값이면 점수값이죠?)(정수를) 
		//합과 평균을 구한다
		int a; //과목의 점수를 담는 변수 먼저선언
		int sum = 0; //과목의 합을 구하는 변수 먼저선언
		int count=0;
		
		for(int i =0; i<arr.length; i++) {
			if( i %2 != 0) { //홀수가져오기
				a=Integer.parseInt(arr[i]); //홀수방의 값을 a에 저장 변환해주고
				sum += a;
				
				count++; // 평균구하려고 선언
			}
		}
		System.out.println("과목의 합 : " + sum);
		System.out.println("과목의 평균 : " + sum/(double)count);
	}
}


