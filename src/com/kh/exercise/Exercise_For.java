package com.kh.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// 1에서 100 사이의 자연수 중 홀수만 더하여 출력하시오.
		// 누적합 구하기
		int total = 0;
		for(int odd = 1; odd < 100; odd += 2) {			
			total += odd;			
		}
		System.out.println("홀수의 합은 : " + total);
	}
	
	public void exercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9사이의 수일 때만
		// 그 수의 구구단을 출력하시오.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야합니다"를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9 사이의 정수를 입력해주세요.");
		int gugu = sc.nextInt();
		if(gugu <= 9 && gugu >= 1) {
			for(int i = 1; i < 10; i++) {
				System.out.println(gugu + " * " + i + " = " + (gugu*i));
			}
		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다.");
		}
		
	}
	
	public void exercise3() {
		/*
		 * 1부터 10까지의 덧셈을 표시하고 합도 구하시오
		 * 1+2+3+4+5+6+7+8+9+10=55
		 */
		int total = 0;
		for(int i = 1; i < 11; i++) {
			total += i;
			System.out.print(i);
			// i가 9일때까지 +로 출력하고
			if(i <= 9) { // i가 9일때까지 +로 출력하고
				System.out.print(" + ");				
			} else { // i가 10이면 = 으로 출력
				System.out.print(" = ");
			}
		}
		System.out.println(total);
	}
}
