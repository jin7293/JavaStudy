package com.kh.exercise;

import java.util.Scanner;

public class Exercise_If {
	/*public void exercise1() {
		// Ű����� ������ �Է¹ް� �Է¹��� ������ ����̰�
		// ¦���� �� "¦����"�� ����ϰ� ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���
		// ��, ����� �ƴϸ� "����� �Է����ּ���"�� ����ϼ���.

		// �����ϳ� �Է����ּ��� : 4
		// ¦����.

		// �����ϳ� �Է����ּ��� : -2
		// ����� �Է����ּ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϳ� �Է����ּ��� : ");
		int input = sc.nextInt();
				
		if(input > 0) {
			if(input % 2 == 0) { // ��øif��
				System.out.println("¦����.");
			} else {
				System.out.println("Ȧ����.");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
		if(input > 0 && input % 2 == 0) {
			System.out.println("¦����.");
		} else if(input > 0) {
			System.out.println("Ȧ����.");
		} else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}*/
	
	public void exercise2() {
		/*
		 * �߰����, �⸻���, ��������, �⼮Ƚ��(20ȸ)�� �Է��ϰ�
		 * Pass �Ǵ� Fail�� ����ϼ���.
		 * �򰡺����� �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 100%�� �̷�����ְ�
		 * �� ��, �⼮ ������ �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ���
		 * 70�� �̻��� ��� Pass(��, �⼮Ƚ�� ����), 70�� �̸��̰ų�
		 * ��ü ������ 30%�̻� �Ἦ �� Fail�� ����ϼ���.
		 * 
		 * �߰� ��� ����(20) : 70
		 * �⸻ ��� ����(30) : 80
		 * ���� ����       (30) : 77
		 * �⼮ ����      (100) : 18
		 * 
		 * ���� : 78
		 * Pass�Դϴ�!
		 */

		Scanner sc = new Scanner(System.in); 
		System.out.print("�߰� ��� ����(20) : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ��� ����(30) : ");
		double fin = sc.nextDouble();
		System.out.print("����      ����(30) : ");
		double report = sc.nextDouble();
		System.out.print("�⼮     ����(100) : ");
		int check = sc.nextInt();
		
//		double midScore = mid * 0.2;
//		double finScore = fin * 0.3;
//		double reportScore = report * 0.3;
//		double total = midScore + finScore + reportScore;
		double score = (mid / 5.0) + (fin * 3.0 / 10.0) + (report * 3.0 / 10.0) + (check);
		System.out.println("���� : " + score);
		if(score >= 70 && check >= 15) {
			System.out.println("PASS�Դϴ�.");
		} else {
			if(score >= 70) {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + check + ")" );
			}
			else if(check >= 15) {
				System.out.println("FAIL [���� �̴�] (" + score + ")");
			}
			else {
				System.out.println("FAIL [�⼮ Ƚ�� ���� & ���� �̴�] (" + check + " & " + score + ")");
			}
			// FAIL [�⼮ Ƚ�� ����] (14)
			// FAIL [���� �̴�] (63)
			// FAIL [�⼮ Ƚ�� ���� & ���� �̴�] (13 & 54)
			//System.out.println("FAIL�Դϴ�.");
		}
	}
}


