package com.test;

public class guguAnwser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int [2];
		guguAnwser guguAnswer = new guguAnwser();
		
		// input for문(2 random numbers)
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*8) + 2;
			for(int j = 0; j < i; j++) {		// 중복제거
				if(num[j] == num[i]) {
					i--;
				} else {
					//pass
				}
			}
		}
		
		guguAnswer.multi(num);		//함수 사용
	}
	
	// output 함수
	public void multi(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("---- " + arr[i] + "단 ----");
			for(int k = 1; k <= 9; k++)
			System.out.println(arr[i] + " x " + k + " = " + (arr[i] * k));
			System.out.println();
		}	
	}
}
