package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int num;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		num = sc.nextInt();
		
		if (num>0) {
			if (num%2==0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else if (num<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		
		
		
		
		
		
		
		
		//스캐너닫기
		sc.close();
	}

}
