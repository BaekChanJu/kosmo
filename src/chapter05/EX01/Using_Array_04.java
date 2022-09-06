package chapter05.EX01;

import java.util.Arrays;

public class Using_Array_04 {

	public static void main(String[] args) {
		//배열(Array) : 하나의 []이 배열 안에 여러개의 값을 넣는다
		
		//배열은 자료형이 >> 참조자료형이다 > 변수는 스택에저장,값은 힙에 저장
		//모든 참조자료형은 변수는 스택 값은 힙에 저장
		//변수의 힙 영역에 주소값이 들어있다!
		
		
		//기본자료형은 > 변수, 값모두 스택영역에 들어가있다
		// boolean, byte, short, int, long, float, double, char
		//변수에 값을넣으면 변수와 값 모두 스택영역에 들어가는 것이다
		
		
		
		//기본 자료형 배열변수: 
		//참조 자료형 배열변수: String

		
		/*배열의 중요한특징
		  1. 동일한 자료형의 값을 담고있다 /인트로 선언하면 인트만,더블이면 더블만!
		  2.방의 갯수를 지정하면 변경할 수 없다 (인덱스 변경 불가)
		  */
		
	
		
		//1. 배열 선언과 초기화!
		
		int[] a = new int[5];
		
			// 자료형 [] 변수명   =  new > 자료형선택 >[] 안에 방갯수 입력
		//힙 공간에 int배열방 5개를 생성해서 힙의 주소를 a변수에 할당해라
		
		//힙공간에는 반드시 값이 들어있어야 한다
			// 초기값을 안넣으면 자동으로 들어간다
		// 정수 0 실수 0.0 boolean : false 이렇게 자동으로들어감
		// 참조자료형은 null 값이 자동들어감 > 값이 없는상태를 의미
		
		
		//2. 방에 값을 입력 - 방에 값을 직접 넣는법
		a[0] = 10; // 0번 배열방에 10을 넣어라
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("직접출력줄=============");
		
		System.out.println(a[0]); //선언한 값이 없으니 정수 0출력됨
		System.out.println(a[1]); // 방번호를 인덱스라고함 5개 방이니까
		System.out.println(a[2]); //0번방부터 4번방까지 만들어져있음
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
		//2-1. 
		System.out.println("for을이용한 입력과 출력=============");
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("for에서 index를 이용한1=============");
		for(int i=0, j=100; i<5; i++, j+=100) {
			a[i] = j; //100씩 증가시키기 //값을 넣은거임
		} //근 i<5 이거라는 표현은 잘안씀 a.length를 더 많이사용함 그래서보면
		//a[0] =100;  a[1] =200; .....~
		
		
		
		for(int i=0, j=1000; i<a.length; i++, j+=1000) {
			a[i] = j; // 이렇게 방의 갯수보다 작을시까지니까 딱 알맞게나옴
			System.out.println(j);
			
	   }
		
// 3.배열 방의 정보를 출력 (배열의 저장된 모든 값을 출력 forEach같은)
		System.out.println("향상된 for문");
		for(int k : a) {
			System.out.println(k);
		}
		
		
		//4. 출력 Arrays.toString(a) 
		System.out.println("Arrays.toString(a) ===");
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
