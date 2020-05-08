package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//코드
		int code;
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//"출력"
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		
		//"입력"
		code = sc.nextInt();
		
		//스위치 조건 및 시작
		switch (code) {
		case 1:
			System.out.println("R101호");
			break;
			
		case 2:
			System.out.println("R202호");
			break;
			
		case 3:
			System.out.println("R303호");
			break;
			
		case 4:
			System.out.println("R404호");
			break;
			
		default:
			System.out.println("상담원에게 문의하세요.");
			break;
		} //스위치 마무리
		
		//스캐너 닫기
		sc.close();
	}

}
