package com.test;

public class lottonumber {

	public static void main(String[] args) {
		int lotto[] = new int [7];
		int num = 0;
		
		System.out.println("----�ζ� ��ȣ----");
		
		//random��� while��
		while(num != 7) {
			lotto[num] = (int)(Math.random()*45) + 1;
			//�ߺ�ó�� for��
			for(int i = 0; i < num; i++) {
				if(lotto[i] == lotto[num]) {
					num--;
					break;
				} else {
					//pass
				}
			}
			num++;
		}
		// for������ ��ȯ
//		for(int n = 0; n < 7; n++) {
//			lotto[n] = (int)(Math.random()*45) + 1;
//			for(int i = 0; i < n; i++) {
//				if(lotto[i] == lotto[n]) {
//					n--;
//				} else {
//					//pass
//				}
//			}
//		}
		
		//1~6�� ���
		for(int j = 0; j < lotto.length-1; j++) {
			System.out.println( (j+1) + "��° ��ȣ�� " + lotto[j] + " �Դϴ�.");
		}
		
		//2�� ���ʽ��� ���
		System.out.println("2�� ���ʽ� ���� " + lotto[6] +" �Դϴ�.");
		
		System.out.println("----------------------");
		for(int k = 0; k < lotto.length; k++) {
			System.out.println( "lotto[" + k + "] : " + lotto[k]);
		}
				
//		for (int i = 1; i <= 6; i++) {
//			int num = (int)(Math.random()*45) + 1;
//			
//			System.out.println( i +"��° ��ȣ�� " + num + " �Դϴ�.");
//			
//		}				//�ߺ� ���� ó�� �ȵ�
		
	}

}


//		https://lopicit.tistory.com/188 ����ũ
//		�ڹ� �ζ� ���α׷�(�ߺ�����)