package chapter04.EX06;

public class Using_do_While {

	public static void main(String[] args) {
		
		
		//while : 조건을비교후 실행문을실행 / 와일은 조건확인후(참일때) 실행문을 풀력하지만
		
		
		//do while : 1번은 실행조건을 비교후 실행 / 두와일은 
		//실행문을무저건1번은 출력하고 조건을 비교함
		
		
		/* do{
		   실행문
		   }while(조건); 
		    */
		
		
		
		//1.while 과 do while문 비교
		
		
		
		int a;
		a=11;
		System.out.println("=====while문 (조건이 참일때만)=======");
		while(a<1) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		
		
		
		System.out.println("===do_while문 (조건과 상과없이 실행문을 한번실행)==");
		a=11;
		
		do {
			System.out.println(a+ " ");
			a++;
		}while(a<10);
		
		
		System.out.println();
		
		
		
		
		
		
		//while 문과 do while문 10번 실행
		System.out.println("======= while============");
		
		
		a=0;
		while( a<10) {
			System.out.print(a+ " "); //print 하면가로로 나옴
			a++;
	   }
		System.out.println();
		System.out.println("===do while===========");
		
		a=0;
		do {
			System.out.print(a +" ");
			a++;
		}while(a<10);
		
	}

}
