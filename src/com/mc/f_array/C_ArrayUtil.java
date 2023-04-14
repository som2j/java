package com.mc.f_array;

import java.util.Arrays;

public class C_ArrayUtil {

	public static void main(String[] args) {

		int[] iArr = { 1, 20, 4, 2, 7, 9};

		/*
		 * int[] data1 = {1,2,3,4,5}; int[] data2 = {6,7,8,9,0}; int[]
		 * combine=merge(data1,data2); System.out.println(Arrays.toString(combine));
		 */

		/*
		 * iArr=add(iArr, 10000);
		 * 
		 * System.out.println(Arrays.toString(iArr));
		 */

		/*
		 * asc(iArr); System.out.println(Arrays.toString(iArr)); dsc(iArr);
		 * System.out.println(Arrays.toString(iArr));
		 */
		
		int num1=2;
		int num2=4;
		
		//remove(iArr,num1);
		
		subArr(iArr,num1,num2);
		System.out.println(Arrays.toString(iArr));
	
		
	}
	//기능 : 원하는 인덱스의 데이터를 삭제하는 메서드
	   //첫번째 매개변수 : 배열
	   //두번째 매개변수 : 인덱스
	   //메서드 명 : remove
	   //ex) int[] data = {1,2,3,4,5};
	   //    remove(data,2) -> [1,2,4,5]
	public static int[] remove(int[] data1, int num) {
		int[] data2=new int[data1.length-1];
		/*  코드
		int[] data2=new int[data1.length-1];
		int tidx=0;
		for (int i = 0; i < arr.length; i++) {
		 if(i==num) continue;
		 data2[tidx]=data1[i];
		 tidx++;
 	 		}
		 */
		
		for (int i = 0; i < num; i++) {
			data2[i] = data1[i];	
		}
		if(num!=data1.length) {
		for (int i = num+1; i < data2.length; i++) {
			data2[i]=data1[i+1];
		}
		
		}
		return data2;
		
	}
	
	
	//기능 : 원하는 인덱스 구간의 데이터를 잘라내는 메서드
	   //인덱스 구간 : 시작 인덱스 ~ 끝 인덱스의 앞 인덱스까지의 데이터
	   //첫번째 매개변수 : 배열
	   //두번째 매개변수 : 시작 인덱스
	   //세번째 매개변수 : 끝 인덱스
	   //메서드 명 : subArr
	   //ex) int[] data = {1,2,3,4,5}
	   //   subArr(data,0,2); -> [1,2]
	public static int[] subArr(int[] data1, int num1, int num2)
	{
		int[] temp=new int[num2-num1];
		for (int i = 0; i < temp.length; i++) {
			temp[i]=data1[num1+i];
		}
		return temp;
		
		
		/*
		int[] data2=new int[num2-num1];
		for (int i = num1; i < num2; i++) {
			data2[i-num1]=data1[i];
		}
		
		
		return data2;
		*/
	}
	
	
	public static int[] merge(int[] data1, int[] data2) {

		// 기능 : 매개변수로 넘어온 두 int배열을 하나의 배열로 합쳐주는 메서드
		// 메서드 이름 : merge
		// 메서드를 작성하고 테스트까지 완료 해주세요.
		// ex) int[] data1 = {1,2,3,4,5}
		// int[] data2 = {6,7,8,9,0}
		// merge(data,data2) -> [1,2,3,4,5,6,7,8,9,0]

		int[] combine = new int[data1.length + data2.length];

		for (int i = 0; i < data1.length; i++) {
			combine[i] = data1[i];

		}
		for (int i = 0; i < data2.length; i++) {
			combine[data1.length + i] = data2[i];
		}
		return combine;

	}

	public static int[] add(int[] iArr, int num) {

		// 배열은 한번 크기를 정하면 변경이 불가능하다.
		// 더 크게 변경하려면 크기 더 큰 배열 만들어서 복사
		int[] bigArr = new int[iArr.length + 1];

		for (int i = 0; i < iArr.length; i++) {
			bigArr[i] = iArr[i];
		}
		bigArr[bigArr.length - 1] = num;
		return bigArr;

	}

	public static void asc(int[] iArr) {

		// iArr에 담겨있는 값들을 오름차순으로 정렬해주세요.
		// 오름차순은 작은 수가 앞에, 큰 수가 뒤에 오도록 정렬
		int tmp;
		for (int i = 0; i < iArr.length; i++) {
			boolean flg = true;

			for (int j = 0; j < iArr.length - 1 - i; j++) {
				if (iArr[j] > iArr[j + 1]) {
					tmp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = tmp;
					flg = false;
				}
			}
			if (flg)
				break;
		}

	}

	public static void dsc(int[] iArr) {
		int tmp;
		for (int i = 0; i < iArr.length; i++) {
			boolean flg = true;

			for (int j = 0; j < iArr.length - 1 - i; j++) {
				if (iArr[j] < iArr[j + 1]) {
					tmp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = tmp;
					flg = false;
				}
			}
			if (flg)
				break;
		}

	}

	public static void q1() {
		// 아래 배열의 0번 인덱스와 1번 인덱스의 자리를 바꿔주세요.
		int[] iArr = { 1, 3, 5, 7, 9 };

		System.out.println(Arrays.toString(iArr));
		int tmp;

		tmp = iArr[0];
		iArr[0] = iArr[1];

		iArr[1] = tmp;

	}

}
