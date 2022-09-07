package chapter05.EX04;

public class Using_String02 {

	public static void main(String[] args) {
		//String 변수에 값을 할당하는 방법 2가지
		// 1.객체 생성 방법으로 값을 할당 (생성자)new//별도의 주소 공간에 값을 할당(동일한문자열일때)
		// 2.리터럴 방식으로 값을 할당 //주소공간을 공유(동일한문자열일때)
		// == : 스택 공간의 값을 비교 ( 참조자료형 : 스텍에는주소, 실제값은 힙에있다)
		//                      (기본자료형 : 스택공간에 값이들어감 int 등등)
		// equals() : 참조자료형일때 힙 영역의 값만 비교
		
		String str1 = new String("안녕"); 
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕"); 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("================================");
		
		
		// == : 참조자료형일 경우 스텍의 주소를 비교한다
		System.out.println(str1 == str4); //값은 같지만 주소가 달라 false
		System.out.println(str2 == str3); //리터럴로 넣어서 주소공유하니 true
		
		// equals() : 참조자료형의 값을 비교할때 사용
		System.out.println(str1.equals(str2)); //true
		System.out.println(str2.equals(str4)); //true
		

	}

}
