package com.test;

public class Findid {
	public static void main(String[] args) {
		String[] user = {"choongang" ,"��ǻ��", "ch1234@naver.com"}; //db
		//String Id = "choongang"; 
		String name = "��ǻ��";
		String email = "ch1234@naver.com";
		Findid Findid = new Findid(); 
		String outputId = Findid.maskingId(user[0], 3, 3);
		
		if(user[1].equals(name) && user[2].equals(email)) {
			System.out.println("���̵� ã�⿡ �����Ͽ����ϴ�.");
//			System.out.println(user[1] + "���� ���̵�� " + user[0].replaceAll(LASTNAME_PATTERN, "*") + " �Դϴ�.");
			System.out.println(user[1] + "���� ���̵�� " + outputId + " �Դϴ�.");
		} else {
			System.out.println("���̵� ã�⿡ �����Ͽ����ϴ�.");
			System.out.println("�ٽ� �õ����ּ���.");
			
			
			
			/*if (user[1].equals(name) && !user[2].equals(email)) {
			System.out.println("���̵� ã�⿡ �����Ͽ����ϴ�.");
			System.out.println("�̸����� Ȯ�����ּ���.");
		} else if(!user[1].equals(name)){
			System.out.println("�ش� ����ڸ� ã�� �� �����ϴ�.");
			System.out.println("�̸��� �ٽ� Ȯ�����ּ���."); 
		} else { */
														//������ �ʹ� ���� �ش�. �α��� ���и� ���
			//pass
		}
	}
	
	public String maskingId(String id, int start, int end) {
	// ����ŷ �Լ�
		int maskLength;
		
		if(start < 0) 
			start = 0; // ���׿����� ���
		
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
	
	//	���Խ��� �̿��� ����ŷ
//	private static final String LASTNAME_PATTERN = "(?<=.{3})."; 
	//  https://stufeel.tistory.com/30 ���� ��ũ
	
}
	
	//���������� �Է� �Ǿ����� ���� �����ֱ� �ƴϸ� ���� �޼��� �����ֱ�
	
	//���̵� ����� �ƽ���(*)�� ǥ���غ���
	
	
