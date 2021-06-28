class B1{
	
	int i;//객체소속
	static int j;//클래스 소속

	void m(){
		i++;
		j++;
	}

	public static void main(String[] args) 
	{
		B1 b1 = new B1();//i 하나 j하나
		B1 b2 = new B1();//i 하나 j그대로
		B1 b3 = new B1();//i 하나 j그대로
						 // 즉 i는 2개 만들어짐 j는 1개임
		b1.m();//b1의 i가 ++됨 / j가 ++됨 -> i : 1 , j : 1
		b2.m();//b2의 i가 ++됨 / j가 ++됨 -> i : 1 , j : 2
		b3.m();//b2의 i가 ++됨 / j가 ++됨 -> i : 1 , j : 3

		System.out.println("b1.i : " +b1.i);//b1의 i는 1이기에 1이 출력됨
		System.out.println("b2.i : " +b2.i);//b2의 i는 1이기에 1이 출력됨
		System.out.println();
		System.out.println("b1.j : "+b1.j);
		System.out.println("b2.j : "+b2.j);
		System.out.println("B1.j : "+B1.j);
		System.out.println("j : "+j);

		
	}
}
