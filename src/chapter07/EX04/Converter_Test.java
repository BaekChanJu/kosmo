package chapter07.EX04;

import java.util.Scanner;

class Converter{ //환율을 계산하는 클래스
	
	//필드 환율을 저장하는 변수선언
	double rate; // 1377.40;
	
	//메소드 생성 ( 달러를 인풋받아서 원화를 반환) toKWR 이름으로
	double toKWR(double dollor) { //달라인풋받은값에 환율을 곱해서 리턴해줌
		return dollor * rate;
		
	}
	
	//메소드생성 (원화를 인풋받아서 달러를 출력)
	double toDollor(double won) { 
		return won/rate;
		
		}
		
	//setRate() 메소드 생성 : 겟셋 활용 직접만들기
		void setRate(double rate) {
				this.rate = rate;
				}
}

public class Converter_Test {

	public static void main(String[] args) {
		
		//환율을 검색해서 오늘 환율 알아보기
				//객체 생성후 스캐너로 환율을 입력받아서 setRate()에 메소드 저장후 
				//원화 100만원이 몇 달라인지 출력
				//달러100을 넣어서 원화 얼마인지 출력
		
		
		System.out.println("1달러에 대한 오늘 환률을 입력하세요");
		Scanner sc = new Scanner(System.in);
		double rate = sc.nextDouble();
		
		//객체생성
		Converter converter = new Converter(); //기본생성자 호출 <생략됨>
		
		//스캐너로 받은 rate 변수의 값을 setter 주입
		converter.setRate(rate);
		
		//100만원 은 몇달러일까?
		System.out.println("100만원은" + converter.toDollor(100000)+ "$");
		
		
		//100$ 은 몇만원일까
		System.out.println("100은$" + converter.toKWR(100000)+ "만원");
		
		
		
		
		//1.printf 로 하는 방법
		System.out.println("==1번 소수점 2쨰 자리까지 잘라서출력 printf 방법");
		
		System.out.printf("원화 100만원은 %.2f 달러입니당",converter.toDollor(100000));
		
		//2. 변수에 더블값을 할당후 소숫점 2자리까지 변환해서 출력
			//String 으로 변환후 per2 의 변수의 값을 소수점 2자리까지
			//출력후 다시 더블형을 전환
		System.out.println("예시");
		double per2 = 3.141592;
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
		//실수를 변슈에 할당한후 소숫점 2자리까지 자른후 다시 더블에 저장
		double d2 = converter.toDollor(100000);
		double d1= Double.parseDouble(String.format("%.2f", d2));
		System.out.println(d1);
		
		
		
		
		
		

	}

}
