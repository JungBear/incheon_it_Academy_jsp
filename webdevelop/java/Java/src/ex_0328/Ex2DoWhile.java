package ex_0328;

import java.util.Scanner;

public class Ex2DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println(sum);

		int n = 11;
		do {
			System.out.println(i);
		}while(n <= 10);
		
//		국어 영어 수학점수를 입력받고
//		한과목이라도 0점 미만 또는 100초과면 다시 입력
		
		Scanner sc = new Scanner(System.in);
		int korean = 0, english = 0, math = 0;
		
		do {
			System.out.println("국어 점수 : ");
			korean = sc.nextInt();
			
			System.out.println("영어 점수 : ");
			english = sc.nextInt();
			
			System.out.println("수학 점수 : ");
			math = sc.nextInt();
		}while(korean < 0 || english < 0 || math < 0 || korean > 100 || english > 100 || math > 100);
		
		System.out.println("국어 : " + korean + "점");
		System.out.println("영어 : " + english + "점");
		System.out.println("수학 : " + math + "점");
		

	}

}
