package chapter07.EX01;

public class Using_Mathod04 {
	//같은 클래스 내부에서 메소드 호출
		//메인메소드는 스태틱 기카 붙은 메소드
	// 		//static 메소드에서는 인스턴스 메소드를 집접 호출이 불가능 (객체화 후는 가능)
	//		//static 메소드는 직접 호출이 가능
	
	
	static void print() {
		System.out.println("안녕");
	}
	
	static int twice (int k) {
		return k*2; // 인풋 값을 2배로 돌려주는 메소드
	}
	
	static double sum (int m, double n) { //두값을 받아서 더해서 되돌료쥼
		return m + n;
	}

	public static void main(String[] args) {
		
		print(); // 안녕 잘 나옴 같은 스태틱이라
		
		int a = twice(3);
		System.out.println(a); // 값을 저장한에를 출력
		
		System.out.println(twice(4)); //한번에 출력
		
		double b = sum(a, 5.8); //a는 위에서 계산된 6
		System.out.println(b); //11.8
	}

}
