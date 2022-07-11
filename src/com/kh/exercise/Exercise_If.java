package com.kh.exercise;

import java.util.Scanner;

public class Exercise_If {
	/*public void exercise1() {
		// 키보드로 정수를 입력받고 입력받은 정수가 양수이고
		// 짝수일 때 "짝수다"를 출력하고 짝수가 아니면 "홀수다"를 출력하세요
		// 단, 양수가 아니면 "양수만 입력해주세요"를 출력하세요.

		// 정수하나 입력해주세요 : 4
		// 짝수다.

		// 정수하나 입력해주세요 : -2
		// 양수를 입력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력해주세요 : ");
		int input = sc.nextInt();
				
		if(input > 0) {
			if(input % 2 == 0) { // 중첩if문
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		if(input > 0 && input % 2 == 0) {
			System.out.println("짝수다.");
		} else if(input > 0) {
			System.out.println("홀수다.");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}*/
	
	public void exercise2() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수(20회)를 입력하고
		 * Pass 또는 Fail을 출력하세요.
		 * 평가비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 100%로 이루어져있고
		 * 이 때, 출석 비율은 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산
		 * 70점 이상일 경우 Pass(단, 출석횟수 충족), 70점 미만이거나
		 * 전체 강의의 30%이상 결석 시 Fail을 출력하세요.
		 * 
		 * 중간 고사 점수(20) : 70
		 * 기말 고사 점수(30) : 80
		 * 과제 점수       (30) : 77
		 * 출석 점수      (100) : 18
		 * 
		 * 총점 : 78
		 * Pass입니다!
		 */

		Scanner sc = new Scanner(System.in); 
		System.out.print("중간 고사 점수(20) : ");
		double mid = sc.nextDouble();
		System.out.print("기말 고사 점수(30) : ");
		double fin = sc.nextDouble();
		System.out.print("과제      점수(30) : ");
		double report = sc.nextDouble();
		System.out.print("출석     점수(100) : ");
		int check = sc.nextInt();
		
//		double midScore = mid * 0.2;
//		double finScore = fin * 0.3;
//		double reportScore = report * 0.3;
//		double total = midScore + finScore + reportScore;
		double score = (mid / 5.0) + (fin * 3.0 / 10.0) + (report * 3.0 / 10.0) + (check);
		System.out.println("총점 : " + score);
		if(score >= 70 && check >= 15) {
			System.out.println("PASS입니다.");
		} else {
			if(score >= 70) {
				System.out.println("FAIL [출석 횟수 부족] (" + check + ")" );
			}
			else if(check >= 15) {
				System.out.println("FAIL [점수 미달] (" + score + ")");
			}
			else {
				System.out.println("FAIL [출석 횟수 부족 & 점수 미달] (" + check + " & " + score + ")");
			}
			// FAIL [출석 횟수 부족] (14)
			// FAIL [점수 미달] (63)
			// FAIL [출석 횟수 부족 & 점수 미달] (13 & 54)
			//System.out.println("FAIL입니다.");
		}
	}
}


