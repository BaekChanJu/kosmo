package chapter05.EX04;

public class Using_String04 {

	public static void main(String[] args) {
		
		System.out.println("========문자열+문자열==========");
		//1. 문자열 + 문자열
		String str1 = "안녕" + "하세요" + "!" ;
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다"; //str2 = str2 + "습니다" 
		str2 += "!";
		System.out.println(str2);
		
		
		
		System.out.println("=========문자열+기본자료형==========");
		//2. 문자열 + 기본자료형
		String str3 = "안녕" + 1; //정수1이 문자열로 자동으로 변환
		String str4 = "안녕" + String.valueOf(1); //정수1을 문자열로 바꿔줌
		String str5 = "안녕" + "1"; //문자열1 직접대입
		
		
		System.out.println(str3);//안녕1
		System.out.println(str4);//안녕1
		System.out.println(str5);//안녕1
		
		
		
		
		System.out.println("=========문자열과 기본자료형 혼용==========");
		//3. 문자열과 기본 자료형  혼용
		System.out.println(1+"안녕"); //1안녕
		System.out.println(1+2+3+"안녕");//6안녕 //앞은연산되고 뒤는 문자와연결
		System.out.println("안녕" +1+2+3);//안녕123  //문자열 뒤는 연결된다 
		
	}

}
