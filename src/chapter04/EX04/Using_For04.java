package chapter04.EX04;

public class Using_For04 {

	public static void main(String[] args) {
		//이중 For문 사용
		
		for(int i = 0; i<5 ; i++) { //이친구는 5번 반복  i가 0일때 j를 10번반복 i가1일떄 j를 10번반복
			for(int j=0 ; j<10; j++) { //이친구는 10번 반복
				System.out.println("i : " + i + ", j : " + j);
			}
			
			System.out.println();
		}
	}

}
