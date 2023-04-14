package com.mc.b_operater;

public class B_증감연산자 {

	public static void main(String[] args) {
		
		//C => C++ (c에 객체지향 개념을 더했다) => C#
		
		//증감연산자: ++, --
		//값을 1 증감 시킴
		
		//전위연산자 (++변수) : 연산 전에 증감처리
		//후위연산자 (++변수) : 연산 후에 증감처리
		
		int first = 10;
		
		System.out.println(++first);	//11
		System.out.println(first++);	//11
		System.out.println(first--);	//12
		System.out.println(first);		//11
	}

}
