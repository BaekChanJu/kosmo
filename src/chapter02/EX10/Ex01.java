package chapter02.EX10;

public class Ex01 {

	public static void main(String[] args) {
		
		// 각 변수의 평균값을 계산하시오.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd =75.5;
		double ee =60.3;
		
		double avg = (aa + bb + cc +dd +ee) /5;
		
		System.out.println("각 과목의 평균 값은" + avg );
		System.out.printf("각 과목의 평균 값은 : %4.2f \n", avg );
		
		
		
		
		
		//수학 국어 영어의 평군값과 과확 사회의 각각 평균 값을 구하라
		
		
		int MateScore = 80;
		int koreanScore = 78;
		int EngScore = 95;
		
		double ScienceScore =75.5;
		double SocieyyScore = 60.3;
		
		int avg1 = (MateScore + koreanScore + EngScore) /3;
		double avg2 =(ScienceScore + SocieyyScore) /2;
		double avg3 =(MateScore + koreanScore +
				EngScore + ScienceScore + SocieyyScore) /5;
		
		System.out.println("국영수 의 평균 값은" + avg1);
		System.out.printf("과사의 평균 값은 %4.3f \n",avg2);
		System.out.println("모든 과목의 평균값은 :" + avg3);
	}

}
