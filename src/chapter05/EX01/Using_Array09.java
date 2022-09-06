package chapter05.EX01;

import java.util.Scanner;

public class Using_Array09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//한 라인 전체를 통채로 인풋받는법
		// next 와 nextLine 의 차이점
		
		//next 는 // 하나의 단어씩 인풋받는 다 ex)국어
		//nextLine // 통채로 라인까지 받는다 ex)국어 영어 수학 과학
		
		System.out.println("문자열을 입력하세요(라인전체) ");// 
		String s1 = sc.nextLine();
		System.out.println(s1);
		//국어 영어 수학 다나온다
		
		System.out.println("문자열을 입력하세요 (한 단어)");
		String s2 = sc.next();
		System.out.println(s2);
		//국어 영어 이렇게쓰면 국어만 나온다
		
		
		
		
		
		
		
		
		

	}

}
