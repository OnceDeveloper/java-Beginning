class B2{
	
	static int i;
	int j;

	void m(){
		i++;
		j++;
	}

	public static void main(String[] args) 
	{
		B2 b1 = new B2();//i는 하나 / j는 하나(1)
		B2 b2 = new B2();//i는 그대로(총1개) / j는 하나(총2개)

		b1.m();
		b2.m();
		
		System.out.println("b1.i: "+b1.i + ", b1.j : " +b1.j);
		System.out.println("b2.i: "+b2.i + ", b2.j : " +b2.j);
		System.out.println("B.i: "+B2.i);
		//i는 클래스 소속이라 딱 한 번만 만들어짐!!
		//j는 객체 소속이라 생성할때마다 계속 만들어짐!!
		//즉 2번생성했기 때문에 i는 1개 j는 2개가 만들어져있음!
		//b1의 i와 b2의 i는 같은 것이고, b1의 j와 b2의 j는 다른 것임.
	}
}
