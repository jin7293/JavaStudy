package com.kh.control;

import java.util.Scanner;

public class Exam_While {
	public static void main(String [] args) {
		int i = 0; // �ʱ��
		Scanner sc = new Scanner(System.in);
		while(i < 10) { // ���ǽ�
			System.out.println("��µ� i�� �� : " + i);
//			System.out.println("���� �ϳ� �Է� : " + i);
//			i = sc.nextInt(); // ���ѹݺ�
			i++; // ������
		}
		System.out.println();
		int j = 9;
		while(j >= 0) {
			System.out.println("��µ� i�� �� : " + j);
			j--;
		}
	}

}
