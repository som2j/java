package com.mc.f_array;

import java.util.Arrays;
import java.util.Iterator;

public class A_array {
	

	public static void main(String[] args) {
		
		//studyArray();
		
		//studyArray2();
		
		//studySwallowCopy();
		
		//studyDeepCopy();
		
		
		
		
		
		
	
}

	private static void studyDeepCopy() {
		//깊은 복사
		
		String[] foodArr= {"치킨", "피자", "감튀", "파스타", "햄버거"};
		String[] copyArr = new String[foodArr.length];
		
		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i]=foodArr[i];
		}
		
		System.out.println("copyArr :"+Arrays.toString(copyArr));
		
		copyArr[2] = "아이스크림";
		
		System.out.println("foodArr :"+Arrays.toString(foodArr));
		System.out.println("copyArr :"+Arrays.toString(copyArr));
		
		System.out.println(Arrays.toString(foodArr));
		System.out.println(Arrays.toString(copyArr));
	}

	private static void studySwallowCopy() {
		//얕은 복사 (하나의 객체를 두 레퍼런스가 참조하도록 객체의 주소를 복사하는 것)
		String[] foodArr= {"치킨", "피자", "감튀", "파스타", "햄버거"};
		String[] copyArr = foodArr;
		
		copyArr[2] = "아이스크림";
		System.out.println("foodArr의 주소: " +System.identityHashCode(foodArr));	//주소값을 반환해주는 함수
		System.out.println("foodArr의 주소: " +System.identityHashCode(copyArr));
		
		System.out.println(Arrays.toString(foodArr));
		System.out.println(Arrays.toString(copyArr));
	}

	private static void studyArray2() {
		int sum;
		int sumArr = 0;
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		sum=num1+num2+num3+num4+num5;
		
		int[] iArr= {10,20,30,40,50};
		for (int i = 0; i < iArr.length; i++) {
			sumArr += iArr[i];
		}
		
		System.out.println(sum);
		System.out.println(sumArr);
	}

	private static void studyArray() {
		//배열 : 같은 타입의 데이터들을 하나의 묶음으로 다루는 자료 구조
		//		 배열에 저장된 각 데이터들은 해당 데이터에 접근할 수 있는 index 번호를 부여 받는다.
		//		 배열은 참조자료형으로 JVM heap 영역에 저장된다..
		//	 	 참조형 변수(reference)를 통해 heap 영역의 배열에 접근할 수 있고,
		//		 	index를 통해 배열 안의 데이터에 접근할 수 있다.
		
		//배열 생성 해보기
		//String 타입의 데이터를 5개 보관할 수 있는 배열 생성.
		String[] sArr = new String[5];
		
		sArr[0] = "피자";
		sArr[1] = "파스타";
		sArr[2] = "햄버거";
		sArr[3] = "초밥";
		sArr[4] = "감튀";	
		
		System.out.println(sArr);
		System.out.println(sArr[2]);
		
		//배열의 선언과 동시에 초기화
		//크기가 5인 int[]을 선언하고 각 인덱스에 5,4,3,2,1 값을 초기화
		int[] iArr = new int[] {5,4,3,2,1,};
		
		//iArr.length : 배열의 크기
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i]);
		}
		
		System.out.println();
		
		//배열 리터럴 초기화
		int[] iArr2 = {1,2,3,4,5};
		for (int i = 0; i < iArr2.length; i++) {
			System.out.print(iArr2[i]);
		}
	}
}
