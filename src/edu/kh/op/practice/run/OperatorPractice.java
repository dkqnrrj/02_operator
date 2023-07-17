package edu.kh.op.practice.run;

import java.util.Scanner;

public class OperatorPractice {

	
	public void practice1(){
		//인당 사탕 개수 계산 로직
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		int myCandy = input2 / input1;
		
		int leftCandy = input2 % input1;
		
		
		System.out.println();
		
		
		
		
		System.out.print("1인당 사탕 개수 : " + myCandy);
		
		
		
		System.out.println();
		
		
		
		System.out.print("남는 사탕 개수 : " + leftCandy);
	}
	
	
		public void practice2() {
		// 특정 학생의 성적 출력 로직
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String input1 = sc.next();
			
			System.out.print("학년(정수만) : ");
			int input2 = sc.nextInt();
			
			System.out.print("반(정수만) : ");
			int input3 = sc.nextInt();
			
			System.out.print("번호(정수만) : ");
			int input4 = sc.nextInt();
			
			System.out.println("성별(남학생/여학생) : 남학생");
			
			
			
			System.out.print("성적(소수점 아래 둘째 자리까지) : ");
			double input5 = sc.nextDouble();
			
			
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.", input2, input3, input4, input1, input5 );
			
			
		
	}
		
		
		public void practice3() {
			
			// 과목 합계, 평균 계산 로직
			
			
			
			Scanner sc = new Scanner(System.in);
			
			
			
			System.out.print("국어 : ");
			int input1 = sc.nextInt();
			
			System.out.print("영어 : ");
			int input2 = sc.nextInt();
			
			System.out.print("수학 : ");
			int input3 = sc.nextInt();
			
			
			int sum = input1 + input2 +input3;
			
			double Aver = sum / 3;
			
			
			//boolean result = (input1 >= 40) && (input2 >= 40) && (input3 >= 40) && (Aver >= 60);
			
			String result = (input1 >= 40) && (input2 >= 40) && (input3 >= 40) && (Aver >= 60) ? "합격" : "불합격";
			
			System.out.println();
			
			System.out.println("합계 : " + sum);
			
			System.out.printf("평균 : %.1f", Aver);
			
		//	System.out.println(result ? "합격" : "불합격");
			
			System.out.println();
			
			System.out.println(result);
		}
		
}
