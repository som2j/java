package com.mc.z_homework;

import java.util.Iterator;
import java.util.Scanner;

public class Homework1130 {

	public static void main(String[] args) {
		// q1();
		// q2();
		//q3();
		//q4();
		//q5();
		//qq();
	}

	private static void q1() {
		// 사용자로부터 줄 수와 칸수를 입력받아서
		// 사각형을 별로 그리는 이중반복문 작성하시오

		// 출력예시
		// 줄 수 : 3
		// 칸 수 : 4
		// ****
		// ****
		// ****

		Scanner sc = new Scanner(System.in);
		System.out.println("줄 수를 입력하시오.");
		int row = sc.nextInt();
		System.out.println("칸 수를 입력하시오.");
		int column = sc.nextInt();

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	private static void q2() {
		// 사용자로부터 정수를 하나 입력받아
		// 사각형을 별로 그리는 데, 대각선에는 숫자를 출력하시오
		// 숫자는 1~사용자가 입력한 숫자까지.

		// 출력 예시
		// 숫자 : 4
		// 1***
		// *2**
		// **3*
		// ***4

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오:");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (i == j) {
					System.out.print(i);
					continue;

				}
				System.out.print("*");

			}

			System.out.println();
		}

	}

	private static void q3() {
//	    사용자로부터 정수를 하나 입력받아
		   //    정수만큼의 높이를 가지는 직각삼각형을  * 을 사용해 그리세요
		   //    이 때 빗변은 해당 행의값을 출력합니다.
		   //    출력예시 : 숫자 : 5      
		   //      1
		   //      *2
		   //      **3
		   //      ***4
		   //      ****5
		
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하시오:");
			int row = sc.nextInt();

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= row; j++) {
					if (i == j) {
						System.out.println(i);
						break;
					}

					System.out.print("*");

				}
				System.out.println();
			}

	
	}
	private static void q4() {
		// 사용자로부터 다운로드 받을 프로그램 갯수를 입력받아
		   // 다운로드 진행창을 출력하시오

		   // 사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
		   // [출력양식]
		   // n번째 프로그램 다운로드 받습니다.
		   // 0% 진행중...
		   // 20% 진행중...
		   // 40% 진행중...
		   // 60% 진행중...
		   // 80% 진행중...
		   // 100% 진행중...
		   // n번째 프로그램 다운로드 완료되었습니다.
		   // -------------------------------
		   // 모든 프로그램 다운로드 완료
		
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력:");
			int num = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				System.out.println(i + "번째 프로그램 다운로드 받습니다.");
				for (int j = 0; j <= 100; j += 20) {
					
						System.out.println(j + "% 진행중");
						
					}
				System.out.println(i + "번째 프로그램 다운로드 완료되었습니다.");
				}

			
			System.out.println("---------------------------");
			System.out.println("모든 프로그램 다운로드 완료");
		

	}

	private static void qq() {
		// 한 변을 구성하는 별의 개수가 사용자가 입력한 값이 되도록 하는 다이아몬드를 그리시오
	//   숫자 : 5
	//	  *
	//   ***
	//  *****
	// *******
	//*********
	// *******
	//  *****
	//   ***
	//	  *
			
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하시오:");
	int num = sc.nextInt();

	for (int i = 0; i < num; i++) {

		for (int j = 1; j < num * 2; j++) {
			if (j >= num - i && j <= num + i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

		}
		System.out.println();
	}

	for (int i = num - 2; i >= 0; i--) {

		for (int j = 1; j < num * 2; j++) {
			if (j >= num - i && j <= num + i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

		}
		System.out.println();
	}

}
	
	
	
	
	
	private static void q5() {
	//   사용자로부터 숫자와 방향(+,-) 를 입력받아
		   //   사용자가 입력한 방향에 따라 삼각형 밑변의 위치를 다르게 출력하시오.
		   //   
		   //   출력예시
		   //      숫자 : 4
		   //      방향(+ 또는 -) : -
		   //      ****
		   //      ***
		   //      **
		   //      *
		
		// 사용자로 부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int cnt = sc.nextInt();
		System.out.print("방향(+ 또는 -) : ");
		String dir = sc.next();

		if (dir.equals("-"))
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < cnt - i; j++) {
					System.out.print("*");

				}
				System.out.println();
			}
		else {
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
		

	}
	
	
}
