package chapter03.EX04;

public class LocalOperator {

	public static void main(String[] args) {
		//논리 연산자(&&앤, ||오, ^:XOR, !낫)
		// -- 연산자 좌측과 우측에는 트루,풜스
		
		//&& 는 하나라도 false면 false 둘다 true여야 true다 ~이거나
		//|| 는 하나라도 true면 true다 둘다false여야 false다 ~이고
		
	//AND 연산자 : &&
		System.out.println(true&&true); //t
		System.out.println(true&&false); //f
		System.out.println(false&&false); //f
		System.out.println(true&&(5<3)); //f
		System.out.println((5<=5)&&(7>2));//t
		
		//OR 연산자 : || 하나만 트루면 트루
		System.out.println(true||false);
		System.out.println(true||(5<3)); //t
		
		//XOR 연산 : ^    좌우과 동일하면 false, 하나라도 다르면 true
		System.out.println(true^true); //두개가 같으니 f 나옴
		System.out.println(false^(5<3)); //f
		
		//NOT : !   !을 달아주면 값이 반대로 출력됨
		System.out.println(!true);
		System.out.println(false || !(5<3)); //t
		
		//비트 연산자로 논리 연산자를 수행
		System.out.println(true&true); // t
		System.out.println(true&false); //f
		System.out.println(true | (5<3)); //t
		System.out.println("====================");
		
		//숏 서킷
			//왼쪽의 결과 값만으로 유추가능할떄 오른쪽의 값을 생행하지 않는 것
		
		// -- 논리 연산자에서만 작동됨, 비트연산자에서는 작용이 안됨
		//비트 연산자는 진법 바꿔서 하던거
		//숏서킷은 (&&, || , ^ ,!) 논리연산자에서만 !!!!
		//비트연산자 & | ^ ~ 에서는 안됨
		
		int value1 =3;
		System.out.println(false&& ++value1<6); //숏서킷
		//에초에 처음에 풜스가 들어가서 위에는 풜스임 뒤에값은 안봐도됨
		System.out.println(value1); //원래 4가찍혀야 되는 3이찍힘 한마디로
		//&& 뒤에가 숏 서킷 되서 실행이안된거임 !! 반대로
		
		int value2 =3;
		System.out.println(true&& ++value2<6);
		System.out.println(value2); //4
		//앞에가 트루니 뒤에꺼까지 확인해야 실행이 되니까 ++ 가 잘적용해 4가 나온거임
		
		int value3 =3;
		System.out.println(false & ++value3<6);
		System.out.println(value3); //4 비트연산자라 숏서킷 안됌
		
		int value4 =3;
		System.out.println(true || ++value4 >6);
		System.out.println(value4); //3 숏서킷 됌
			}

}
