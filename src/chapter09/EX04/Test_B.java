package chapter09.EX04;

class B{
	int m= 3; //인스턴스 : 객체마다 다르게 적용, 힙에 변수와 값이 저장
	static int n = 5; //정적필드 : 모든객체에서 공통적용, 클래스영역에 변수와값이 wjwkd
	
	
	
}

public class Test_B {

	public static void main(String[] args) {
		//객체 생성
		B b1 = new B();
		B b2 = new B();

		
		//인스턴스 필드의 값 변경 / 객체 내부에 저장되어 있어 각각 적용된다 b1과b2 각각적용
		b1.m = 5; //m : 3 ==> 5
		b2.m = 6; //m : 3 ==> 6
		
		System.out.println(b1.m);
		System.out.println(b2.m);
		
		
		
		
		//정적 필드값 수정
		//모든 객체에서 공유해서 사용하는 필드 마지막 설정한 n이 8이니 8로 공유
		b1.n = 7;
		b2.n = 8;
		
		System.out.println(b1.n);
		System.out.println(b2.n); //마지막설정한 8로 나온다
		
		
		
		//정적 필드 수정 : 객체 없이 클래스 명으로 수정해버리기
		B.n = 9; //클래스명 + 정적필드명
		System.out.println(b1.n);
		System.out.println(b2.n); //9 잘 나옴
		
		
		
	}

}
