package chapter02.EX03;

public class RangeOfvariableUse02 {

	public static void main(String[] args) {
         //변수의 생존 범위
		int value1 =3;
		if(value1 >3) {
			int value2 =5;
			
			System.out.println(value1);
			System.out.println(value2);
		}
		
		System.out.println(value1);
		System.out.println(value2); // if문 안에서선언됬기에 밖이니까 지금 오류임
	}

}
