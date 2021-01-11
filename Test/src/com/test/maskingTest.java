package com.test;

public class maskingTest {
	public static void main(String[] args){
		
		String id = "sh4737";
		maskingTest maskingTest = new maskingTest(); 
		
//		maskingTest.maskingid(id);
		
		maskingTest.maskingId(id, 2, 5);
		System.out.println(maskingTest.maskingId(id,2,5));
	 
	}
	
	public String maskingId(String id, int start, int end) {
		int maskLength;
		
		if(start < 0) 
			start = 0;
		
		if(end > id.length() )
			end = id.length();
		
		maskLength = end - start;
		
		if(maskLength == 0)
			return id;
		
		StringBuilder sb = new StringBuilder(maskLength);
		
		for(int i = 0; i < maskLength; i++) {
			sb.append('*');
		}
		
		return id.substring(0, start)
				+ sb.toString()
				+ id.substring(start + maskLength);
	}
}

//		https://www.javacodeexamples.com/mask-part-of-string-example-java/878 
//		https://medium.com/@chintanaw/java-string-masking-performance-why-you-should-stop-worrying-and-rewrite-everything-in-c-849a79c04d0f
//		참고 링크
