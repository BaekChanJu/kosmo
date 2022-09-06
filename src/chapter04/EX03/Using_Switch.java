package chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		//switch 문 - 반드시 break;로 해당 case를 탈출 해줘야한다.
		
		//break; 를 사용하지 않으면 해당 case로 점프후에 하위의 모든 case를 실행
		
		int a = 2; //변수 2를 넣으니 case2번으로 점프해서 들어감
//지금은 break를 안써서 case2 아래 모든값들이 나 출력된것임	
		
		switch(a) { //(위치변수,매개변수의미) : 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력" + a);
		case 2:
			System.out.println("변수 값을1 출력" + a);
			break;
		case 3:
			System.out.println("변수 값을 출력" + a);
		case 4:
			System.out.println("변수 값을 출력" + a);
		default : //if문의 else여활임 case의 값이 없는 모든경우 default로
			System.out.println("없는 값" + a);
		}
		
		System.out.println("-------------------------------------------------------");
		
		//2.switch에서 break 사용
		a = 3; 
		
				switch(a) { 
				case 1:
					System.out.println("case 1를 출력" + a);
					break;
				case 2:
					System.out.println("case 2를 출력" + a);
					break;
				case 3:
					System.out.println("case 3를 출력" + a);
					break;
				case 4:
					System.out.println("case 4를 출력" + a);
					break;
				default : //일반적으로 디폴트는 브레이크 생략
					System.out.println("없는 값" + a);
				}
				
				
				
				
				//7점 이상인경우 pass, 그렇지 않는 경우 fail
				System.out.println("-------------------------------------------------------");
				int b =8;
				
				switch(b) {
				case 10 :
					System.out.println("Pass입니다");
					break;
				case 9 :
					System.out.println("Pass입니다");
					break;
				case 8 :
					System.out.println("Pass입니다");
					break;
				case 7 :
					System.out.println("Pass입니다");
					break;
				default:
					System.out.println("Fail");
					break;
				}
				
				
				
				
				
				System.out.println("------축약-----------------------------------------");
				
				
				b=6;
				switch(b) {
				case 10: case 9: case 8: case 7:
					System.out.println("Pass입니다");
					break;
				default :
					System.out.println("fail입니다");
					break;
				}
				
				System.out.println("-------------------------------------------------------");
				
				
				
				
				
				
				
				
				
				//스위치문 <> if~else if 문과 상호 변환된다
		int c =8;
		
		switch (c) {
		case 10: case 9:
			System.out.println("a 학점");
			break;
		case 8 :
			System.out.println("b 학점");
			break;
		case 7 :
			System.out.println("c 학점");
			break;
		default :
			System.out.println("d 학점");
			}
		
		
		
		System.out.println("-------------------------------------------------------");
		//위 구문을 if else if 문으로 변환해보자
		
		c=7;
		
		if(c>9) {
			System.out.println("a 학점");
		}else if (c == 8) {
			System.out.println("b 학점");
		}else if (c == 7) {
			System.out.println("c 학점");
		}else {
			System.out.println("d 학점");
		}
	 }
}
