package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//월
		int month;

		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//"출력"
		System.out.println("월을 입력하세요.");
		
		//"입력"
		month = sc.nextInt();
		
		//조건: 스위치
		switch (month) {
		case 1:
			System.out.println("31일 입니다."); //중첩 가능:1, 3, 5, 7, 8, 10, 12
			break;
			
		case 2:
			System.out.println("28일 입니다."); 
			break;
			
		case 3:
			System.out.println("31일 입니다.");
			break;
			
		case 4:
			System.out.println("30일 입니다."); //중첩가능:4, 6, 9, 11
			break;
			
		case 5:
			System.out.println("31일 입니다.");
			break;
			
		case 6:
			System.out.println("30일 입니다.");
			break;
			
		case 7:
			System.out.println("31일 입니다.");
			break;
			
		case 8:
			System.out.println("31일 입니다.");
			break;
			
		case 9:
			System.out.println("30일 입니다.");
			break;
			
		case 10:
			System.out.println("31일 입니다.");
			break;
			
		case 11:
			System.out.println("30일 입니다.");
			break;
			
		case 12:
			System.out.println("31일 입니다.");
			break;
			
		default:
			System.out.println("오류입니다.");
			break;
		} //스위치 마지막
		
		
		
		
		//스캐너 닫기
		sc.close();
	}

}
