package aa.cc;

import aa.bb.E; //(1)클래스

class EUser extends E
{
	EUser(){
		super(); //(2) 생성자
		System.out.println("i: " + i); //(3)멤버 
		m(); //(4)메소드
	}
	public static void main(String[] args) 
	{ 
		 new EUser();
	}
}
