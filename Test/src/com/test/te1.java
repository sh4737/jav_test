package com.test;

public class te1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int [2];
		te1 te1 = new te1();
		
		te1.ranPic(2);
		System.out.println(te1.ranPic(2));

	}
	
	public int[] ranPic(int a) {
		int[] arr = new int[2];
		for(int i = 0; i < a; i++) {
			arr[i] = (int)(Math.random()*8) + 2;
			for(int j = 0; j < i; j++) {		// 중복제거
				if(arr[j] == arr[i]) {
					i--;
				} else {
					//pass
				}
			}
		}
		return arr;
	}

}
