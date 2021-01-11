package com.test;

public class lottonumber {

	public static void main(String[] args) {
		int lotto[] = new int [7];
		int num = 0;
		
		System.out.println("----로또 번호----");
		
		//random출력 while문
		while(num != 7) {
			lotto[num] = (int)(Math.random()*45) + 1;
			//중복처리 for문
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
		// for문으로 변환
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
		
		//1~6번 출력
		for(int j = 0; j < lotto.length-1; j++) {
			System.out.println( (j+1) + "번째 번호는 " + lotto[j] + " 입니다.");
		}
		
		//2등 보너스볼 출력
		System.out.println("2등 보너스 볼은 " + lotto[6] +" 입니다.");
		
		System.out.println("----------------------");
		for(int k = 0; k < lotto.length; k++) {
			System.out.println( "lotto[" + k + "] : " + lotto[k]);
		}
				
//		for (int i = 1; i <= 6; i++) {
//			int num = (int)(Math.random()*45) + 1;
//			
//			System.out.println( i +"번째 번호는 " + num + " 입니다.");
//			
//		}				//중복 숫자 처리 안됨
		
	}

}


//		https://lopicit.tistory.com/188 참고링크
//		자바 로또 프로그램(중복제거)