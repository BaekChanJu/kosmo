package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지로 출력
		
		System.out.println("1번방법===========");
		
		String[] s = new String[5];
		
		s[0] = "냥";
		s[1] = "냥냥";
		s[2] = "냥냥냥";
		s[3] = "냥냥냥냥";
		s[4] = "냥냥냥냥냥";
		
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		
		
		System.out.println("2번방법===========");
		
		for(int i=0; i<5; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("3번방법===========");
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("4번방법===========");
		
		for(String k : s) {
			System.out.println(k);
		}
		System.out.println(Arrays.toString(s));
	}

}
