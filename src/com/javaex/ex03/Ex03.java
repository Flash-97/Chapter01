package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//숫자 "입력"
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		//숫자 "출력"
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("양수입니다");
		} else if (num<0){
			System.out.println("음수입니다");
		} else if (num==0) {
			System.out.println("0 입니다");
		}
			
		
		
		
		
		
		
		//스캐너닫기
		sc.close();
	}

}

