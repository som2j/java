package com.mc.c_controll;

import java.util.Scanner;

public class B_ifelse {

	public static void main(String[] args) {
		// testIfElse();

		// 사용자가 입력한 숫자가
		// 0보다 크면 '양수'를
		// 0보다 작으면 '음수'를
		// 0이라면 0을 출력 하시오

		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오:");
		int num = sc.nextInt();
		String res;
		if (num > 0) {
			res = "양수";

		} else {
			if (num < 0) {
				res = "음수";
			} else {
				res = "0";
			}
		}
		System.out.println(res);

	}

	private static void testIfElse() {
		// 양자택일 조건문
		// [표현식]
		// if(조건식){실행코드}else{실행코드}

		// 사용자로부터 이름을 입력받아, 만약 이름이 본인의 이름이면
		// 안녕하세요를 출력하고 아니면 당신 누구야를 출력합시다.

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		String comment = "";

		if (name.equals("차은우")) {
			comment = "안녕하세요";
		} else {
			comment = "너 뉘기야";

		}
		// String comment= name.equals("차은우")?"안녕하세요":"너 뉘기야";
		System.out.println(comment);
	}

}
