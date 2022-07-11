package com.kh.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// 1���� 100 ������ �ڿ��� �� Ȧ���� ���Ͽ� ����Ͻÿ�.
		// ������ ���ϱ�
		int total = 0;
		for(int odd = 1; odd < 100; odd += 2) {			
			total += odd;			
		}
		System.out.println("Ȧ���� ���� : " + total);
	}
	
	public void exercise2() {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9������ ���� ����
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ����մϴ�"�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9 ������ ������ �Է����ּ���.");
		int gugu = sc.nextInt();
		if(gugu <= 9 && gugu >= 1) {
			for(int i = 1; i < 10; i++) {
				System.out.println(gugu + " * " + i + " = " + (gugu*i));
			}
		} else {
			System.out.println("1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
		
	}
	
	public void exercise3() {
		/*
		 * 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		 * 1+2+3+4+5+6+7+8+9+10=55
		 */
		int total = 0;
		for(int i = 1; i < 11; i++) {
			total += i;
			System.out.print(i);
			// i�� 9�϶����� +�� ����ϰ�
			if(i <= 9) { // i�� 9�϶����� +�� ����ϰ�
				System.out.print(" + ");				
			} else { // i�� 10�̸� = ���� ���
				System.out.print(" = ");
			}
		}
		System.out.println(total);
	}
}
