package chapter05.EX04;

import java.util.Arrays;

public class Using_String03 {

	public static void main(String[] args) {
		//String vs 다른 참조자료형 (배열 등등) 비교
		//String에 저장된 값은 수정이 불가, 새롭운 값이 힙영역에 생성됨
		
		
		//1.String(객체의 내용 변경이 불가함 ==> 새로운 객체를 생성해야함)
		String str1 = new String("안녕");
		String str2 = str1; //스텍 영역의 객체 주소를 복사한것임 // true
		
		System.out.println(str1 == str2);  //영역모양 [ 스택영역str1][ 힙영역(안녕)]
		//  ==을 쓰면 영역모양 [ 스택영역str1 ,str2][ 힙영역(안녕)]
		//둘다 지금 힙영역의 안녕이라는 주소를 가지고 오는것이다 그래서 true
		System.out.println(str1); //안녕
		System.out.println(str2); //안녕

		
		
		str1 = "안녕하세요";  // [str1,str2] [안녕]  지금 이상태로 두개가 안녕이라는 주소를
		//받고있는데!! 안녕하세요를 설정하면 안녕이 안녕하세요로 바뀌는 것이아니라 추가되는것이다
		//[str1,str2] [안녕,안녕하세요] 이모양이 되버리는 것이다
		System.out.println(str1 == str2); //false가 나옴
		//str1은 안녕하세요로 수정이되는게 별도로 안녕하세요라는 새로운 값이 생긴것임 
		System.out.println(str1); //안녕하세요 (값은 덮어써써나오는듯)
		System.out.println(str2); //안녕
		
		
		
		
		
		System.out.println("==========다른참조자료형은 수정이된다==========");
		//2.다른참조 자료형인 경우는 수정이 된다 (배열)
		
		int[] arr1 = new int[] {3,4,5}; //선언과 할당 한번에함
		int[] arr2 = arr1; // arr1스택영역의 주소값을 복사해서 arr2에 넣어라 이뜻임
		//스택의 값을 복사한다 이뜻
	
		
		
		//두 변수의 주소가 같은지 먼저 확인한다
		System.out.println(arr1 == arr2); //true(참조자료형이니까 값이아닌 스탯의 주소비교)
		//[스택존 arr1][힙존 3,4,5] 이걸
		//[스택존 arr1,arr2][힙존 3,4,5] > 여기서 arr1이 가지고있는 3,4,5 라는주소를
		//그래도 arr2에게도 복사해준다라는 것임
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//값을 수정시
		//값을 수정시
		arr1[0] = 6; //힙영역에 안녕,안녕하세요 같이 값이 추가되는것이아니라
		arr1[1] = 7; // 값을 수정하는 것이기때문에 수정하면 그냥 같이 바뀐다
		arr1[2] = 8;
		
		System.out.println(arr1 == arr2); //true
		
		System.out.println(Arrays.toString(arr1)); 
		System.out.println(Arrays.toString(arr2));
		
		
		
		//결론 String은 값을 수정이 아닌 추가해버리는 것 값을 출력할땐 수정된 값을고 덮힌다
		//배열같은 다른 참조 자료형은 값을 수정이 수정한것으로 잘 변한다는 것
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
