package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		//float 과 double의 정밀도
		 // float은 소숫점 7자리까지 정밀도가 유지
		// double은 소숫점 15자리까지 정밀도가 유지
		
		//float f1 = 1.0000001;  //하면 더블로 오해해서 오류남
		//앞에 캐스팅을 해주거나, 뒤에 대문자 F를 붙혀줘야한다
		float f1 = 1.0000001F; //(옳은답)
		
		//리터럴 : 변수에 저장되는 값을 호칭 (변수값 앞에 캐스팅이나 뒤에f 이걸통칭)
		System.out.println(f1);
		
		float f2 = 1.00000001F;
		System.out.println(f2); // 1.0 나옴 출력이안됨 8자리여서
		
		System.out.println("===============================");
		
		double d1 = 1.000000000000001; //15자리까지 가능 잘 출력됨
		System.out.println(d1);
		double d2 = 1.0000000000000001;
		System.out.println(d2);//16 자리여서 1.0 나옴 출력안됨
		

	}

}
