package com.mc.c_controll;

import java.util.Scanner;

public class A_homework {

	public static void main(String[] args) {
		q4();
	}

	// q1. 사용자로 부터 사다리꼴의 윗변, 아랫변, 높이를 입력받아 넓이를 구하시오
	// 사용자로 부터 정수를 하나 입력 받으세요
	private static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("윗변 길이를 입력하십시오:");
		int x1 = sc.nextInt();
		System.out.println("아랫변 길이를 입력하십시오:");
		int x2 = sc.nextInt();
		System.out.println("높이를 입력하십시오:");
		int y1 = sc.nextInt();
		int sum = 0;
		sum = (x1 + x2) * y1 / 2;
		System.out.println("사다리꼴의 넓이는 " + sum + "입니다.");

	}

	// q2. 사용자로 부터 아이디와 비밀번호를 입력받아
	// 사용자가 알맞은 아이디와 비밀번호를 입력하였다면, '로그인 되었습니다'를 출력하고
	// 아이디와 비밀번호가 맞지 않다면 '누구야 당신?' 을 출력하세요
	// 아이디 : test / 비밀번호 : java
	private static void q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디입력:");
		String id = sc.nextLine();
		System.out.println("비번입력:");
		String pw = sc.nextLine();
		if (id.equals("test") && pw.equals("java")) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("누구세용");
		}

	}

	// q3. 사용자가 입력한 정수가 짝수 인지 판단하고
	// 짝수라면 '짝수 입니다.'
	// 홀수라면 '홀수 입니다.' 를 출력하세요.
	private static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

	// q4.
	// 1P유저로부터 가위/바위/보 중 하나를 입력받으세요
	// 2P유저로부터 가위/바위/보 중 하나를 입력받으세요.
	// 1P유저기준에서 승/패/비김 여부를 출력해주세요.
	//3판 2선승제
	private static void q4() {
		Scanner sc = new Scanner(System.in);

		int sum = 0, win1 = 0, lose1 = 0, win2 = 0;
		while (true) {
			System.out.print("1P :");
			String p1 = sc.next();
			System.out.print("2P : ");
			String p2 = sc.next();
			if (p1.equals(p2)) {
				System.out.println("비김");
				sum += 1;
			}

			else if (p1.equals("가위")) {
				if (p2.equals("바위")) {
					System.out.println("패");
					lose1 += 1;
					win2 += 1;
				} else {
					System.out.println("승");
					win1 += 1;
				}
			}

			else if (p1.equals("바위")) {
				if (p2.equals("보")) {
					System.out.println("패");
					lose1 += 1;
					win2 += 1;
				} else {
					System.out.println("승");
					win1 += 1;
				}
			}

			else if (p1.equals("보")) {
				if (p2.equals("가위")) {
					System.out.println("패");
					lose1 += 1;
					win2 += 1;
				} else {
					System.out.println("승");
					win1 += 1;
				}
			}

			if (win1 >= 2 || win2 >= 2)
				break;

		}
		System.out.println(win1 + "승 " + sum + "무 " + lose1 + "패 하셨습니다.");
	}

	// q5.
	// 사용자로부터 정수 하나를 입력받아
	// 정수가 1~9사이의 숫자라면 그 수의 구구단을 출력하시오
	// 1~9사이의 숫자가 아니라면 "1~9 사이의 숫자를 입력해야합니다"를 출력

	// ex)
	// 정수 : 5
	// 5*1=10
	// 5*2=15
	// 5*3=20
	// 5*4=25
	// 5*5=30
	// 5*6=35
	// 5*7=40
	// 5*8=45
	// 5*9=50

	private static void q5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int dan = sc.nextInt();
		int su = 1;

		if (dan < 1 || dan > 9) {
			System.out.println("1~9사이의 숫자를 입력하세요");
			return;
		}

		while (su < 10) {
			System.out.println(dan + "*" + su++ + "=" + (dan * su));
		}
	}

}