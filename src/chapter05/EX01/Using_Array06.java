package chapter05.EX01;

public class Using_Array06 {

	public static void main(String[] args) {	
		//배열 선언 방법1. 자료형 뒤에 []  <<여기가 권장사항임
		
		int[] array1 = new int[3]; //배열선언, 초기화 <강제로초기값 할당>
		
		int[] array2; //배열 선언
		array2 = new int[3]; // 배열 초기화 <여기도강제로 초기값 할당>
		
		
		
		//2.번방법 변수명뒤에 []
		
		int array3[] = new int[3]; //이렇게해도 문제는안됌
		
		int array4[];
		array4 = new int[4];
		
		//다양한 방법으로 배열선언
		
		boolean[] array5 = new boolean[3];
		System.out.println(array5[0]); //false가 나옴
		//이유는 값이 안정해지면 false나옴 
		
		int[] array6 = new int[3];
		System.out.println(array6[0]); //인트도 값이없으면 0나옴
		
		double[] array7 = new double[3];
		System.out.println(array7[0]); //더블도 값이없으면 0 나옴
		
		String[] array8 = new String[3];
		System.out.println(array8[0]); //참조자료형인 스트링은 null이나옴
		
		// 배열은 참조 자료형 : 스택영역에 변수명과 힙영역의 주소를 가지고있다
			//힙영역의 방에는 반드시 값이 할당되어있어야한다
		
		
		
		
		
		
		
		
		
		
	}

}
