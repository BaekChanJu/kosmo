package chapter05.EX02;

public class Using_NonRectangle_Array {

	public static void main(String[] args) {
		//비정방형 배열 : 각 행에 대해서 열의 객수가 다를때

		// 1. 방법1: 비정방형 배열 선언후 방크기(열)를  생성후 값 할당
			//행의 크기만 먼저 설장하고 열을 new로 따로 만들어준다
			//행 먼저 선언후 열은 나중에 따로 만들어주는 형식
		
		int[][] arr1 = new int[2][]; //행의 갯수만 지정된 경우
		arr1[0] = new int[2]; //0번째 행의 열의 갯수 2를 지정 0,1
		
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		
		
		
		arr1[1] = new int[3]; //1번쨰 행의 열의 갯수 3을 지정 0,1,2
		
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
		
		System.out.println(arr1[0][0] + " " +arr1[0][1]);
		System.out.println(arr1[1][0] + " " +arr1[1][1] + " " + arr1[1][2]);
		
		
		
		
		System.out.println("==========경계선=============");
		
		
		
		
		
		// 2. 방법2 : 비정방형 배열 선언시 값을 할당1
		int[][] arr2 = new int[2][]; //비정방형 배열 선언 : 행의 갯수만 먼저 선언,
		//열은 일단 선언하지 않는다
		arr2[0] = new int[] {1,2}; //0행의 값을 바로 할당 (방크기 지정하면 오류)
		arr2[1] = new int[] {3,4,5}; //1행의 값을 바로 할당
		
		System.out.println(arr2[0][0] + " " +arr2[0][1]);
		System.out.println(arr2[1][0] + " " +arr2[1][1] + " " + arr2[1][2]);
		
		
		
		
		
		System.out.println("==========경계선=============");
		
		
		
		
		
		// 3. 방법3 : 비정방형 배열 선언시 값을 할당2
			//선언과 초기화 한번에
		int[][] arr3 = new int[][] {{1,2},{3,4,5}};
		
		System.out.println(arr3[0][0] + " " +arr3[0][1]);
		System.out.println(arr3[1][0] + " " +arr3[1][1] + " " + arr3[1][2]);
		
			//선언과 초기화를 분리 가능
		int[][] arr4; 
		arr4 = new int[][] {{1,2},{3,4,5}};
		
		System.out.println(arr4[0][0] + " " +arr4[0][1]);
		System.out.println(arr4[1][0] + " " +arr4[1][1] + " " + arr4[1][2]);
		
		
		
		
		
		System.out.println("==========경계선=============");
		
		
		
		
		
		// 4. 방법4 : 비정방형 배열 선언시 값을 할당3 (선언과 초기화 분리 불가능)
			//new int[][] 스킵가능
		int[][] arr5 = {{1,2},{3,4,5}};
		
		System.out.println(arr5[0][0] + " " +arr5[0][1]);
		System.out.println(arr5[1][0] + " " +arr5[1][1] + " " + arr5[1][2]);
		
		
		//선언과 초기화 분리시 오류발생
		//int[][] arr6; 
		//arr6 = {{1,2},{3,4,5}};
	}

}
