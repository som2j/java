package com.mc.c_controll;

import java.util.Scanner;

public class C_ifelseif {

	public static void main(String[] args) {


	

		// testIfElseIf();

		// 사용자로 부터 점수를 입력 받아 등급을 출력하세요
		// 90점 이상이면 A
		// 80점 이상 90점 미만이면 B
		// 70점 이상 80점 미만이면 C
		// 60점 이상 70점 미만이면 D
		// 60점 미만이면 F 로 등급입니다.

		// 이 때 F가 아닌 경우
		// 점수가 반올림했을 때 올림처리 되는 경우에는 (1의 자리수가 5 이상이라면)
		// 등급뒤에 +를 붙여준다.

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오:");
		int score = sc.nextInt();
		String grade;

		
		if(score<0||score>100)return;
		
		if (score < 60) {
			System.out.println("F");
			return; //메서드 종료
		}

		if (score >= 90) {

			grade = "A";
		}

		else if (score >= 80)

		{

			grade = "B";

		} else if (score >= 70) {

			grade = "C";

		} else{

			grade = "D";

		} 
		
		if(score%10>=5) {
			grade+="+";
		}

		/*
		 * if (score >= 90) { if (score - 90 >= 5) { grade = "A+"; } else { grade = "A";
		 * }
		 * 
		 * } else if (score >= 80) { if (score - 80 >= 5) { grade = "B+"; } else { grade
		 * = "B"; } } else if (score >= 70) { if (score - 70 >= 5) { grade = "C+"; }
		 * else { grade = "C"; } } else if (score >= 60) { if (score - 60 >= 5) { grade
		 * = "D+"; } else { grade = "D"; } } else { grade = "F"; }
		 */
		System.out.println("등급: " + grade);
	}

	private static void testIfElseIf() {
		// 다중조건문
		// 표현식
		// if(A조건식){실행코드}
		// else if(B조건식){실행코드} //A조건식에 일치하지 않는 경우 중에서 B조건식이 참인 경우 실행코드를 수행
		// else{실행코드}

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오:");
		int num = sc.nextInt();
		String res;
		if (num > 0) {
			res = "양수";

		} else if (num < 0) {
			res = "음수";
		} else {
			res = "0";
		}

		System.out.println(res);
	}
	
	// 1P유저로부터 가위바위보 중 하나를 입력받으세요
	   // 2P유저로부터 가위바위보 중 하나를 입력받으세요.
	   // 1P유저기준에서 승/패/비김 여부를 출력해주세요.
	   
	   private static void q1() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("1P :" );
	      String p1 = sc.next();
	      System.out.print("2P : ");
	      String p2 = sc.next();
	   }

}
