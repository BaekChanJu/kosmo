package chapter10.EX09;

public class Customer {

	int customerID; //고객의 ID
	String customerName; //고객 이름
	String customerGrade; //고객의 등급 (VIP, Gold, Silver)
	int bonusPoint; //고객의 등급에 따라서 포인트 적립
	//vip는 10퍼 골드는 8퍼 실버는 5퍼 이렇게
	double bonusRatio; //고객 등급에 따라서 물품구매시 할인율
	//vip 5퍼 골드는 3퍼 실버는0.01퍼
	
	Customer(){ //그냥넣을수있는데 메소드 호출로도 가능하다 보여주기용
		//필드의 기본값 할당을 메소드 호출로 적용하기!
		initCustomer(); //this가 생략되있음 / 자신객체의 메소드호출이란뜻
	}
	
	
	Customer(int customerID, String customerName){ //그떄그때 달라지는 값이니 매개변수받아서
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	
	void initCustomer() { //이 메소드를 호출하면 초기값이 할당됨 / 이건기본정해진값이니 매개변수 없어도됨
		this.customerGrade = "Silver";//고객이 가입하면 기본으로 실버적용
		this.bonusRatio = 0.01;
		
	}
		
		
}

