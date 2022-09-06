package chapter05.EX01;

import java.util.Arrays;

public class Using_Arrray02 {

	public static void main(String[] args) {
		//1.배열 선언 및 초기화
		
		double[] d = new double[6]; //이러면 인덱스 0 1 2 3 4 5 총6개
		//힙 영역에 더블 방 6개 생성후 주소값을 d에 넣는다 라는 의미
		
		
		//2. 배열의 값을 할당
		d[0] = 10.5;
		d[1] = 20.5;
		d[2] = 30.5;
		d[3] = 40.5;
		d[4] = 50.5;
		d[5] = 60.5;
		
		//3. 배열 방의 값을출력
			//3-1 직접 츨력
		System.out.println(d[1]);
		System.out.println(d.length); // 방의갯수 6나옴
		
		for(int i =0; i<d.length; i++) {
			System.
			out.println(d[i]);
		}
		
		//for문을 사용하면 원하는 방의 값만 출력가능 3-2
		System.out.println("====================");
		for(int i =3; i<6; i++) {
			System.out.println(d[i]);

	}
		
	System.out.println("3-3. 향상된 for문");
	
	for(double k : d) {
		System.out.println(k);
	}
		
	System.out.println("3-4. Araays.toString(d)");
	
	System.out.println(Arrays.toString(d));
		

	}
}
