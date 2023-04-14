package com.mc.a_variable;

public class A_변수 {

	public static void main(String[] args) {
		
		//자바의 기본형 (primitive 타입
		//	논리형 : boolean
		//	문자형 : char
		//	숫자형 : byte, short, int, long, float, double
		
		//변수 선언
		
		//논리형
		boolean bool ; // 1byte
		//문자형	
		char ch;
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		//실수형
		float fnum;
		double dnum;
		
		//변수는 초기화(선언한 변수에 최초로 값을 할당하는 것)해야 사용할 수 있다
		bool=true;
		System.out.println(bool);
	
		ch='A';
		System.out.println(ch);
		
		bnum=1;
		System.out.println("bnum:"+bnum);
		
		snum=2;
		System.out.println("snum:"+snum);
		
		inum=3;
		System.out.println("inum:"+inum);
		
		lnum=4;
		System.out.println("lnum:"+lnum);
		
		//literal : 값(그 자체)
		//정수형 literal의 타입 : int(자바표준타입)
		//literal로 long값을 표현할 때는 뒤에 L을 붙여준다.
		long lnum2 = 20000000000L;
		System.out.println(lnum);
		
		//실수형 literal의 타입 : double(자바표준타입)
		//literal로 float 값을 표현할 때는 뒤에 f를 붙여준다.
		fnum=1.11f;
		System.out.println(fnum);
		
		dnum=1.11;
		System.out.println(dnum);
		
		//String: 참조형 타입
		// 문자열을 표현하기 위해 사용
		//한글자만 표현하는게 char
		String name= "송강";
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		//같은 타입의 여러 변수를 동시에 선언
		int k, l, m;
		//같은 타입의 여러 변수를 선언과 동시에 초기화
		int n=12, o=20, p=25;
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
		
		
	}
}
