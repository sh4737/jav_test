package com.test;

public class FindIdMethod {
	public static void main(String[] args) {
		String[] user = {"choongang","��ǻ��", "ch1234@naver.com"}; //db
		String name = "��ǻ��";
		String email = "ch1234@naver.com";
		FindIdMethod FindIdMethod = new FindIdMethod();
		int result = 0;
		String outputId = null;
		
		//Ȯ��, ��� �Լ� ȣ��
		result = FindIdMethod.inputId(user, name, email);
		outputId = FindIdMethod.maskingId(user[0], 2, 2);
		FindIdMethod.syso(result);
		
		//���̵� ���							//�̰͵� �Լ��� ���� �� ������?
		if(result == 0) {
			System.out.println(user[1] + "���� ���̵�� " + outputId + " �Դϴ�.");
		} else {
			//pass
		}
		
	}
	
	
	//�̸� �̸��� Ȯ�� �Լ�
	public int inputId(String arr[], String name, String email) {
		if(arr[1].equals(name) && arr[2].equals(email)) {
			return  0;
		} else {
			return  1;
		}
			
	}
	
	// ����ŷ �Լ�
	public String maskingId(String id, int start, int end) {
			int maskLength;
			
			if(start < 0) 
				start = 0;
			
			if(end > id.length() )
				end = id.length();
			
			
			maskLength = id.length() - (end + start);	//�ƽ��׸� ó���� �� ����
			
			if(maskLength <= 0)			//������ �Ǵ°� ����
				return id;
			
			StringBuilder sb = new StringBuilder(maskLength);
			
			for(int i = 0; i < maskLength; i++) {
				sb.append('*');
			}
			
			return id.substring(0, start)
					+ sb.toString()
					+ id.substring(start + maskLength);
		}
	
	//��� �Լ�
	public void syso(int n) {
		if(n == 0) {
			System.out.println("���̵� ã�⿡ �����Ͽ����ϴ�.");
//			System.out.println("����� ���̵�� " + outputId + " �Դϴ�.");
		} else if(n == 1) {
			System.out.println("���̵� ã�⿡ �����Ͽ����ϴ�.");
		} else {
			//pass
		}
	}
	


}
