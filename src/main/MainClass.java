package main;

import java.util.Scanner;

import member.Member;

public class MainClass {
	public static void main(String[] args) { 		
	//kim -�α��� ���� ���
	//cho -ȸ�� ���� ���
		System.out.println("main�� ����");
	Scanner sc=new Scanner(System.in);
	int num;
	while(true) {
		System.out.print("1.�α��� 2.ȸ������\n>>>");
		num =sc.nextInt();
		switch(num) {
		case 1:
			break;
		case 2:
			Member m =new Member();
			m.member();
			break;
	
		}
	}
	
	
	
	
	
	
	}
}
