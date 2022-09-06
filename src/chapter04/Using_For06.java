package chapter04;

public class Using_For06 {

	public static void main(String[] args) {
		//for문에서 무한루프
		
		//for(int i =0; ; i++) { //조건을 생략하면 무한루프됨
			//System.out.println(i);
			//}
		//System.out.println("문자열출력"); //for문 안에서 무한루프가 돌아가기에
		//이녀석이 오류라고 뜬다 원래는 괜찮은데.
		
		
		//무한루프 탈출법!
		for(int i =0; ; i++) {
			System.out.println(i);
			if(i == 100) {
				break;
			}
		}
		

	}

}
