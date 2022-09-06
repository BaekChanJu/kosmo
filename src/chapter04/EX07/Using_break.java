package chapter04.EX07;

public class Using_break {

	public static void main(String[] args) {
		//break; >> 해당구문을 탈출할때 if조건과 같이 사용
		// - 1단계만 탈출
		// for, while, do while 같이 반목문 탈출할떄도 사용
		
		// #1. 단일 루프에서 탈풀
		
		//for(int i = 0; i<10; i++) {
			//System.out.println(i);
			//break; // 한단계 탈출 즉 0만 찍히고 탈출해버림
		//}
		//System.out.println("============================");
		
		
		
		//for, while, do while 내에서 if 조건문과 같이 사용되는 경우
		//for(int i = 0; i<10; i++) {
			//System.out.println(i);
			//if(i==5) {
			//break; //5까지 찍고 탈출해버림
				
			//2. 다중 루프 문에서 브레이크 사용
				// case1. 하나의 loop문만 탈출
				
				//for(int i = 0; i<5; i++) { // 0~4 : 총5개찍힘
					//for(int j =0; j<5; j++) { // 0~4 : 총5개찍힘
					//if( j == 2) {
						//break;
						//}
					//System.out.println(i +" , " + j);
						
						
					
		//case2. 한번에 탈출하는법
		
		for(int i = 0; i<5; i++) { // 0~4 : 총5개찍힘
			for(int j =0; j<5; j++) { // 0~4 : 총5개찍힘
			if( j == 2) {
				i = 100; // 바깥쪽 for 문의 변수값을 증가시켜서 한꺼번에 탈출 //
				//i가 false 나도록 만드는거임
				break;
				}
			System.out.println(i +" , " + j);
		
			}
		}
		
		//jump 사용
		for(int i = 0; i<5; i++) { // 0~4 : 총5개찍힘
		jump:for(int j =0; j<5; j++) { // 0~4 : 총5개찍힘
			if( j == 2) {
				i = 100; // 바깥쪽 for 문의 변수값을 증가시켜서 한꺼번에 탈출 //
				//i가 false 나도록 만드는거임
				break jump;
				}
			System.out.println(i +" , " + j);
			}
		}
	}
}