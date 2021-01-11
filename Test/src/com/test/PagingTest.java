package com.test;

public class PagingTest {
	public static void main(String[] args) {
		 /* input */
	    int currentPage = 2;       // 현재 페이지
	    int totalPage = 150;      // 총페이지 개수
	    int pageBlock = 10;        // 한블록당 몇 개 페이지를 보여줄지
	        
	    /* logic */
	    int currentBlock = currentPage / pageBlock;        //현재블록번호
	    int lastBlock = totalPage / pageBlock;             //마지막블록번호
	    int startNum = currentBlock * pageBlock + 1;         //시작페이지
	    int endNum = currentBlock * pageBlock + pageBlock + 1; // 마지막페이지
	        
	    StringBuffer pageNavi = new StringBuffer();
	    if ( currentPage != 1 )      pageNavi.append("[<<] ");
	    if ( currentBlock != 0 )     pageNavi.append("[<] | ");
	    for ( int i=startNum; i<endNum; i++ ) {
	        if ( i > totalPage )     break;
	        if ( i == currentPage )  pageNavi.append("[" + i + "]");
	        else                     pageNavi.append(i);
	        if ( i != endNum-1 )     pageNavi.append(" | ");
	    }
	    if ( currentBlock != lastBlock )pageNavi.append(" | [>]");
	    if ( currentPage != totalPage ) pageNavi.append("[>>]");
	        
	    System.out.println(pageNavi.toString());
		
	}

}

//		https://m.blog.naver.com/hc5642/50189359681
//		참고 링크
	