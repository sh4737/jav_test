package com.test;

import java.util.Scanner;

public class LoginScannerTest {
	public static void main(String[] args) {
		String[] user = {"choongang", "12345"};
		
		Scanner sc = new Scanner(System.in);
		String inputId;
		String inputPw;
		
		// false�� ��� �ٽ� id�Է� �䱸
		while(true) {
			System.out.println("-----------------------");
			System.out.print("ID: "); 
			inputId = sc.nextLine();
			System.out.print("PASSWORD: ");
			inputPw = sc.nextLine();
			if(user[0].equals(inputId) && user[1].equals(inputPw)) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
				sc.close();
				break;
				
			} else {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
		}
//		if(user[0].equals(inputId) && user[1].equals(inputPw)) {
//			System.out.println("�α��ο� �����Ͽ����ϴ�.");
//			
//		} else {
//			System.out.println("�α��ο� �����Ͽ����ϴ�.");
//		}
		
		
		
		// continue�� ����ϸ� ���н� �ٽ� ó������ ���ư� �� ���� ������
		
		
		
		
		
		
		
	}

}
