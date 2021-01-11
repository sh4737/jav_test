package com.test;

public class Findid {
	public static void main(String[] args) {
		String[] user = {"choongang" ,"컴퓨터", "ch1234@naver.com"}; //db
		//String Id = "choongang"; 
		String name = "컴퓨터";
		String email = "ch1234@naver.com";
		Findid Findid = new Findid(); 
		String outputId = Findid.maskingId(user[0], 3, 3);
		
		if(user[1].equals(name) && user[2].equals(email)) {
			System.out.println("아이디 찾기에 성공하였습니다.");
//			System.out.println(user[1] + "님의 아이디는 " + user[0].replaceAll(LASTNAME_PATTERN, "*") + " 입니다.");
			System.out.println(user[1] + "님의 아이디는 " + outputId + " 입니다.");
		} else {
			System.out.println("아이디 찾기에 실패하였습니다.");
			System.out.println("다시 시도해주세요.");
			
			
			
			/*if (user[1].equals(name) && !user[2].equals(email)) {
			System.out.println("아이디 찾기에 실패하였습니다.");
			System.out.println("이메일을 확인해주세요.");
		} else if(!user[1].equals(name)){
			System.out.println("해당 사용자를 찾을 수 없습니다.");
			System.out.println("이름을 다시 확인해주세요."); 
		} else { */
														//정보를 너무 많이 준다. 로그인 실패만 출력
			//pass
		}
	}
	
	public String maskingId(String id, int start, int end) {
	// 마스킹 함수
		int maskLength;
		
		if(start < 0) 
			start = 0; // 삼항연산자 사용
		
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
	
	//	정규식을 이용한 마스킹
//	private static final String LASTNAME_PATTERN = "(?<=.{3})."; 
	//  https://stufeel.tistory.com/30 참고 링크
	
}
	
	//정상적으로 입력 되었으면 계정 보여주기 아니면 실패 메세지 보여주기
	
	//아이디 몇글자 아스텔(*)로 표기해보기
	
	
