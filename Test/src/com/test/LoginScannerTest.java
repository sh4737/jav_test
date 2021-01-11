package com.test;

import java.util.Scanner;

public class LoginScannerTest {
	public static void main(String[] args) {
		String[] user = {"choongang", "12345"};
		
		Scanner sc = new Scanner(System.in);
		String inputId;
		String inputPw;
		
		// false일 경우 다시 id입력 요구
		while(true) {
			System.out.println("-----------------------");
			System.out.print("ID: "); 
			inputId = sc.nextLine();
			System.out.print("PASSWORD: ");
			inputPw = sc.nextLine();
			if(user[0].equals(inputId) && user[1].equals(inputPw)) {
				System.out.println("로그인에 성공하였습니다.");
				sc.close();
				break;
				
			} else {
				System.out.println("로그인에 실패하였습니다.");
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
//		if(user[0].equals(inputId) && user[1].equals(inputPw)) {
//			System.out.println("로그인에 성공하였습니다.");
//			
//		} else {
//			System.out.println("로그인에 실패하였습니다.");
//		}
		
		
		
		// continue를 사용하면 실패시 다시 처음으로 돌아갈 수 있지 않을까
		
		
		
		
		
		
		
	}

}
