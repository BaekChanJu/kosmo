package chapter07.EX01;

public class Using_Method06 {
	
	static int add(int[] a) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum = 0;
		
		for(int i=1; i<a.length; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				sum += i;
				}
			}
		System.out.println("더한값은 : " + sum + "입니다" );
			return 0;
		}
	//=======================================================================
	
	static int div(int[] a) {
		//들어온 배열의 모든 값을 빼서 리턴해라
		int sum = 0;
		
		for(int i=1; i<a.length; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				sum -= i;
				}
			}
		System.out.println("뺸 값은 : " + sum + "입니다" );
			return 0;
		}
	//=======================================================================
	
	static int mul(int[] a) {
		//들어온 배열의 모든 값을 곱해서 곱한값을 리턴해라
		int sum = 1;
		
		for(int i=1; i<a.length; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				sum = sum * i;
				}
			}
		System.out.println("곱한값은 : " + sum + "입니다" );
		return 0;
	}
	//============================================================
	static double avg (int[] a) {
		//들어온 배열의 모든 값을 평균을 내서 리턴
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<a.length; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				sum += i;
				count ++;
				}
			}
		System.out.println("더한값의 평균은 : " + sum/(double)count + "입니다" );
		return 0.0;
	}

	
	
	public static void main(String[] args) {
	//1~100까지 7의 배수만 저장후 각 메소드 호출
		
		int[] arr = new int[100];
		
		System.out.println("====7의배수 더한값====");
		add(arr);
		
		System.out.println("====7의배수 뺸값====");
		div(arr);
		
		
		System.out.println("====7의배수 곱한값====");
		mul(arr);
		
		System.out.println("====7의배수더한값의 평균====");
		avg(arr);
		
		
		
		

	}

}
