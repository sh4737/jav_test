package com.test;

public class Login {
	public static void main(String[] args) {
		String[] user = {"choongang", "12345"}; //db 가정
		String id = "hakwon";
		String pw = "12345";
		
		if (user[0].equals(id)) {
			if(user[1].equals(pw)) {
				System.out.println("로그인에 성곻하였습니다.");
			} else {
				//System.out.println("비밀번호가 다릅니다.");
				//System.out.println("비밀번호를 확인해주세요."); //정보를 너무 많이 준다. 로그인 실패만 출력
				System.out.println("로그인에 실패하였습니다.");
				System.out.println("아이디 또는 비밀번호를 확인해주세요.");
			}
		} else { 
			//System.out.println("아이디를 찾을 수 없습니다.");
			//System.out.println("아이디를 확인해주세요."); //정보를 너무 많이 준다. 로그인 실패만 출력
			System.out.println("로그인에 실패하였습니다.");
			System.out.println("아이디 또는 비밀번호를 확인해주세요.");
			
		}
	}
	
		
		// javascript
		
		//jsp
		
		//java
		
		
		//로그인 화면에서 입력한 데이터가 이곳 까지 도착 했다고 가정
		
		//로그인이 정상적으로 되었으면 정상 메세지 출력 아니면 비정상 메세지 출력
		
	
	// ID랑 Password 같이 체크를 해야하고, 아이디가 맞다는 정보를 알려줄 수 있음.
	// 그냥 둘 중에 하나 틀렸다고 출력.
		
		
		
		
		

}
