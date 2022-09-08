package chapter07.EX03;

class BB{ 
	
	int kor;
	int eng;
	int math;
	String name;
	
	BB(){}//기본생성자
	
	//매개변수가 4개인 생성자
	BB(int a, int b, int c, String name){ //객체 생성시 필드의 값을 초기화
		kor = a;
		eng = b;
		math = c;
		this.name = name;
		
	}
	
	
	//getter , setter 을 사용한 필드의 값 수정 < 중요
		//필드의 초기값 할당할 때 많이 사용됨
	//Setter 필드의 초기값을 할당
	//Getter 필드의 값을 출력
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) { //set이라는 객체가 kor은 기본값으로 설정하는것
		//return으로 저 위에 필드에 있는값으로 보내주는것
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	void show() { //메모리의 정보를 출력해주는 메소드
		System.out.println(kor + " , " + eng + " ," +
				math + " , " + name);
	}
	
	
}


public class Using_Constructor03 {

	public static void main(String[] args) {
			//필드의 값을 할당하는 3가지 방법
		
		BB bb1 = new BB();
		
		//1. 필드의 값을 직접 할당하는 방법
		bb1.kor =80;
		bb1.eng =50;
		bb1.math =40;
		bb1.name = "홍길동";
		bb1.show();
		
		//2.생성자를 사용해서 필드의 초기 값을 할당
		BB bb2 = new BB(80,50,40,"홍길동님");
		bb2.show();
		
		//3. Setter를 사용해서 값을 입력 <==
		BB bb3 = new BB();
		bb3.setEng(50);
		bb3.setKor(80);
		bb3.setMath(40);
		bb3.setName("백찬주");
		
		bb3.show();
	}

}
