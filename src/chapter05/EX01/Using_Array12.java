package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		
		//1~1000까지 배열(arr)에 저장후
		//1.배열  선언
		//2.for 문을 사용해서 arr 배열 변수에 값을 할당 [입력]
		//3. for문을 통해서 arr 배열 변수의 값을 출력 [출력]
		//4. Enhanced For 문을 사용해서 값을 출력 [출력]
		//5. Arrays.toString(arr) 출력 [출력]
		
		int[] arr = new int[1000];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1; //0번쨰 방에 1을 넣겠다 한번더돌면 1이+된다 반복
		}
		
		for(int i =0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int k : arr) {
			System.out.println(k);
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	
		
	 
   }
 }
