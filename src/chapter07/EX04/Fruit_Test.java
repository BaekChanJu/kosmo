package chapter07.EX04;

class Fruit{
	
	//1.필드
	String name; //과일의 이름
	String color; //과일의 색상
	int count ; //과일의 갯수
	int sugar; //과일의 당도
	
	//2.생성자
	
	Fruit(){
		
	}
	
	
	Fruit(String name, String color, int count, int sugar){
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugar = sugar;
	}
	
	//3.메소드
	void show() {
		System.out.println("이름 : " +name + " 색상" + color +
				" 갯수 : " + " 당도 : " +  sugar);
	}
	
	
	//4.셋게터

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	
	
}

public class Fruit_Test {
	public static void main(String[] args) {
		//1.banana 직접입력/직접출력으로
		Fruit banana = new Fruit();
		
		banana.name = "바나나";
		
		System.out.println(banana.name);
		System.out.println(banana.color);
		System.out.println(banana.count);
		System.out.println(banana.sugar);
		banana.show();
		
		
		//2.apple 생성자로 4개의 필드에 초기값할당 show()로 풀력
		Fruit apple = new Fruit("사과","빨강",1,7);
		apple.show();
		
		//3.strawberry : setter을 사용해서 할당 getter로 출력
		Fruit strawberry = new Fruit();
		
		strawberry.setName("딸기");
		strawberry.setColor("빨강");
		strawberry.setCount(20);
		strawberry.setSugar(9);
		
		System.out.println(strawberry.getName());
		System.out.println(strawberry.getColor());
		System.out.println(strawberry.getCount());
		System.out.println(strawberry.getSugar());
		strawberry.show();

	}

}
