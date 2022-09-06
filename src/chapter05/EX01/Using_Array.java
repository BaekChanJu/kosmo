package chapter05.EX01;

import java.util.Arrays;

public class Using_Array {

	public static void main(String[] args) {
		//배열 (Array) : 하나의 [배열] 변수에 여러개의 값을 할당.
		// 배열의 특징  1. 동일한 자료형의 값을 할당
		// 			2. 배열의 방의 크기를 한번 지정하면 수정이 불가
		
		
		//기본자료형인 경우 : 램에 스택영역에 변수와 값이 같이 저장이됨
		//참조자료형인 경우 : 램에 스택영역에 변수명이 저장되고
		//힙 영역에 변수의 값이 저장이된다
		
		int[] a = new int[5];  //배열a변수의 방의 크기 5개를 생성후
		//주소 값을 a에할당해라
		
		//new : Heap 영역의 배열방5개를 생성해서 Heap 영역의 번지를 a변수에 할당해라
		//a는 참조변수이고 참조 주소값을 가지고있다
		
		
		//배열변수의 값을 할당하는법
		a[0] = 10; //힙 영역의 인덱스 0번 방에 정수 10을 할당했다는 뜻이다
		a[1] = 20; // 즉 방 0번방부터 4번 방까지 총 5개이다 
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		//배열 방의 값을 출력하는법
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//for 문을 사용해서 출력
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("배열변수 a 방의갯수 : " + a.length);
		//length 는 배열의 길이를 알 수 있음 ㅎ
		
		System.out.println("for문에서 랭스를 사용");
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(a); // 이상한뭐가나오는데 힙메모리의 주소다
		
		System.out.println("==================");
		
		
		//향상된 for문으로 배열의 모든 값을 출력
		
		for(int k : a) { //forEach문 아님?
			System.out.println(k);
		}
		//배열 a 방에있는 그 값들을 k 변수에 넣어줌 그리고 k를 출력하는것임
		
		// - 배열의 모든 방을 순환하면서 출력해줌
		
		
		
		
		
		
		
		System.out.println("=Arrays.toString(a);================");
		
		//Arrays.toString(a) 로 출력 
		
		System.out.println(Arrays.toString(a)); // 배열[] 안에
		//모든 값을 다 출력해줌
		
		
		
		
	}
}
