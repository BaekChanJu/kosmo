package chapter05.EX04;

import java.util.Arrays;

public class Using_String05 {

	public static void main(String[] args) {
		//String 의 주요한 특징 : 다른 클래스에는 없는 특별한 기능
		// 1.수정이 불가 ==> 새로운 값이 생성되는것임
		// 2.리터럴로 변수의 값을 넣을 경우 동일한 문자열은 주소를 공유
		// 3. 객체 자체를 출력할때 객체의 주소가 출력되는 것이 아니고 객체의 값이 출력
		//		(toString() 메소드가 재정의 되어 있다)
		// 4. 다양한 메소드가 정의되어 있다
		
		//1. 문자열의 길이(length();)
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length()); //11자 공백까지 전부
		System.out.println(str2.length()); //13자 공백까지 전부
		
		
		
		
		
		System.out.println("========charAt()============");
		//2. 문자열 검색 (charAt(), indexof(), lastIndexof())
			//2-1 charAt() : 해당 index 의 문자를 가져옴
		System.out.println(str1.charAt(2)); //l
		System.out.println(str1.charAt(6)); //J
		System.out.println(str1.charAt(9)); //a
		
		System.out.println(str2.charAt(3)); //세
		
		
		
		System.out.println("======indexof()와lastIndexof()=======");
		//2-2 indexof() : 해당 글자에 대한 방번호출력 왼쪽에서 오른쪽으로
					//lastIndexof() 는 오른쪽에서 왼쪽
		System.out.println(str1.indexOf('J')); //문자한개 방번호 6나옴
		System.out.println(str1.lastIndexOf('a')); //9
		//읽는건 반댄대 9 8 7 6 이렇게 읽어야함
		
		//a문자를 8번방 이후에서부터 검색 
		System.out.println(str1.indexOf('a',8));
		
		System.out.println(str1.indexOf("Java")); //6에서시작하니 6
		System.out.println(str2.indexOf("하세요")); //2에서 시작하니 2
		
		
		System.out.println("=======없는값-1나옴==========");
		System.out.println(str1.indexOf("bye"));
		//언제쓰냐 무한루프속 뭐 -1이 나올때까지 이럴때 주사용
		
		
		
		
		
		
		
		System.out.println("========문자열 변환 및 연결==========");
		//3.문자열 변환 및 연결 (String.valueOf(), concat())
		String str3 = String.valueOf(2.3); // double > String
		String str4 = String.valueOf(false); // double > String
		
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 =str3.concat(str4); // 연결 / +와 같음
		System.out.println(str5); //2.3false
		
		
		
		
		
		
		System.out.println("====getBytes() 와  char[] (toCharArray()===");
		//4.문자열==>byte[] (getBytes()),문자열 => char[] (toCharArray())
		
		String str8 = "Hello Java"; //영문일때 아스키 코드로 배열에저장
		String str9 = "안녕하세요";
		
		byte[] arr1 = str8.getBytes(); //문자의 아스키코드
		byte[] arr2 = str9.getBytes(); //문자 >> 숫자코드로변환
		
		
		System.out.println(Arrays.toString(arr1));
		//영문인 경우에 글자의 아스키 코드들이 숫자로 배열에 담겨서 쭉나온다 
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		char[] arr3 = str8.toCharArray(); //한자한자잘라서 배열에 넣어줌
		char[] arr4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
		
		
		
		

	}

}
