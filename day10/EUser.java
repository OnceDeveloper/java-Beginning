package aa.cc;

import aa.bb.E; //(1)Ŭ����

class EUser extends E
{
	EUser(){
		super(); //(2) ������
		System.out.println("i: " + i); //(3)��� 
		m(); //(4)�޼ҵ�
	}
	public static void main(String[] args) 
	{ 
		 new EUser();
	}
}
