package chapter07.EX04;

//반드시 this 키워드를 사용해야하는 경우! :
	//- 생성자, 메소드의 매개변수이름, 필드이름이 동일한 경우 필드이름에 this를
	// 명시해야한다!

class AA{ //지금은 this 키를 명시하지 않은 경우
	int m; //1.필드이름 m
	int n;
	
	void init (int m , int n) { //2.매겨변수이름m 
		m = m; //3.필드의m 
		n = n; //이렇게 m 3개 모두 지역변수!
		//this 키가 없으니까 맨처음 앞에 m은 매개변수로 들어간 m을 뜻한다
		
		
		//필드에서 설정한 m이 매개변수를 타고 들어와 마지막 m으로 들어가면 
		//맨앞에 m이 필드의 m으로 들어가는 순서인데 this가 없으니까
		//맨앞에 m은 필드로 들어가는것이아니라 매개변수에 있는 지역변수 m을 의미해버린다
	}
}

class BB{
	int m; 
	int n;
	
	void init(int m , int n) {
		this.m = m; //여긴 this.m : 필드,  m : 지역변수
		this.n = n;
		
		//여기는 그럼 m이 매개변수를 타고 들어와서 맨마지막m에 들어와서
		//this.m을 만나 필드에있던 m으로 들어가는것이다
	}
}

public class ThisKeyword02 {

	public static void main(String[] args) {
		
		AA aa= new AA(); //기본생성자호출임
		
		aa.init(10,20);
		System.out.println(aa.m);// 0나옴 
		System.out.println(aa.n);
	
		BB bb= new BB();
		bb.init(10,20);
		
		System.out.println(bb.m);

	}

}
