package chapter03.EX04;

public class RelationOperator {

	public static void main(String[] args) {
		//크기비교 : true, false로 값을 반환
		System.out.println(5<2); //false
		System.out.println(5>2);
		System.out.println(5<2);
		System.out.println(5<=2);
		System.out.println(5>=2);
		
		//등가비교 :
			//== : 같을때, != : 같지 않을때
		int a =5;
		int b =2;
		int c =5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==c);
		System.out.println("================");
		
		//참조 자료형일때 등가비교 (객체의 참조 주소를 비교)
		String str1 = new String("안녕");
		String str2 =new String("안녕");
		System.out.println(str1==str2); //false
		
		System.out.println("================");
		System.out.println(str1); //안녕 / 객체의 번지수를 출력
		System.out.println(str2);//안녕
		
		
		
		
		
		
		
		

	}

}
