package chapter02.EX03;

public class RangeOfVaribleUse {

	public static void main(String[] args) {
       //변수의 생존기간 : {} 블록 내에서만 생존가능
		
		int value1 =3;
		
		{
			int value2 =5;
			System.out.println(value1);
			System.out.println(value2);
		}
		
		System.out.println(value1);
		//System.out.println(value2);//오류 발생 블록안에 안있으니깐
	}

}
