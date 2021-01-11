package com.test;

public class FindIdMethod {
	public static void main(String[] args) {
		String[] user = {"choongang","컴퓨터", "ch1234@naver.com"}; //db
		String name = "컴퓨터";
		String email = "ch1234@naver.com";
		FindIdMethod FindIdMethod = new FindIdMethod();
		int result = 0;
		String outputId = null;
		
		//확인, 출력 함수 호출
		result = FindIdMethod.inputId(user, name, email);
		outputId = FindIdMethod.maskingId(user[0], 2, 2);
		FindIdMethod.syso(result);
		
		//아이디 출력							//이것도 함수로 만들 수 없을까?
		if(result == 0) {
			System.out.println(user[1] + "님의 아이디는 " + outputId + " 입니다.");
		} else {
			//pass
		}
		
	}
	
	
	//이름 이메일 확인 함수
	public int inputId(String arr[], String name, String email) {
		if(arr[1].equals(name) && arr[2].equals(email)) {
			return  0;
		} else {
			return  1;
		}
			
	}
	
	// 마스킹 함수
	public String maskingId(String id, int start, int end) {
			int maskLength;
			
			if(start < 0) 
				start = 0;
			
			if(end > id.length() )
				end = id.length();
			
			
			maskLength = id.length() - (end + start);	//아스테릭 처리가 될 길이
			
			if(maskLength <= 0)			//음수가 되는걸 방지
				return id;
			
			StringBuilder sb = new StringBuilder(maskLength);
			
			for(int i = 0; i < maskLength; i++) {
				sb.append('*');
			}
			
			return id.substring(0, start)
					+ sb.toString()
					+ id.substring(start + maskLength);
		}
	
	//출력 함수
	public void syso(int n) {
		if(n == 0) {
			System.out.println("아이디 찾기에 성공하였습니다.");
//			System.out.println("당신의 아이디는 " + outputId + " 입니다.");
		} else if(n == 1) {
			System.out.println("아이디 찾기에 실패하였습니다.");
		} else {
			//pass
		}
	}
	


}
