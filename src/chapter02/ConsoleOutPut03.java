package chapter02;

public class ConsoleOutPut03{
	public static void main(String[] args) {
		//# System.out.println();
		System.out.println("안녕 하세요");
		System.out.println("안녕"+"하세요"); // + : 문자열 과 문자열을 연결가능
		System.out.println(2+4); // 정수일때 + 는 덧셈을 의미한다
		System.out.println(2+"4"); //정수와 문자열이 만났을때는 연결을 의미한다
		System.out.println("문자"+1);// 위와 동일하게 연결이다
		System.out.println("문자"+1+3); //동일 문자13 뜸
		System.out.println(1+3+"문자"); //이경우는 4문자 뜸 (앞에숫자 연산됨)
		System.out.println(); //그냥 공백
		
		int a =5; //자료형 Integer 정수에사용 a는 변수 
		String b="하세요";
		int c = 7;
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a+b); // 숫자와 문자열이니 연결
		System.out.println(a+c); //숫자와 숫자니 덧셈
		System.out.println(a+"안녕"+b);
		
		//# System.out.print();
		System.out.print("반갑"); //print 이기때문에 엔터 가없어서 안내려가고 연결됨
		System.out.print("습니다");
		System.out.print(7);
		
		System.out.print("\n"); // 이렇게 해야 println와 같은 의미이다!
		
		//# System.out.printf();
		
		int d = 45;
		String e ="화요일";
		String f = "남자";
		
		System.out.println("당신의 나이는 " + d + " 이고, 오늘은 " + e + " 이고, 당신은 "
				+ f + " 입니다.");
		System.out.printf("당신의 나이는 %d 이고, 오늘은 %s 이고, " //tf 라 % 사용가능
				+ "당신은 %s입니다. \n",d,e,f);
		
		int g = 100;
		String h = "일요일";
		String i = "여자";
		
		// 여자는 평균 나이가 100살이 될 것 입니다. 평균적으로 일요일에 많이 태어났습니다(예제)
		
		System.out.println(i + "는 평균 나이가 " + g + "살이 될 것 입니다."
				+ "평균적으로 " + h +"에 많이 태어났습니다.");
		System.out.printf("%s는 평균 나이가 %d살이 될 것 입니다."
				+ "평균적으로 %s에 많이 태어 났습니다 \n",i,g,h);
	}
}
