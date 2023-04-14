package com.mc.b_operater;


 import java.util.Scanner;
 

public class F_삼항연산자 {

	public static void main(String[] args) {
	
		//조건식 : 연산 결과가 논리값으로 나오는 식
		//삼항연산자 : 조건식? 참일때 연산 또는 값 : 거짓일때 연산 또는 값
		
		int x = 3;
		int y = 3;
		
		int res = x>y ? x+y : x-y;
		System.out.println(res);
				
		q2();
				
		q1();
		
	}

	private static void q1() {
		// 사용자가 입력한 숫자가 
	      // 0보다 크면 '양수'를  
	      // 0보다 작으면 '음수'를  
	      // 0이라면 0을 출력 하시오
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("하나의 정수를 입력하세요:");
		int input=sc.nextInt();
		
		String res2=input>0 ? "양수": input<0?"음수":"0";
		System.out.println(res2);
	}

	private static void q2() {
		//사용자로부터 하나의 문자를 입력받아 입력받은 문자가 y 또는 Y라면 y를 입력하셨습니다.
		//아니라면 잘못 입력하셨습니다.
		
		Scanner sc= new Scanner((System.in));
		System.out.print("Y또는 Y를 입력하세요:");
		String input = sc.nextLine();
		String res2=input.equals("y")||input.equals("Y")?"Y를 입력하셨습니다.":"잘못 입력하셨습니다.";
		
		System.out.println(res2);
	}
}
