package chapter05.EX04;

public class Using_String01 {

	public static void main(String[] args) {
		//String : 참조 데이터 타입 , 문자열을 처리, 특별한 기능들이 많이 들어가있다
		
		// 1. 객체 생성을 사용 해서 값을 할당 (객체의 주소는 별개로 작동 ) 매개변수선언시
		String str1 = new String("안녕");
			//new Heep 메모리에 값을 할당
			//String() : 생성자의 매개 변수에 "안녕" 이라는 문자열을 할당
		System.out.println(str1);
		
		String str11 = new String("안녕");
		System.out.println(str1 == str11); //false 나옴
		//str1 과 str2 의 객체의 주소를 ( == )비교한다 두개의 안녕은 별도의 다른 주소가 있는것
		
		System.out.println(str1.equals(str11)); //true 가나옴
		//str1 과 str2 의 객체의 값을 비교해줌 주소가 아니라 안녕.안녕 같으니 true
		//String 에서 사용가능 if문 안에서 등등
		
		//즉 new라는 키를 통해서 매개변수로 값을 할당하면 값은 같아도
		//주소가 다르기때문에 == 으로 비교하면 false가 나오고 equals로 값만 비교시에는
		//true가 나온다 그래서 값과 주소는 별개로 작동하는 것이다
		
		
		
		
		// == 는 주소를 비교
		// equals 는 값만 비교
		
		
		
		
		// 2. 리터럴로 값을 할당 (객체의 주소(번지) 를 공유)
			//리터럴 : 변수에 들어가는 값을 통틀어서 리터럴 
		String str2 = "안녕하세요";
		System.out.println(str2);
		
		String str22 = "안녕하세요";
		System.out.println(str2 == str22); ///true가 나옴 왜그럴까?
		//둘은 리터럴로 값을 할당했다 그래서 동일한 주소를 가르킨다
		System.out.println(str2.equals(str22)); //동일하게  true
		
		//즉 리터럴로 값을 할당하면 new 선언하고 대입이 아니기 때문에
		//주소가 동일히 작동해서 == true , equals 값도 true다 값이 다르면 false다
	}

}
