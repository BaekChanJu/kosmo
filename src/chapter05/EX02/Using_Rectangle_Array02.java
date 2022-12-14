package chapter05.EX02;

public class Using_Rectangle_Array02 {

	public static void main(String[] args) {
		// 2차원 정방향 배열에 값을 넣고출력
		
		//선언과 동시에 초기화
		int[][] arr1 = new int[2][3];
		
		//각 2차원 배열에 값을 할당
		arr1[0][0] =1;
		arr1[0][1] =2;
		arr1[0][2] =3;
		arr1[1][0] =4;
		arr1[1][1] =5;
		arr1[1][2] =6;
		
		System.out.println(arr1[0][0] + " " +arr1[0][1] + " " +arr1[0][2]);
		System.out.println(arr1[1][0] + " " +arr1[1][1] + " " +arr1[1][2]);
		
		//선언과 초기화를 분리
		int[][] arr2; //선언
		arr2 = new int[2][3]; //초기화
		
		arr2[0][0] =1;
		arr2[0][1] =2;
		arr2[0][2] =3;
		arr2[1][0] =4;
		arr2[1][1] =5;
		arr2[1][2] =6;
		
		System.out.println(arr2[0][0] + " " +arr2[0][1] + " " +arr2[0][2]);
		System.out.println(arr2[1][0] + " " +arr2[1][1] + " " +arr2[1][2]);
		
		
		
		
		//2. 배열을 선언시 바로 값 할당
			//선언시 방크기를 지정하면 오류가난다
			//선언과 초기화를 분리 할 수 있다
		int[][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(arr3[0][0] + " " +arr3[0][1] + " " +arr3[0][2]);
		System.out.println(arr3[1][0] + " " +arr3[1][1] + " " +arr3[1][2]);
		
		
		int[][] arr4; //선언
		arr4 = new int[][] {{1,2,3},{4,5,6}}; //초기화
		
		System.out.println(arr4[0][0] + " " +arr4[0][1] + " " +arr4[0][2]);
		System.out.println(arr4[1][0] + " " +arr4[1][1] + " " +arr4[1][2]);
		
		
		
		
		
		
		//3. 배열 선언시 값 할당
			//new int 없이 할당가능
			//주의 : 선언과 초기화를 분리 할 수 없다
		int[][] arr5 = {{1,2,3},{4,5,6}};
		
		System.out.println(arr5[0][0] + " " +arr5[0][1] + " " +arr5[0][2]);
		System.out.println(arr5[1][0] + " " +arr5[1][1] + " " +arr5[1][2]);

		//오류발생 예시 : 선언과 초기화를 분리 불가
		 //int[][] arr6;
		 //arr6 = {{1,2,3},{4,5,6}};
	}

}
