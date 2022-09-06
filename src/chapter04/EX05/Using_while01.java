package chapter04.EX05;

public class Using_while01 {

	public static void main(String[] args) {
		// while (조건) {
		//   실행문;
		// }
		
		//while -반복 횟수를 알 수 없는 경우 사용
		// for 반복횟수를 알 수 있는 경우
		
		//  -- 초기값 선언을 while 문 밖에서 선언을 해야한다
		// -- 증가값은 while문 내에서 선언을해야함 / 선언안하면 무한루프됌
		
		
		
		//1. while문에서 반복 횟수가 0인 경우
		System.out.println("=======반복횟수0===========");
		int a = 0; //변수의 초기값은 꼭 밖에서 선언
		
	
		while(a<0) { //지금은 false라 실행이안됌
			System.out.print(a+""); //조건이 트루일때만 실행
		}
		
		//2. while문에서 반복횟수가 1번인 경우
		System.out.println("=======반복횟수1 break===========");
	
		a=0;
		
		while(a==0) {
			System.out.print(a +" ");
			System.out.println("");
			break;
		}

		System.out.println("=======반복횟수1 (중가값으로)===========");
		
		a=0;
		
		while(a==0) {
			System.out.print(a +" ");
			a++; //0떄 한번 찍히고 증가하면 1이되니 false가 되어 한번 찍히고 나온다
		}
		
		
		System.out.println(); //엔터역활로 걍
		System.out.println("=======반복횟수10===========");
		
		a=0; //초기값 밖에서 꼭
		
		while( a < 10) {
			System.out.print(a + " ");
			a++; //증가값 안에다 꼭 
		}
		
		
		System.out.println("");
		System.out.println("====초기값을 while문 내에 넣는 경우======== : 무한루프");
	
		
		while( a < 10) { 
			a=0;  //이러면 안된다는 거다
			System.out.print(a + " ");
			a++;  
		}
		
		
		//while 문은 조건을 생략할 수 없다
		//for문은 조건 생략가능하고 생략시 무한루프가 된다
		//while 문에서 무한루프를 돌릴때는 조건에 true를 대입해라!
		
		System.out.println(); 
		System.out.println("==================");
		
		a=0;
		boolean b;
		b=true;
		
		
		while(b) { //true넣으면 무한루프
			System.out.println(a + "");
			a++;
			if(a>200) { //무한루프 방지용 if
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
	}

}
