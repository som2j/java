package com.mc.b_operater;

public class E_논리연산자 {

	public static void main(String[] args) {
		
	//논리연산자 : &&, ||
	//&& : 두 항이 모두 true일 때 true, ~면서, 그리고, and
	//|| : 두 항이 모두 false일 때, 또는, ~거나 ,or (두 항 중 한 항이 true이면 true이다.)
		
		System.out.println(2>=2 || 2>3);//뒤에 노란줄 Dead Code (자바가 읽지 않음 이미 앞에가 true이기때문에)
		System.out.println(2>1 || 3>2);
		System.out.println(3<2 || 2>3);
		System.out.println(2<2 || 2<3);
		
		System.out.println(2>=2 && 2>3);//뒤에 노란줄 Dead Code (자바가 읽지 않음 이미 앞에가 true이기때문에)
		System.out.println(2>1 && 3>2);
		System.out.println(3<2 && 2>3);
		System.out.println(2<2 && 2<3);
		
		boolean a= true;
		boolean b= false;
		boolean c= false;
		boolean d= false;
		
		System.out.println(a||b&&c||d);
		//and부터 연산하여 결과값 true
		System.out.println((a||b)&&c||d);
		//괄호 안부터 연산
	}

}
