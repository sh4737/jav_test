package com.test;

public class Title {
	public static void main(String[] args) {
		String[] title;						
		title = new String[] { 	
			" 띵글 스톡 체험판 이렇게 사용하세요~ [1]		" , 	
			" [공지] 일요일 오후 9시 방송 시작합니다.		" ,
			" [필독]​2020년 12월 신규 탐험대를 모집합니다. [3]	" ,
			" [공지] 프로그 지분 15구좌 양도합니다. [6]	" ,
			" [공지] 프로그 차트 특허 등록이 결정되었습니다. [29]" ,
			" [필독] 신입 회원 필독사항입니다. [123]		" ,
			" [공지] 주식 양도 절차 [3]			" ,
			" [공지] 이 카페를 찾아 오신 분들께 [75]		" ,
			" [이벤트] 띵글 구매하면 선물이 팡팡!! [38]	" };
		
		String[] writer;
		writer = new String[] { "라온 정달" , "프로그  ", "라온 정달", "프로그  ", "프로그  ", "라온 정달",
				"프로그  ", "프로그  ", "라온 정달"};
		
		String[] date;
		date = new String[] { "2020.09.02.", "2020.12.27.", "2020.12.03.", "2020.10.27.",
				"2020.09.30.", "2020.03.03.", "2020.07.26.", "2020.03.25.", "2019.10.31."};
		
		String[] count;
		count = new String[] { "254", "33", "54", "247", "262", "1,731", "197", "589", "804"};
		
		
		System.out.println("|  -----------------제목-----------------  |  --작성자--  |  ---작성일---  |  -조회-  |");
		
		for(int i = 0; i <= 8; i++) {
			System.out.println(title[i] + "  |  " + writer[i] + "  |  " + date[i] 
					+ "  |  " + count[i] + "  |  ");
		}
	}
}
	


		//Multi Array 사용해야함.
		//for 두개 사용해야하고, 구구단 만들기 참고하기
	


	
	// http://cafe.naver.com/progue
	
	//전체글에서 상단 공지에 있는 내용 그대로 보여 주기 (9개)
 
