package com.kh.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
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
		System.out.println("Ȧ���� ���� : " + sum);
	}
	
	public void exercise2() {
		// while���� �̿��Ͽ� ������ �ϳ� �Է¹޾� �� ���� 1 ~ 9������ �� �϶���
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����Ͻÿ�.
		// 1�ܰ� while������ ������ �����
		// 2�ܰ� �Է��� ������ ������ ����ϱ�
		// 3�ܰ� �Է��� ���� 1 ~ 9 ������ �� �϶��� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9 ������ ������ �Է����ּ���.");	
		int dan = sc.nextInt();	
		int i = 0;
		if(dan <= 9 && dan >= 1) {
			while(i < 10) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
				i++;
			}
		} else {
			System.out.println("1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
//		while(dan >= 1 && dan <= 9) {
//			int i = 1;
//			if(i < 10) {
//				System.out.println(dan + " * " + i + " = " + (dan*i));
//				i++;
//			}   ������ǰ
//		}

	}
	
	public void exercise3() {
		// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�
		// -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		// ���� �ϳ� �Է� : 3
		// ���� �ϳ� �Է� : 4
		// ���� �ϳ� �Է� : 7
		// ���� �ϳ� �Է� : -1
		// �Է��Ͻ� ���� ���� : 14
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(num != -1) {
			System.out.print("���� �ϳ� �Է� : " );
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
	}
	
	public void exercise4() {
		/*
		 *  while���� �̿��Ͽ� -1�� �ɶ����� ���� �������� �Է¹ް� ����� ����Ͻÿ�.
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  ������ ������ 5���̸� ����� 0.6�Դϴ�.
		 *  
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  -1
		 *  �Էµ� ���� �����ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int num = sc.nextInt();		
		int sum = 0;           // �Էµ� ���� ������
		double div = 0.0;      // �Էµ� ���� ���
		int count = 0;         // �Էµ� ���� ����
		while(num != -1) {
			sum += num;
			count++;
			div = (double)sum/count;
			System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
			num = sc.nextInt();			
		}
		if(count == 0) {
			// �Էµ� ���� ���� ���
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			// �Էµ� ���� �ִ� ���
			System.out.println("������ ������ " + count + "���̸� ����� " + div +"�Դϴ�.");
		}
	}
}
