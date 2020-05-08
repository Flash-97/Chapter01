package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//변수
		int dan=0; // 단
		int i = 1; // 1~9까지 곱할 변수
//		int result=0; //결과
	
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//출력
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		
		//입력
		dan = sc.nextInt();
		
		//조건: 1~9까지 곱한다
		while (i<10) {
			System.out.println(dan +" * " + i + " = " + (dan*i));
//			result = dan * i;
//			System.out.println(dan + " * " + i + " = " + result);
			
		//반복문 종료
			i++;
		
		}
		
		//스캐너 닫기
		sc.close();
	}

}
