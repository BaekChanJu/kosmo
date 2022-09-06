package chapter05.EX02;

public class Using_Read_Array_2D {

	public static void main(String[] args) {
		
		// 2차원 배열의 값을 읽기
			//1차원 배열일때 : arr.length 	<== 열의 갯수였다
			//2차원 배열일떄 : arr.length	<== 행의 갯수이다
				//		   arr[i].length <== 이게 2차원의 열의 갯수다 i : 행의번호
		
		//1차원 배열일때 예시
		int[] arr0 = new int[10];
		System.out.println(arr0.length); //1차원일때 length는 열(방)의 갯수다 10
		// [][][][][][][][][][] 이모앙임
		
		
		
		
		//1. 2차원 배열의 길이 (정방형 배열에서)
		int[][] arr1 = new int[2][3];
		System.out.println(arr1.length); //행의 갯수인 2가나온다
		//[]
		//[]  이모양임
		System.out.println(arr1[0].length); //0번 행의 length 인 3나옴
		System.out.println(arr1[1].length); //0번 행의 length 인 3나옴
		//그래서 arr1 하고 [] 안에 행을 넣어줘야 열을 확인할 수 있다
		
		
		
		
		System.out.println("===========경계선===========");
		
		
		
		//2. 2차원 배열의 길이 (비정방형 배열에서)
		int[][] arr2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(arr2.length); //2  <== 행의갯수
		System.out.println(arr2[0].length); //2  <== 0번째 행의갯수  0번쨰는행이2개다
		System.out.println(arr2[1].length); //3  <== 1번쨰 행의갯수  1번쨰는 행이3개다
		//[][]
		//[][][] 이모양이니까
		
		
		
		
		
		
		
		
		System.out.println("======2중 for문을 이용한 이차원 배열 값 출력=========");
		//2차원 배열 출력 방법
			//방법1 : 방번호를 직접출력 /인덱스 번호를 직접 찍어준다
		
		System.out.println(arr2[0][0] + " " + arr2[0][1]); // 1,2 나옴
		System.out.println(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
		// 3, 4, 5 나옴
		
		
		
	    //방법2 : for문을 사용해서 출력 : 2차원 배열 이중for (for문 내의 for문)
			//바깥쪽 for문 : arr.length : 행의갯수
		    //안쪽 for문 : arr[i].length : 행의 열의 갯수
		
		 for(int i = 0; i<arr2.length; i++) { //순회하면서 행의 갯수를 1씩 증가
			 for(int j = 0; j<arr2[i].length; j++) {
				 System.out.print(arr2[i][j] + " ");
			 }
			 System.out.println(); //한 행이 끝나면 엔터를 적용하는 용도로사용
		 }
		
		
		
		
		//방법3 : Enhanced for 문을 사용해서 출력
		 	//바깥쪽 for 문은 : 첫번쨰 행의 배열자체를 가져와서 변수 a 에담는다
		 	// 그값들을 b에담아 출력한다
		 System.out.println("====Enhanced for로 이중출력=========");
		 for(int[] a : arr2) { 
			 for(int b : a) {
				 System.out.print(b + " ");
			 }
			 System.out.println();
		 }

	}
}
