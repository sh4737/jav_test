package com.test;

public class naver {
	public static void main(String[] args) {
		String name = "NAME";

		name = name.replaceAll("(?<=.{1})." , "*");

		System.out.println(name);

		//��ó: https://8boknote.tistory.com/98 [8BOKNOTE]
	}

}
