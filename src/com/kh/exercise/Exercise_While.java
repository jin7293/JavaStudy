package com.kh.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int odd = 0;
		int sum = 0;
		while(odd <= 100) {
			if(odd % 2 != 0) {
				sum += odd;
				odd++;
			} else {
				odd++;
			}
		}
		System.out.println("홀수의 합은 : " + sum);
	}
	
	public void exercise2() {
		// while문을 이용하여 정수를 하나 입력받아 그 수가 1 ~ 9사이의 수 일때만
		// 그 수의 구구단을 출력하시오.
		// 단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력하여야 합니다"를 출력하시오.
		// 1단계 while문으로 구구단 만들기
		// 2단계 입력한 값으로 구구단 출력하기
		// 3단계 입력한 수가 1 ~ 9 사이의 수 일때만 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9 사이의 정수를 입력해주세요.");	
		int dan = sc.nextInt();	
		int i = 0;
		if(dan <= 9 && dan >= 1) {
			while(i < 10) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
				i++;
			}
		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다.");
		}
//		while(dan >= 1 && dan <= 9) {
//			int i = 1;
//			if(i < 10) {
//				System.out.println(dan + " * " + i + " = " + (dan*i));
//				i++;
//			}   실패작품
//		}

	}
	
	public void exercise3() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 : 14
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(num != -1) {
			System.out.print("정수 하나 입력 : " );
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("입력하신 수의 합은 : " + sum);
	}
	
	public void exercise4() {
		/*
		 *  while문을 이용하여 -1이 될때까지 정수 여러개를 입력받고 평균을 출력하시오.
		 *  정수를 입력하고 마지막에 -1을 입력하세요
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  정수의 개수는 5개이며 평균은 0.6입니다.
		 *  
		 *  정수를 입력하고 마지막에 -1을 입력하세요
		 *  -1
		 *  입력된 수가 없습니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int num = sc.nextInt();		
		int sum = 0;           // 입력된 수의 누적합
		double div = 0.0;      // 입력된 수의 평균
		int count = 0;         // 입력된 수의 갯수
		while(num != -1) {
			sum += num;
			count++;
			div = (double)sum/count;
			System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
			num = sc.nextInt();			
		}
		if(count == 0) {
			// 입력된 수가 없는 경우
			System.out.println("입력된 수가 없습니다.");
		} else {
			// 입력된 수가 있는 경우
			System.out.println("정수의 개수는 " + count + "개이며 평균은 " + div +"입니다.");
		}
	}
}
