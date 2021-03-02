package main;

import java.util.Scanner;

import member.Member;

public class MainClass {
	public static void main(String[] args) { 		
	//kim -로그인 관련 기능
	//cho -회원 관리 기능
		System.out.println("main인 시작");
	Scanner sc=new Scanner(System.in);
	int num;
	while(true) {
		System.out.print("1.로그인 2.회원관리\n>>>");
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
