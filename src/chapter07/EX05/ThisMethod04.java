package chapter07.EX05;


class Car{
	String companyName; //현대자동차
	String color; //검은색
	double maxSpeed; //200.0 km
	
	Car(){
		companyName = "현대차";
		color = "검정";
		maxSpeed = 200.0;
	}
	
	Car(String companyName){
		this();
		this.companyName = companyName;
		}
	
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
		}
	
	Car(String companyName, String color, double maxSpeed ){
		this(companyName, color);
		this.maxSpeed = maxSpeed;
		}
	
	void print() {
		System.out.println("차이름 : " +companyName
				+"색상 : " + color + " 출력 : " + maxSpeed);
	}
}


public class ThisMethod04 {
	

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.print();
		
		Car car2 = new Car("기아차");
		car2.print();
		
		Car car3 = new Car("기아차","레드");
		car3.print();
		
		Car car4 = new Car("기아차","레드",250.0);
		car4.print();
		
	}

}
