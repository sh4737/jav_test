package com.test;

public class LoginMethod {
	public static void main(String[] args) {
		
		LoginMethod LoginMethod = new LoginMethod(); 
		
		String[] user = {"hakwon", "12345"}; //db ����
		String id = "hakwon";
		String pw = "12345";
		
		//�Լ� ȣ��
		boolean resultInputid = LoginMethod.inputId(user, id, pw);
		LoginMethod.syso(resultInputid);
		
	
	}
	
	// ���̵� ��й�ȣ Ȯ�� �Լ�
	public boolean inputId(String arr[], String id, String pw) {
//		String arr[] = new String[2];
		
		boolean result;
		
		if(arr[0].equals(id) && arr[1].equals(pw)) {
			result = true;
		} else {
			result = false;
		}
		return result;	
	}
	
	//��� ��� �Լ�
	public void syso(boolean result) {
		if(result == true) {
			System.out.println("Success");
		} else {
			System.out.println("fail");
		}
	}
	
}
