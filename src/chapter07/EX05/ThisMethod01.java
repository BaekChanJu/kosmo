package chapter07.EX05;


class Abc{
	
	//생상자(기본) : 인풋 매개변수가 없는 생성자
	Abc(){
		System.out.println("인풋매개변수가없는 기본 생성자야난! 생략도 가능!");
	}
	Abc(int a){
		this(); //이건 기본 생성자를 호출하는것이다 디스 키워드가 아니다 ()
		//가 매개변수없는 생성자를 호출하라는 의미다
		//그럼 이 생성자를 호출하면 저위 생성자를 호출하는 샘이 된다
		System.out.println("두번째 생성자 호출");
	}
	
	Abc(int a , String b){
		this(30); //매개변수가 정수1개인 생성자를 호출한거다 그럼 위겠지?
		System.out.println("세번째 생성자 호출");
	}
	
	Abc(int a , String b, String C){
		this(60,"오늘"); //정수1개 ,스트링1개인 생성자를 찾아서 호출해줌
		System.out.println("네번째 생성자 호출");
}
}

public class ThisMethod01 {

	public static void main(String[] args) {
		//this method : 자신클래스의 다른 생성자를 호출
		// 	--반드시생성자 내부에서 사용됨, 메소드 내부에서는 사용할 수 없음
		//  --반드시 생성자 첫번째 라인에 위치해야한다
		
		System.out.println("====기본생성자 호출=======");
		Abc abc1 = new Abc(); //기본생성자 호출
		
		
		
		System.out.println("===매개변수가 1개인 생성자호출=======");
		Abc abc2 = new Abc(50); //이걸 호출하게되면 첫번째 생성자도 호출하게 되는샘
		
		
		
		System.out.println("===매개변수가 2개인 생성자호출=======");
		Abc abc3 = new Abc(40,"오늘"); //이걸 호출하면 첫번째 두번째 생성자도 호출이
		//되는것이다 연계연계느낌
		
		System.out.println("===매개변수가 3개인 생성자호출=======");
		Abc abc4 = new Abc(40,"오늘","내일");
		
		
		//꼭 생성자 안에서만 써야함 메소드 안에서는안됨 
		//this 플레이로 연계연계 가능한거고 생성자 안에서만 쓰는걸로!
		

		
		
		
		
		
	}

}

