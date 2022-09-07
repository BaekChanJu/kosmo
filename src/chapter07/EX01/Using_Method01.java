package chapter07.EX01;

class B{
	//1.리턴타입이 없고, 입력 매개변수가 없는 메소드
		//리턴타입이 없을때 void
	void print() {
		System.out.println("안녕");
	}
	
	//2.리턴타입이 int, 입력 매개변수가 없는 메소드
	int data() {
		
		return 3; //data라는 메소드를 호출하면 3이 리턴된다 라는 뜻 
		//3은 반드시 정수이어야 한다
		}
	
	//3.리턴타입이 double, 입력매개변수 2개인 메소드
		double sum(int a, double b) {
			return a + b;
		}
		
	//4.리턴타입이 없음(void), 내부 함수를 종료함(return)
			//메소드 내부에서 return; 을 만나면 메소드 종료
		void printMEthod(int m) {
			if(m<0 || m>12) { //0~12 까지만 입력가능
				System.out.println("잘못된 입력입니다");
				return; //void내에서 return 만나면 종료 //리턴되서 종료되면 아래코드는 작동x
			}else {
				System.out.println("입력한 달은 : " + m + "달 입니다");
			}
		}
		//==================================================
		
		boolean call() { //call()을 호출시 true를 반환한다
			
			return true;
		}
}

public class Using_Method01 {

	public static void main(String[] args) {
		//메소드 사용
		
		//객체 생성 (b)
		B b = new B();
		b.print(); 
		
		
		System.out.println(b.data()); //호출 구문을 사용해 출력해야함 객체에 넣는게 아니니까
		
		
		System.out.println("=====리턴 double, 입력매개변수2개=====");
		System.out.println(b.sum(3, 5.5));
		
		
		
		System.out.println("===리턴이없고 잘못된 입력일때 메소드종료=====");
		b.printMEthod(15); //잘못된 입력 출력, 그후 메소드종료
		
		
		System.out.println(b.call());

	}

}
