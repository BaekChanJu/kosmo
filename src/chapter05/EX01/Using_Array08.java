package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		//정수 배열 방 10개를 생성한다먼저
		//그러고 임의의 값을 10개 방에 저장을하시고
		//그 중 최대값을 뽑아서 출력하는 프로그램을 생성하세요
		
		int arr[] = new int [10];
		
		Scanner put = new Scanner(System.in);
		
		System.out.println("임의의 수 10개를 입력하세요");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = put.nextInt();
		}
		for(int i =0; i <arr.length; i++) {
			System.out.println("임이의 수는 : " + arr[i]);
		
		}
		
		int max = arr[0]; // 배열의 첫번째 요소를 민과 맥스로 처음 정해준다
		int min = arr[0]; //
		
		//그러면  i <arr.length; 배열의 크기만큼 10만큼 루프를 돌겠지??
		//그러면 위에 초기 설정해놓은 민과 맥스를 if로 비교하게되면
		//현재민보다 작은값이면 민에저장 현재 맥스보다 큰값이면 맥스에 저장되겠죠
		for(int i =0; i <arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		
		//그니까 min>arr[i] 에서 처음에 내가 5를 넣었다고 치자 
		//그다음꼐 6이면 현재 민인 5보다 크니까 저장안되고넘어가고 7이여도 안되고넘어가고
		//근데 4면 현재 나의민값 5보다 작으니까 새로운 4가 저장되고 이렇게 10번 돌려서
		//가장 작은값을 만드는것이다
		
		
		
		
		
		
	System.out.println("==2번째 방법=Arrays.sort()===============");
	Arrays.sort(arr); // 인덱스 각방에 들어온것들을 정렬해줌
	//배열안에서 0에 최소값 넣어주고 그순서대로 쭉 넣어준다
	// 최대값을 출력하는 방법 arr[arr.length-1   / -1꼭붙히라!
	System.out.println("최대값 :"  +arr[arr.length-1]);
	System.out.println("최소값 :"  +arr[0]);
	
	
	
	
	
	
	System.out.println("====3번쨰 방법 Stream 사용");
	System.out.println("최대값 :"
	+ Arrays.stream(arr).max().getAsInt()); // 걍 스트림 사용법임 민은 반대
	

	}

}
