package com.javaex.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arithOper();
	}

	public static void arithOper() {
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 => " + (7 / 3));
		// int / int -> int(몫)
		System.out.println("7 / 3의 몫 => " + (7 % 3));
		// 나머지 연산자 : %
		// 정확한 실수값을 얻으려면 int -> float 변환
		System.out.println("7 / 3 실수 => " + ((float)a / (float)b));
		// 만약 -> 정수를 0으로 나누면
		//System.out.println("정수 나누기 0 => " + (a / 0));
		
				
	}
}
