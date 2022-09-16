package chapter10.EX09;

public class VIPCustomer extends Customer { //필드 다가져옴 커스터머에서
	//int customerID; //고객의 ID
	//String customerName; //고객 이름
	//String customerGrade; //고객의 등급 (VIP, Gold, Silver)
	//int bonusPoint; //고객의 등급에 따라서 포인트 적립
	//double bonusRatio; //고객 등급에 따라서 물품구매시 할인율

	
	private int agentID;
	double saleRatio;
	
	VIPCustomer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	
	VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID,customerName); //부모의 매개변수2개인 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	
	//교재 339페이지 까지으 ㅣ내용임

}
