package com.mc.b_operater;

public class G_문자결합연산 {

	public static void main(String[] args) {
		
		String name="차은우";
		String job="가수";
		
		String res="이름은 "+name+"입니다. 직업은 "+job+"입니다.";
		System.out.println(res);

		//문자열과 다른 타입의 값을 결합할 때
		//+의 피연산자 중 하나라도 문자열이면 문자열 결합이 수행된다.
		System.out.println(10+"호 기차");
		System.out.println("이번 기차는"+10+25+"호 기차");
		System.out.println("이번 기차는"+(10+25)+"호 기차");
	}

}
