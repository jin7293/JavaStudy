package com.kh.control;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		//boolean result = num == 0;
		if(num == 0) {
//			System.out.println("��� : true");
			System.out.println("0�Դϴ�.");
		} else if(num > 0){ // 0�� �ƴ� �� ���, ����
			//System.out.println("0�� �ƴմϴ�.");
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		String result = num == 0 ? "0�Դϴ�." : num > 0 ? "����Դϴ�." : "�����Դϴ�.";
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
		} else if(num == 0) {
			System.out.println("0�Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");			
		}
	}
}
