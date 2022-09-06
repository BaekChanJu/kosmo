package chapter05.EX01;

public class Using_Array07 {

	public static void main(String[] args) {
		//배열 변수의 값 대입방법1
		// 선언과 초기화를분리가능!
		
		int[] arr1 = new int[3]; //방3개고 인덱스는 0 1 2
		
		//int[] arr1;
		//arr11 = new int [3] 
		// 이렇게가 선언과 초기화의 분리
		
		arr1[0] =3;
		arr1[1] =4;
		arr1[2] =5;
		
		//대입방법2
		// 선언과 초기화를분리가능!
		int[] arr2 = new int [] {1,2,3,4,5,6,7,8,9,10};
		//빈방에 바로 대입해버리는거다
		//[] 안에 방갯수를 지정해버리면 오류가 난다
		
		//int[] arr2;
		//arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//대입방법3 - new int[] 생략하고 바로가능하다
		// 대신 선언과 초기화 분리 불가
		int[] arr3 = {11,12,13,14,15};
		
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//3번을 가장 많이 쓰긴하지만 3번만 쓰는게아니다!
		//선언과 초기화를 분리를 못하니3번은
		//밖에서선언할 경우가있을때를 대비해서 1번2번을 같이 공부해야함

	
	}
}
