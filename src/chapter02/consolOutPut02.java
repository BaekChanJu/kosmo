package chapter02;

public class consolOutPut02 { //정수값 불러들임
	public static void main(String[] args) {
		// printf 는ln 이 아니라 \n 엔터를 넣어줘야한다 
		// %d : 정수 값을 불러 들임
		// %o : 입력한 정수값을 8진수로 나타내줌
		// %x : 입력한 정수값을 16진수로 나타내줌
		// %s : 문자열을 불러들임 , 뒤에다 입력할 문자열을 "" 안에 넣어주면됌 
		// %f : 실수 값을 불러들임
		// %4.2f : 전체 4자리 소숫점 이하 2자리 실수 불러들임 .까지 자리로 포함
		//4.3 이면 세자리 소수점이하 등등 
		
		System.out.printf("%d살 입니다. \n", 30); // 30 (10진수)
		System.out.printf("%o : 8진수 출력 \n", 30); // 8진수로 출력해줌(36나옴)
		System.out.printf("%x : 16진수 출력 \n", 30);
		System.out.printf("%s : 문자열을 불러들임 \n","목요일 입니다.");
		System.out.printf("%f : 실수 값을 불러들임 \n", 5.8);
		System.out.printf("%4.2f : 실수 불러들임 \n", 5.8); //전체 4자리 소숫점 이하 2자리
		
		System.out.printf("당신의 나이는 %d 이고, 몸무게는 %f 입니다 \n", 25,70.5);
		
		System.out.printf("%d, %f, %s \n", 30,20.55, "오늘");
	}
}
