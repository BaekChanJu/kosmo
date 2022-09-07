package chapter05.EX04;

import java.util.Arrays;

public class Using_String06 {

	public static void main(String[] args) {
		//String 의 다양한 메소드
		//5. 문자열 수정 ( toLowerCase(), toUpperCase()  )
		//                  소문자로         대문자로
		
		System.out.println("=====toLowerCase(), toUpperCase()===========");
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); //전부 소문자로
		System.out.println(str1.toUpperCase()); //전부 대문자로
		
		
		
		
		
		System.out.println("=====replace(원본,수정)===========");
		//replace(원본,수정)  //원본을 수정으로 변환해라
		String str2 =str1.replace("Study","공부");
		
		System.out.println(str1.replace("Study", "공부"));
		System.out.println(str1);
		System.out.println(str2);
		// Study 를 공부로 바꿔라  //새변수 선언해서 대입가능 
		
		
		
		System.out.println("=======subString()===========");
		//subString() : 글자를 잘라서 출력
		
		System.out.println(str1.substring(0, 5)); //인덱스 0~5까지 자른다
		//5인 J는 포함을 시키지 않는다 즉 5전까지고 0~4까지가 살고 뒤가 날라가는 것
		//Java라고 출력됨
		System.out.println(str1.substring(0,6)); //Java S까지 나옴
		
		
		
		
		
		System.out.println("======split() 배열을 하나 지정해줘야함===========");
		//split() : 특정 문자를 기준으로 잘라서 배열에 저장
			//  1번 / 2번 - 3번 공백 을 기준으로 잘라서 라는 뜻
			// 잘라서 strArr1 배열변수에 저장
		
		String[] strArr1 = "abc/def-ghi jkl".split("/|- ");
		//abc가 인덱스0번에 들어감 def가 1번 ghi가 2번 jkl이 3번 
		
		for (int i=0; i<strArr1.length; i++) {
			System.out.println(strArr1[i]);
			
		}
		for (String k : strArr1) {
			System.out.println(k);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(strArr1));
		
		
		
		
		
		
		System.out.println("======문제=============");
		//문제 : 공백을 기준으로 모두 잘라서 배열에 저장후 출력
			//for, Enhanced for, Arrays.toString 3개로 출력해주세요
		
			String a = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 입니다.";
		
			String[] strArr2 = a.split(" ");
		
		
			for (int i=0; i<strArr2.length; i++) {
				System.out.print(strArr2[i]);
			}
			System.out.println();
			
			for(String k : strArr2) {
				System.out.print(k);
			}
			
			System.out.println();
			System.out.println(Arrays.toString(strArr2));
			
			
			
			
			System.out.println("===========trim===========");
			//trim() : 좌우의 공백을제거
			System.out.println("     abc        ".trim());
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("==========문자열 비교==========");
			//6. 문자열 비교 ( == ) : 참조 자료형일때 스택의 주소를 비교
			String str3 = new String("Java");
			String str4 = new String("Java");	
			String str5 = new String("java");
			
			System.out.println(str3 == str4); //false ==> 주소를 비교하고
			//서로 주소가 다르다
			System.out.println(str4 == str5); //false
			System.out.println(str5 == str3); //false
			
			
			//equals() : 힙의 값을 비교 		
			System.out.println(str3.equals(str4));//값이 같으니 true
			System.out.println(str4.equals(str5)); //false 대소문자가 다르니
				//대소문자 구분하지않고 값을 비교하는건
			//equalsIgnoreCase
			System.out.println(str4.equalsIgnoreCase(str5)); //대소문자 구분안하니 true
			
	}
}
