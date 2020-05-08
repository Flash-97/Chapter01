package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//출력문 출력
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		
		//키보드에서 이름을 입력받는다.
		//String name
		String name = sc.nextLine();
		String old = sc.nextLine();
		
		//name+문자열 출력한다.
		System.out.println("당신의 이름은" +name+ "입니다.");
		System.out.println("당신이 나이는"+ old +"입니다.");
		
		
		sc.close();
	}

}
