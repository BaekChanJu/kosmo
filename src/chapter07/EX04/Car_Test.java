package chapter07.EX04;

class Car{
	String company; //제조회사
	String model; //자동차 모델
	String color; //색상
	double maxSpeed; //최대 출려
	
	
	//생성자
	Car(){}
	
	Car(String company,String model,String color,double maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드
	void show() {
		System.out.println("제조회사 와 차이름 " + company +model+"색상과 마력"
				+ color + maxSpeed);
	}
	
	//겟터세터

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}

public class Car_Test {

	public static void main(String[] args) {
		//객체생성
		//car1 현대자동차 그랜저 < 직접입력으로
		Car car1 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "그렌저";
		car1.color = "회색";
		car1.maxSpeed = 330.5;
		
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		//car2 쌍용자동차 체어멘 < 생성자값입력,show로 출력
		Car car2 = new Car("쌍용자동차","체어맨","블랙",320.5);
		car2.show();
		
		//car3 기아자동차 k9 <셋게터로
		Car car3 = new Car();
		car3.setCompany("기아자동차");
		car3.setModel("k9");
		car3.setColor("화이트");
		car3.setMaxSpeed(340.0);
		
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println(car3.getMaxSpeed());
		

	}

}
