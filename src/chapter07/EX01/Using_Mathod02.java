package chapter07.EX01;


class Circle {
	int r; //반지름
	String name;
	
	Circle(int r,String name){//생성자함수
		this.r = r;
		this.name = name;
	}
	
	void call() { //메소드
		double result = 3.14 * r * r;
		System.out.println(name + "의 넓이는 " + result + "입니다");
	}
	
	
}

public class Using_Mathod02 {

	public static void main(String[] args) {
		//원의 지름을 넣었을때 전체 넓이를 구하는 객체를 생성후 출력
		//	피자 : 반지름10  전체넓이를 구하셈 (r x r x 원주율)
		// 도넛 : 반지름5
		//피자의 넓이는 ? 입니다 , 도넛의 넓이는 ? 입니다 출력하세요
		
		Circle pizza = new Circle(10, "피자");
		pizza.call();
		
		Circle donut = new Circle(5, "피자");
		donut.call();

	}

}
