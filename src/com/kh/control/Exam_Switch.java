package com.kh.control;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String [] args) {
//		1. �Է�
//		2. ����
//		3. ��ȸ
//		4. ����
//		0. ����
//		�޴� ��ȣ�� �Է��ϼ��� : 3
//		��ȸ�޴��Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("0. ����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int select = sc.nextInt();
		switch(select) { // select ���� 
		case 1 : System.out.println("�Է¸޴��Դϴ�."); break; // 1�̸� �Է¸޴�����ϰ� Ż��
		case 2 : System.out.println("�����޴��Դϴ�."); break;
		case 3 : System.out.println("��ȸ�޴��Դϴ�."); break;
		case 4 : System.out.println("�����޴��Դϴ�."); break;
		case 0 : System.out.println("����Ǿ����ϴ�."); break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�."); break;
		}
	}
}
