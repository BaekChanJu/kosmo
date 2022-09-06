package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		/*
		 for( 초기값 ; 조건; 증가값){
		         실행문1;
		 }
		  즉 조건이 참일동안 무한반복 조건만족하면 끝나는형식 
		  
		 * */
		
		//기본 for 문
		//int a ;
		
		//for (a=0; a<3; a++) { //초기값; 조건; 증가값
 			//System.out.println(a); //0~2까지 나옴
		//}
		
		
		//System.out.println("===================");
		
		//초기값과 증가값에는, 로 구분해서 여러개의 변수가 올 수 있다.
		
		//int b, c, d;
		
		//for(b=0, c=10, d=20; b<5; b++) { // (b=0, c=10, d=20; b<5; b++, c+=2, d+=5 )
			//System.out.println("b :" + b + ", c : " + c + ", d : " + d );
			//c+= 2;
			//d+= 5;
		//}
		

		//System.out.println("===================");
		
		//for 문에서 무한루프 
		//int e;
		
		//for(e=0; e<10; e +=3) //3씩증가
			//System.out.println(e);
		
		//만약 증가값을 잘못 설정해버리면 예를들어 -3을 하면 10보다 작기때문에무한루프에 빠질 수 있다
		
		
		
		
		
		//System.out.println("========for문 없이 덧셈===========");
		//1부터 10까지 for문 없이 덧셈
		
		
		//int sum1;
		//sum1 =0;  //sum1 0
		//sum1 += 1; //sum1 = sum1 +1  / 1
		//sum1 += 2;//sum1 = sum1 +2 / 3
		//sum1 += 3;  // 6
		//sum1 += 4;
		//sum1 += 5;
		//sum1 += 6;
		//sum1 += 7;
		//sum1 += 8;
		//sum1 += 9;
		//sum1 += 10;
		//System.out.println("1~10까지의 합 : " + sum1);
		
		
		
		
		//System.out.println("========for문으로 덧셈===========");
		
		//for문을 사용해서 1부터 10까지 합계 구하기
		
		//int sum2;
		
		//int i;
		
		//for(i=1, sum2=0; i<=10; i++) {
		//sum2 += i;
			//System.out.println("sum2 : " +sum2+ ", i : " + i);
		//}
		
		
		//System.out.println("============================");
		//0 ~ 1000RKwl 7의 배수의 합계
		
		
		//int sum3 = 0; //초기값 설정하고 점점 올라가는 aa를 더해주면 된다
		
		//for(int aa=0; aa<1000; aa+=7) {
			//sum3 +=aa;
		//}
		//System.out.println(sum3);
		//System.out.println("============================");
		
		
		//for 문과 if 문을 사용해서 1 ~ 10까지 더한 값을 출력 하되 아래와 같이하시오
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		
		//내가푼거 
		//int sum4 = 0;
		
		//for(int i=1; i<11; i++) {
			//if(sum4<56) {
				//sum4 +=i;
			///}
		//}
		//System.out.println(sum4);
		
		int sum4 = 0;
		
		for(int i=1; i<=10; i++) {
			sum4 += i; //sum4는 다 더한값을 저장해주고
			System.out.print(i); //더하는 수들 목록 출력
			if(i<=9) {
				System.out.print(" + "); // 1~ 9까지는 + 출력
			}else {
				System.out.print(" = "); // i가 10이면 = 출력
				System.out.print(sum4);
			}
		}
		
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55 라고 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
