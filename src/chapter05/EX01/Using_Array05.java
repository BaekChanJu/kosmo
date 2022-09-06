package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		//1~500까지의 3의 배수를 배열에 저장
		// 출력 : 1.직접출력 2.for문 출력 3. 향샹된for문 4.어레이투스트링
		//합계와 평균까
		
		// int i =1;
		 //int cnt=0;
		 
		// while(i<500) {
			 //if(i%3==0) {
				// cnt++;
			// }
			 //i++;
		//}
		// System.out.println("3의 배수의 갯수는 : " + cnt + "입니다");
		 
		 int[] arr = new int[166];
		 
		 int count=0;
		 
		 
		 for(int i=1, j=3; i<arr.length; i++, i+=3) {
			 if(j<=500) {
				arr[i] =j;
				count++;
			 }
		 }
		 
		 
		 
		 //출력
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 
		 
		
	}
	
}

