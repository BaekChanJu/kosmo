package chapter02.bytecode;

class A { //A.class
}
class B{ //B.class
} 
class C{  //C.class
	class D{  //C$D.class
	}
}

public class ByteCode { //ByteCode.class

	public static void main(String[] args) {
		// 하나의 Java 소스 파일에서 여러개의 클래스 생성시 컴파일 파일 출력.
		//Public class는 하나만 와야 한다. 
		//Public class의 파일 이름이 java 파일 이름으로 지정 되어야한다
		
		//클래스는 여러개 올 수 있는데 퍼블릭 클래스는 하나만 가능하다라는 뜻 ~

	}

}
