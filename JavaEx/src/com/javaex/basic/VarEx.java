package com.javaex.basic;

//변수 선언 연습
public class VarEx {
	public static void main(String[] args) {
        // 변수 식별자
		// 문자, 숫자, $, _ 의 조합
	
		// 변수명 관례
		// - 변수명은 소문자로 작성
		// - 단어의 조합일 경우 두번째 단어는 대문자로 시작
		
		int myAge;
		
		myAge = 25;
		
		int myAge2 = 25;
		
		System.out.println("myAge의 내용:" + myAge);
		myAge = myAge + 1;
		System.out.println("변경된 myAge의 내용:" + myAge);
	}
}
