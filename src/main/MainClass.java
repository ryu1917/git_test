package main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) { 		
	//kim -�α��� ���� ���
	//cho -ȸ�� ���� ���
		System.out.println("main�� ����");
	Scanner sc=new Scanner(System.in);
	int num;
	while(true) {
		System.out.println("1.�α��� 2.ȸ������\n>>>");
		num =sc.nextInt();
		switch(num) {
		case 1:
			Login lo=new Login();
			lo.login();
			break;
		case 2:
			break;
	
		}
	}
	
	
	
	
	
	
	}
}
