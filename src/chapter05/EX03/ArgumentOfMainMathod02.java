package chapter05.EX03;

public class ArgumentOfMainMathod02 {

	public static void main(String[] args) {
		//Main Method로 값 던져주기
		
		//args.length 내용 출력하기
			//안녕하세요 3 5.8 10 11 12 오늘 날씨
		System.out.println(args.length); //총 8개있으니 8이 뜬다 / 인덱스번호는 0~7
		
		
		
		//Main Method로 넘겨진 값을 자동으로 출력하기
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i] + " "); // 방순서마다의 값이 잘 나온다
			//안녕하세요 3 5.8 10 11 12 오늘 날씨
		}
		
		System.out.println("=====Enhanced For======");
		for(String k : args) {
			System.out.println(k + " ");
		}

	}

}
