package com.test;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int [2];
		gugudan gugudan = new gugudan();
		
		// 2~9 ���� �̱� for��
//		for(int i = 0; i < num.length; i++) {
//			num[i] = (int)(Math.random()*8) + 2;
//			for(int j = 0; j < i; j++) {		// �ߺ�����
//				if(num[j] == num[i]) {
//					i--;
//				} else {
//					//pass
//				}
//			}
//		}
		
		gugudan.ranPic(2);
		
		// 99�� ��� for��
//		for(int i = 0; i < num.length; i++) {
//			System.out.println("---- " + num[i] + "�� ----");
//			for(int k = 1; k <= 9; k++)
//			System.out.println(num[i] + " x " + k + " = " + (num[i] * k));
//			System.out.println();
//		}
		

	}
	
	// ���� �̱� �Լ�(���� ������ŭ �������� �迭 ����)
	public void ranPic(int a) {
		int[] arr = new int[a];
		
		// ���� �̱�
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*8) + 2;
			for(int j = 0; j < i; j++) {		// �ߺ�����
				if(arr[j] == arr[i]) {
					i--;
				} else {
					//pass
				}
			}
		}
		
		// ���
		for(int i = 0; i < arr.length; i++) {
			System.out.println("---- " + arr[i] + "�� ----");
			for(int k = 1; k <= 9; k++)
			System.out.println(arr[i] + " x " + k + " = " + (arr[i] * k));
			System.out.println();
		
		}
	}
	
	// ��� �Լ�
//	public void multi(int arr2[]) {
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println("---- " + arr2[i] + "�� ----");
//			for(int k = 1; k <= 9; k++)
//			System.out.println(arr2[i] + " x " + k + " = " + (arr2[i] * k));
//			System.out.println();
//		}
//		
//	}

}
