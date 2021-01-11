package com.test;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int [2];
		gugudan gugudan = new gugudan();
		
		// 2~9 랜덤 뽑기 for문
//		for(int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random()*8) + 2;
//			for(int j = 0; j < i; j++) {		// 중복제거
//				if(num[j] == num[i]) {
//					i--;
//				} else {
//					//pass
//				}
//			}
//		}
		
		gugudan.ranPic(2);
		
		// 99단 출력 for문
//		for(int i = 0; i < num.length; i++) {
//			System.out.println("---- " + num[i] + "단 ----");
//			for(int k = 1; k <= 9; k++)
//			System.out.println(num[i] + " x " + k + " = " + (num[i] * k));
//			System.out.println();
//		}
		

	}
	
	// 랜덤 뽑기 함수(넣은 정수만큼 랜덤으로 배열 생성)
	public void ranPic(int a) {
		int[] arr = new int[a];
		
		// 랜덤 뽑기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*8) + 2;
			for(int j = 0; j < i; j++) {		// 중복제거
				if(arr[j] == arr[i]) {
					i--;
				} else {
					//pass
				}
			}
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println("---- " + arr[i] + "단 ----");
			for(int k = 1; k <= 9; k++)
			System.out.println(arr[i] + " x " + k + " = " + (arr[i] * k));
			System.out.println();
		
		}
	}
	
	// 출력 함수
//	public void multi(int arr2[]) {
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println("---- " + arr2[i] + "단 ----");
//			for(int k = 1; k <= 9; k++)
//			System.out.println(arr2[i] + " x " + k + " = " + (arr2[i] * k));
//			System.out.println();
//		}
//		
//	}

}
