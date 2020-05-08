package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		//대입연사자 = 
		int a = 7;
		int b = 2;
		//-->실수형 해볼것, 정수+실수 해볼것
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		//부호연산자
		System.out.println("부호연산자");
		int var = 3;
		int pvar = +var;
		int mvar = -var;
		
		System.out.println(pvar);
		System.out.println(mvar);
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);   // 7
		System.out.println(++a); // 7-->8
		System.out.println(b);   // 2
		System.out.println(--b); // 2-->1
		System.out.println(a);   // 8
		System.out.println(a++); // 출력(8) 8-->9
		System.out.println(a);   // 9
		System.out.println(b);   // 1
		System.out.println(b--); // 출력(1) 1-->0
		System.out.println(b);   // 0
		

	}

}
	