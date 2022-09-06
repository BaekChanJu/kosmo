package chapter03.EX06;

public class AssignmentOperrator {

	public static void main(String[] args) {
		// 대입 연산자의 축약 표현
		/*
		 * 산술 연산
		 a = a + b 		축약하면    a += b  //a와b를 더해서 다시 a 에넣는다
		 a = a - b               a -= b
		 a = a * b               a *= b
		 a = a / b               a /= b
		 
		 비트연산 축약
		 a = a & b               a &= b
		 a = a | b               a |= b
		 
		 쉬프트 연산의 축약
		 a = a >> b              a >>= b
		 a = a << b              a <<= b
		 
		 논리 쉬프트 축약
		 a = a >>> b             a >>>= b
		 
		 */
		
		int value1 = 3;
		value1 = value1 + 3; //= 대입연산자는 제일 나중에 적용이된다
		System.out.println(value1);
		System.out.println("======================");
		
		int value2; //변수 선언
		value2 = 1; //변수에 값 할당 : 
		System.out.println(value2 += 2); // >  value2 = value2 + 2
		System.out.println(value2 -= 2);
		System.out.println(value2 *= 2);
		System.out.println(value2 /= 2);
		System.out.println(value2 %= 2);
		System.out.println("======================");
		
		System.out.println(value2 <<= 2); // value2 << 2
			// 1 을 왼쪽으로 두번 1* 2^2 즉 4
		System.out.println(value2 >>= 2);
		
		
	}

}
