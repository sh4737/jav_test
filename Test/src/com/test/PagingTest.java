package com.test;

public class PagingTest {
	public static void main(String[] args) {
		 /* input */
	    int currentPage = 2;       // ���� ������
	    int totalPage = 150;      // �������� ����
	    int pageBlock = 10;        // �Ѻ�ϴ� �� �� �������� ��������
	        
	    /* logic */
	    int currentBlock = currentPage / pageBlock;        //�����Ϲ�ȣ
	    int lastBlock = totalPage / pageBlock;             //��������Ϲ�ȣ
	    int startNum = currentBlock * pageBlock + 1;         //����������
	    int endNum = currentBlock * pageBlock + pageBlock + 1; // ������������
	        
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
//		���� ��ũ
	