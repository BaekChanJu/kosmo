package chapter10.EX01;



class Fruit{ //과일 <== 부모 클래스
	String name; //이름
	String color; //색상
	int large ; //크기
	
	void eat() {
		System.out.println("모든과일은 맛이 있습니다");
	}
	void print() {
		System.out.println(name+ " " + color + " " + large);
	}
	
}



class Apple extends Fruit{ //사과 / 자식
	int price = 1000;
	int appleCount;
	
	void printApple() {
		System.out.println("난 사과" + price+"원");
		System.out.println("사과의 갯수 : " + appleCount);
	}
}



class Orange extends Fruit{ //오렌지 / 자식
	int price = 2000;
	
	
	void printOrange(int price) {
		this.price = price;
		System.out.println("난 오렌지"+price+"원");
	}
}



class Banana extends Fruit{ //바나나 / 자식
	int price = 3000;
	
	void printBanana(){
		System.out.println("난 바나나"+price+"원");
		
	}
}



public class Using_Inheritance02 {

	public static void main(String[] args) {
		
		//부모
		System.out.println("=====부모 클래스=====");
		Fruit f = new Fruit();
		
		f.name = "종합과일";
		f.color = "다양함";
		f.large = 100;
		
		f.eat();
		f.print();
		
		
		
		
		//자식 사과
		System.out.println("=====자식 사과=====");
		Apple a = new Apple();
		
		a.name = "사과";
		a.color = "빨강";
		a.large = 20;
		a.appleCount = 30;
		
		a.eat();
		a.print();
		a.printApple();
		
		//자식 오렌지
		System.out.println("=====자식 오렌지=====");
		Orange o = new Orange();
		
		o.name ="오렌지";
		o.color = "주황";
		o.large = 30;
		
		o.eat();
		o.print();
		o.printOrange(0);
		
		//자식 바나나
		System.out.println("=====자식 바나나=====");
		Banana b = new Banana();
		
		b.name = "바나나";
		b.color = "노란색";
		b.large = 50;
		
		b.eat();
		b.print();
		b.printBanana();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
