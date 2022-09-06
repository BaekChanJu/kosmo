package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		//continue
		//단일 루프에서 컨티뉴
		
		
		//프로그램을 실행하다 컨티뉴를 딱만나면 아래코드는 실행을 안하고
		//처음오로 올라간다 
		for(int i=0; i<10; i++) {
			System.out.println("A");
			if(i%2==0) {continue;} //i가 0 2 4 짝수일때 컨티뉴가 작동한다 그니까b안찍힘
			System.out.println("B");
		}
		//설명 첫번째떄 컨티뉴가 작동해서 한번올라가고 i가 1되면 그럼 i가 1이니까 아래b가찍히고
		//반복에 반복 aab aab aab aab aab 반복으로찍힌다  첫번쨰a는 0일떄 두번쨰a는1일떄 그리고b까지
		
		
		
		
		
		
		
		
		
		//
		
		for(int i =0; i<10; i++) {
			if(i ==5 || i==7) {
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println("=======================");
		
		//문제 1 ) for문을 사용해서 1에서1000까지 1씩 증가하고  컨티뉴를 사용해
		//3의 배수만 출력하세요
		
		for(int i =1; i<=1000; i++) {
			if(i %3 != 0) { // ~의 배수 할떄 != 개꿀팁
				continue;
			}
			System.out.print(i + " ");
			
		}
		System.out.println("================");
		
		//문제 2 ) for문을 사용해서 1에서1000까지 1씩 증가하고  컨티뉴를 사용해
				//5의 배수만 출력하세요
		for(int i =1; i<=1000; i++) {
			if(i %5 != 0) { 
				continue;
			}
			System.out.print(i + " ");
		}
		
		//문제 3 ) for문을 사용해서 1에서1000까지 1씩 증가하고  컨티뉴를 사용해
				//3,5,7의 배수만 출력하세요
		
		//for(int i =1; i<=1000; i++) {
			//if(i %3 != 0||i %5 != 0||i %7 != 0) { 
			//}
		
			//System.out.println(i + " ");
		
		System.out.println("====================================");
		//2.다중 루프에서 컨티뉴
		for(int i =0; i<5; i++) {
			for(int k =0;k<5;k++) {
				if(k ==3) {
					continue;
				}
				System.out.println(i + " , " + k);
			}
		}
		System.out.println("=========lable로 점프====================");
		out: for(int i =0; i<5; i++) {
			for(int k =0;k<5;k++) {
				if(k ==3) {
					continue out;
				}
				System.out.println(i + " , " + k);
			}
		}
		//그래서 3일때  아웃까지 점프하는거임
		
		System.out.println("===================================");
		
		out: for(int i =0; i<5; i++) {
			for(int k =0;k<5;k++) {
				if(k ==3) {
					i=6; //강제로 5이상값을넣어줘서 탈출시켜줌
					continue out;
				}
				System.out.println(i + " , " + k);
		
		
	
		
		
		}
		}
	}
}

		
		
		

