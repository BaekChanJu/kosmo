package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner {

	public static void main(String[] args) {
		//Scanner : 첫 글자가 대문자로 시작 : 클래스 (객체를 생성하는 틀)
				/* 콘솔을 통해서 값을 받아서 이용 (int, next() 등등)
				 * 공백이나 엔터를 사용해서 여러값 넣을 수 있음
				 * Scanner sc를 사용한 후해는 sc.close() 로 꼭 마무리해줘야함
				 * 
				 * */

				Scanner sc = new Scanner(System.in); // 컨 + 쉬 + o 누르면 자동생성 인포트가
				//Scanner 클래스로 부터 sc라는 객체를 생성함 (콘솔을 통해 인풋받음)
				
				//앞에 sc는 객체 . 뒤에는 함수
				//sc.nextInt() : 객체의 함수(메소드) 
				
				System.out.println("반드시 정수를 입력하세요");
				int a =sc.nextInt(); //콘솔에서 정수값을 받아서 변수 a에 할당
				
				System.out.println("변수 a 를 출력: " + a);
				
				//반드시 정수를 입력하세요가 먼저 출력되고 
				//넥스트인트에 값을 받아서 a에 대입을 시켜주고 출력이된다 / 정수 안넣으며 에러난다
				System.out.println("=====================");
				
				//정수입력은 넥스트인트, 문자열입력은 넥스트
			
				
				
				
				
				
				System.out.println("반드시 문자열을 입력하세요");
				String b =sc.next(); //콘솔에서 문자열을 입력받아서 변수 b에 할당 (엔터없음)
				System.out.println("변수b를출력" + b);
				
				System.out.println("=====================");
				
				System.out.println("반드시 실수값을 입력 하세요");
				double c= sc.nextDouble(); //실수는 선언 더블 넥스트더블사용
				System.out.println("변수 c 를 출력 : " + c);
				
				System.out.println("=====================");
				
				
				//한문자를 처리할때, String 변수 선언 후 문자열을 입력받도록 넥스트를 선언
				//그리고 캐릭터 뒤에 한문자를 받아서 나오게한다
				System.out.println("반드시 한문자을 입력하세요");
				String s = sc.next(); //문자열 변수 선언
				char d = s.charAt(0);
				System.out.println("변수 d 를 출력 : " + d);
				//즉 스트링으로 받아서 s에 저장하고 d 선언후 s.charAt을 사용해 인덱스 0번쨰를 불러온다
				sc.close();
				

	}

}
