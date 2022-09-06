package chapter04.EX02;

import java.util.Scanner;

public class UsingScanner02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
	  System.out.println("이름(문자열), 나이(정수), 몸무게(실수)"
				+ "공백으로 구분해서 입력하세요.");
		
		String aa = sc.next(); //문자열
		int bb = sc.nextInt(); //정수
		double cc =sc.nextDouble(); //실수
		
		//System.out.printf("당신의 이름은 %s 이고 나이는 %d 이고,"
				//+ "당신의 몸무게는 %f 입니다.",aa,bb,cc); 
	
		//System.out.print("당신의 이름은" + aa +"이고 나이는" + bb +"살 이고, 당신의"
				//+ "몸무게는" + cc +"kg 입니다 \n" );

		
		
		
		
		
		
	}

}
