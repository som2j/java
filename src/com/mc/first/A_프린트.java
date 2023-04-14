package com.mc.first;

public class A_프린트 {

	public static void main(String[] args) {
		
		int age = 29;
		String name = "송강";
		double height = 186.5;
	
		//1. println() : 매개변수로 전달된 값을 출력하고 개행(줄바꿈)한다.
		
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		
		//2. print() : 매개변수로 전달된 값을 출력하고 개행(줄바꿈)하지 않음.
		System.out.print("이름 : "+name);
		System.out.print("나이 : "+age);
		System.out.print("키 : "+height);
		System.out.println();
		System.out.println("===============================");
		
		//3. printf() : 원하는 형식으로 문자열을 출력할 수 있다.
		// %d : 정수형, %c : 문자, %s : 문자열, %f : 실수형, %b : 논리형
		//	정렬방식 : %5d : 값을 표기하기 위해 5칸의 공간을 확보, 우측 정렬
		//				%-5d : 값을 표기하기 위해 5칸의 공간을 확보, 좌측 정렬
		//				%.2f : 소수점 아래 2자리 까지 표기
		
		System.out.printf("내 이름은 %s, 나이는 %d, 키는 %.2f 입니다.",name,age,height);
		
		System.out.println();
		System.out.println("===============================");
		System.out.printf("%10s : 20000원", "피자");
		System.out.println();
		System.out.printf("%10s : 15000원", "파스타");
		System.out.println();
		System.out.printf("%10s : 10000원", "햄버거");
		System.err.println();
		
		//escape 문자 : 특수한 역할을 하는 문자. \와 함께 사용
		// 줄바꿈
		// \n, \r\n
		System.out.println("나는 \n밥을 \n을먹었다.");
		// tab
		System.out.println("나는 \t 자바가 쉬워요");
		
		//16진수, 8진수
		System.out.println("16진수 100: " + 0x100);
		System.out.println("8진수 100: " + 0100);
		
		//\
		// " 을 문자로 사용 : \"
		// ' 을 문자로 사용 : \'
		System.out.println("\"");
		System.out.println("\\ ");
		
	}

}
